package com.cumulus.config;


import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@PropertySource("classpath:config/application.properties")
@EnableJpaRepositories(basePackages = {"com.cumulus.dbl"})
public class DataAccessConfig {

    @Autowired
    private Environment environment;

    @Primary
    @Bean
    public DataSource dataSource() {
        HikariConfig hc = new HikariConfig();
        hc.setDriverClassName(environment.getProperty("datasource.driverClassName"));
        hc.setJdbcUrl(environment.getProperty("datasource.url"));
        hc.setUsername(environment.getProperty("datasource.username"));
        hc.setPassword(environment.getProperty("datasource.password"));
        hc.setConnectionTestQuery("SELECT 1 FROM RDB$DATABASE");
        hc.setConnectionTimeout(2500);
        hc.setMaximumPoolSize(25);

        HikariDataSource ds = new HikariDataSource(hc);
        return ds;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder) {
        return builder.dataSource(dataSource()).packages("com.cumulus.dbl.entity").build();
    }

    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);
        return transactionManager;
    }
}
