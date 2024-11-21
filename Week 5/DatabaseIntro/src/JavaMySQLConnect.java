package javamysqlconnect;

import java.sql.*;

public class JavaMySQLConnect {

    public static void main(String[] args) {
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "sqlpassword123");//Establishing connection
            System.out.println("Connected With the database successfully");
            //Using SQL UPDATE query to update data in the table
            PreparedStatement preparedStatement =connection.prepareStatement("update Student set CITY=? where ROLLNO=?");

            //Updating Value
            preparedStatement.setString(1,"Delhi");
            preparedStatement.setString(2,"1");


            //Executing Query
            preparedStatement.executeUpdate();
            System.out.println("Data Updated Successfully");


        } catch (SQLException e) {

            System.out.println("Error while connecting to the database");

        }
    }

}