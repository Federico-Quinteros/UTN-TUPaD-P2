/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico6;
import java.util.*;

public class caso2 {
    public static void main(String[] args) {
    
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        
        Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("A002", "Isabel Allende", "Chilena");
        Autor autor3 = new Autor("A003", "Mario Vargas Llosa", "Peruana");

      
        biblioteca.agregarLibro("978-3-16-148410-0", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("978-0-14-103243-6", "El amor en los tiempos del cólera", 1985, autor1);
        biblioteca.agregarLibro("978-84-397-1234-5", "La casa de los espíritus", 1982, autor2);
        biblioteca.agregarLibro("978-84-9759-000-1", "Paula", 1994, autor2);
        biblioteca.agregarLibro("978-84-376-0500-2", "La ciudad y los perros", 1963, autor3);

        
        biblioteca.listarLibros();

        
        System.out.println("\n Buscando libro con ISBN '978-0-14-103243-6':");
        Libro libroBuscado = biblioteca.buscarLibroPorIsbn("978-0-14-103243-6");
        if (libroBuscado != null) {
            libroBuscado.mostrarInfo();
        } else {
            System.out.println(" No encontrado.");
        }

      
        biblioteca.filtrarLibrosPorAnio(1982);

        
        System.out.println("\n️ Eliminando libro con ISBN '978-84-9759-000-1' (Paula)...");
        biblioteca.eliminarLibro("978-84-9759-000-1");
        System.out.println("️ Libros restantes:");
        biblioteca.listarLibros();

        
        System.out.println("\n Total de libros en la biblioteca: " + biblioteca.obtenerCantidadLibros());

        
        biblioteca.mostrarAutoresDisponibles();

        
    }
}