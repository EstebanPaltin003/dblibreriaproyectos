package com.distribuida.principal;

import com.distribuida.model.Autor;
import com.distribuida.model.Libro;
import com.distribuida.model.Categoria;

public class LibroPrincipal {

    public static void main(String[] args) {

        // Crear el autor
        Autor autor = new Autor(1, "Gabriel García Márquez", "Colombiano");

        // Crear la categoría
        Categoria categoria = new Categoria(1, "Ciencia Ficción");

        // Crear el libro
        Libro libro = new Libro(1, "100 años de soledad", autor, categoria, 12.50);

        // Mostrar el libro
        System.out.println(libro.toString());
    }
}