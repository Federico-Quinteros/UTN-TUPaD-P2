/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

public class NaveEspacial {
    
    String nombre;
    int combustible;
    
    void despegar(){
        System.out.println("La nave ha despegado!");
    }
    void avanzar(){
        if (combustible > 0){
        System.out.println("La nave avanza!");
        }else{
        System.out.println("La nave no tiene suficiente combustible, debes recargar para poder avanzar!");
        }
    }
    void recargarCombustible(int cantidad){
        if(combustible + cantidad <= 50){
        combustible = combustible + cantidad;
        System.out.println("El combustible se ha cargado correctamente!");
        }else{
        System.out.println("No es posible cargar esa cantidad de combustible!");
        }
    }
    void mostrarEstado(){
        System.out.println("La nave "+ nombre + ", tiene " + combustible +" combustible!" );
    }    
}
