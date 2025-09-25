/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

public class Actividad5 {

    public static void main(String[] args) {

        NaveEspacial nave1 = new NaveEspacial();
        nave1.nombre = "Apolo";
        nave1.combustible = 0;
        
        nave1.despegar();
        nave1.avanzar();
        nave1.recargarCombustible(55);
        nave1.recargarCombustible(50);
        nave1.avanzar();
        nave1.mostrarEstado();
    }
    
}
