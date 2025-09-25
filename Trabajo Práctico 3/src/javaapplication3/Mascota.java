/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;


public class Mascota {

    String nombre;
    String especie;
    int edad;
    
    void mostrarInfo(){
        
        System.out.println("Nombre " + nombre + ", especie: "+ especie + ", edad :"+ edad);
        
    }
    void cumplirAnios() {
 
        edad ++;
         
    }   
}
