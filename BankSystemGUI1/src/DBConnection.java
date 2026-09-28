
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author hezekiahmagalona
 */
public class DBConnection {

    private static final String URL =
            "jdbc:sqlserver://localhost:1433;databaseName=master;encrypt=true;trustServerCertificate=true;";
    private static final String USER = "SA";
    private static final String PASSWORD = "Anolagam28";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

