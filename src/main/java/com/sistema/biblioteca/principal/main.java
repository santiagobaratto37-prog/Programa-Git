package com.sistema.biblioteca.principal;

import com.sistema.biblioteca.dao.librodao;
import com.sistema.biblioteca.modelo.libro;

public class main {

    public static void main(String[] args) {

        libro libro1 = new libro();

        libro1.setTitulo("Java desde cero");
        libro1.setAutor("Santiago");
        libro1.setStock(10);
        libro1.setIdCategoria(1);

        librodao dao = new librodao();

        dao.guardarLibro(libro1);

    }

}