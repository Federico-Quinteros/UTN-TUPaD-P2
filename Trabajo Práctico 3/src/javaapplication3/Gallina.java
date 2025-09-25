/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;


public class Gallina {
    
    int idGallina;
    int edad;
    int huevosPuestos;
    
    void mostrarInfo(){
        
        System.out.println("IDGallina: " + idGallina + ", edad: "+ edad + ", huevos puesto:"+ huevosPuestos);        
    }
    void envejecer() {
        edad ++;         
    }     
    void ponerHuevos() {
        huevosPuestos ++;         
    }     
}
