package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    private static String DATABASE_URL = "jdbc:mysql://localhost:3306/bancoteste";

    private static String USER = "root";

    private static String PASSWORD = "lermen12";

    public static Connection createConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        return connection;
    }
}
