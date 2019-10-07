package com.restapiproject.vehicles.common;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
@EnableJpaRepositories(basePackages = {"com.restapiproject.vehicles.dbl"})
public class DataAccessConfig {

    @Autowired
    private Environment env;

    @Value("${datasource.url}")
    private String dataSourceUrl;
    @Value("${datasource.username}")
    private String dataSourceUserName;
    @Value("${datasource.password}")
    private String dataSourcePassword;
//    @Value("${datasource_image.url}")
//    private String fileDataSourceUrl;
//    @Value("${datasource_image.username}")
//    private String fileDataSourceUserName;
//    @Value("${datasource_image.password}")
//    private String fileDataSourcePassword;

    @Primary
    @Bean
    public DataSource cumulusDataSource() {
        HikariConfig hc = new HikariConfig();
        hc.setDriverClassName(env.getProperty("datasource.driverClassName"));
        hc.setJdbcUrl(env.getProperty("datasource.url"));
        hc.setUsername(env.getProperty("datasource.username"));
        hc.setPassword(env.getProperty("datasource.password"));
        hc.setConnectionTestQuery("SELECT 1 FROM RDB$DATABASE");
        hc.setConnectionTimeout(2500);
        hc.setMaximumPoolSize(25);

        HikariDataSource ds = new HikariDataSource(hc);
        return ds;
    }

//    @Bean
//    public DataSource cumulusDataSourceForImage() {
//        HikariConfig hc = new HikariConfig();
//        hc.setDriverClassName(env.getProperty("datasource.driverClassName"));
//        hc.setJdbcUrl(env.getProperty("datasource_image.url"));
//        hc.setUsername(env.getProperty("datasource_image.username"));
//        hc.setPassword(env.getProperty("datasource_image.password"));
//        hc.setConnectionTestQuery("SELECT 1 FROM RDB$DATABASE");
//        hc.setConnectionTimeout(2500);
//        hc.setMaximumPoolSize(25);
//
//        HikariDataSource ds = new HikariDataSource(hc);
//        return ds;
//    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(cumulusDataSource())
                .packages("com.restapiproject.vehicles.dbo.entity")
                .build();
    }

    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);
        return transactionManager;
    }

//    @Bean
//    public UserConfiguration userConfiguration() {
//        UserConfiguration userConfiguration = new UserConfiguration();
//
//        userConfiguration.setDataSourceUrl(dataSourceUrl);
//        userConfiguration.setDataSourceUserName(dataSourceUserName);
//        userConfiguration.setDataSourcePassword(dataSourcePassword);
//        userConfiguration.setFileDataSourceUrl(dataSourceUrl);
//        userConfiguration.setFileDataSourceUserName(fileDataSourceUserName);
//        userConfiguration.setFileDataSourcePassword(fileDataSourcePassword);
//
//        return userConfiguration;
//    }

//    @Bean
//    public String propertySignUp() {
//        return env.getProperty("is_sign_up_available");
//    }
}
