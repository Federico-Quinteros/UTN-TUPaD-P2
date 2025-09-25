/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

public class Estudiante{
        
    String nombre;
    String apellido;
    String curso;
    int calificacion;
    
    void mostrarInfo(){
        
        System.out.println("Nombre y apellido: " + nombre + apellido + ", curso: "+ curso + ", califiación :"+ calificacion);
        
    }
    void subirCalificacion(int puntos) {
 
        calificacion = calificacion + puntos;
        
    }    
    void bajarCalificacion(int puntos) {
        
        calificacion = calificacion - puntos;
    
    }    
        
}
