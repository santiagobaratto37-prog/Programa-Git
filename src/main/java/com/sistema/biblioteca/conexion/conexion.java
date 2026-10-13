package com.sistema.biblioteca.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/biblioteca";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection conectar() {

        try {

            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

            System.out.println("Conexión exitosa");

            return con;

        } catch (SQLException e) {

            System.out.println("Error de conexión");
            e.printStackTrace();

            return null;
        }

    }

}