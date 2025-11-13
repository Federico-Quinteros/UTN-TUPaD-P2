/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico6;

import java.util.*;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros; 

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(libro);
        System.out.println(" Libro agregado: '" + titulo + "'");
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("️ La biblioteca '" + nombre + "' no tiene libros.");
            return;
        }
        System.out.println("\n--- LIBROS EN LA BIBLIOTECA: " + nombre + " ---");
        libros.forEach(Libro::mostrarInfo);
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public void eliminarLibro(String isbn) {
        Libro libro = buscarLibroPorIsbn(isbn);
        if (libro != null) {
            libros.remove(libro);
            System.out.println("️ Libro eliminado: '" + libro.getTitulo() + "'");
        } else {
            System.out.println(" Libro con ISBN '" + isbn + "' no encontrado.");
        }
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("\n--- LIBROS PUBLICADOS EN " + anio + " ---");
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("️ No hay libros publicados en " + anio);
        }
    }

    public void mostrarAutoresDisponibles() {
        Set<Autor> autores = new HashSet<>();
        for (Libro libro : libros) {
            autores.add(libro.getAutor());
        }

        System.out.println("\n--- AUTORES DISPONIBLES EN LA BIBLIOTECA ---");
        if (autores.isEmpty()) {
            System.out.println("️ No hay autores registrados.");
            return;
        }
        autores.forEach(Autor::mostrarInfo);
    }
}