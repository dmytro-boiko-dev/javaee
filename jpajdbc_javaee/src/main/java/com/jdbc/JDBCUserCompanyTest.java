package com.jdbc;

import com.models.Company;
import com.models.User;

import java.sql.*;

public class JDBCUserCompanyTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");
        Connection connection = DriverManager.getConnection("jdbc:h2:file:D:/java/1 EE_materials/user_db/user_db_name", "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select u.id, u.name, c.address from USERS u " +
                " inner join COMPANY c " +
                " on u.company_id = c.id;");

        while(resultSet.next()){
            String id = resultSet.getString(1);
            String name = resultSet.getString(2);
            String address = resultSet.getString(3);

            Company company = new Company(0, address, "");
            User user = new User(Integer.valueOf(id), name, "", company);

            //String msg = String.format("id=%s; name=%s; address=%s", id, name, address);// %s - это дырка
            //System.out.println(msg);
            System.out.println(user);
        }

        /**
         * sql inject --> atack!
         * select * from users u inner join ... where u.password
         *
         *
         */




        //insert with parameters
//        PreparedStatement preparedStatement = connection.prepareStatement("insert into COMPANY(NAME, ADDRESS) VALUES (?, ?)");
//        preparedStatement.setString(1, "newCompanyName");
//        preparedStatement.setString(2, "address12341");
//        preparedStatement.executeUpdate();

    }
}
