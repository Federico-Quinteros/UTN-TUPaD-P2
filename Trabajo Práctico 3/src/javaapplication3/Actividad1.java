/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

public class Actividad1 {


    public static void main(String[] args) {
        
        Estudiante est1 = new Estudiante();
        est1.nombre = "Federico ";
        est1.apellido = "Quinteros";
        est1.curso = "Programación 1";
        est1.calificacion = 8;
        
        est1.mostrarInfo();
        est1.subirCalificacion(2);
        est1.mostrarInfo();
        est1.bajarCalificacion(3);
        est1.mostrarInfo();
        
    }
    
}
