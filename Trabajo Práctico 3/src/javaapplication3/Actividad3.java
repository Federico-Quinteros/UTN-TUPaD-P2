/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.HashSet;
import java.util.Set;

public class Actividad3 {

    public static void main(String[] args) {

        Libro libro1 = new Libro();
        libro1.setTitulo("El libro de la Selva");
        libro1.setAutor("Pepe Argento");
        libro1.setAnioPublicacion(2027);
        libro1.mostrarInfo();
        libro1.setAnioPublicacion(2022);
        libro1.mostrarInfo();
    }
    
}
