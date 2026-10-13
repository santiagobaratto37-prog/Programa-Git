package com.sistema.biblioteca.dao;

import com.sistema.biblioteca.conexion.conexion;
import com.sistema.biblioteca.modelo.libro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class librodao {

    public void guardarLibro(libro libro) {

        String sql = "INSERT INTO libros (titulo, autor, stock, id_categoria) VALUES (?, ?, ?, ?)";

        try {

            Connection con = conexion.conectar();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, libro.getTitulo());
            ps.setString(2, libro.getAutor());
            ps.setInt(3, libro.getStock());
            ps.setInt(4, libro.getIdCategoria());

            ps.executeUpdate();

            System.out.println("Libro guardado correctamente.");

            con.close();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

}
