package com.sistema.biblioteca;

import com.sistema.biblioteca.dao.librodao;
import com.sistema.biblioteca.modelo.libro;

public class SistemaBiblioteca {

    public static void main(String[] args) {

        libro libro = new libro();

        libro.setTitulo("El Principito");
        libro.setAutor("Antoine de Saint-Exupéry");
        libro.setStock(10);
        libro.setIdCategoria(1);

        librodao dao = new librodao();
        dao.guardarLibro(libro);

    }

}