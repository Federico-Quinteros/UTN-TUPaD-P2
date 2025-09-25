/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

public class Actividad4 {

    public static void main(String[] args) {
        
        Gallina gallina1 = new Gallina();
        gallina1.idGallina = 101;
        gallina1.edad = 1;
        gallina1.huevosPuestos = 5;

        Gallina gallina2 = new Gallina();
        gallina2.idGallina = 102;
        gallina2.edad = 2;
        gallina2.huevosPuestos = 3;        

        gallina1.mostrarInfo();
        gallina2.mostrarInfo();  
        
        gallina1.envejecer();
        gallina1.ponerHuevos();
        gallina1.ponerHuevos();

        gallina2.envejecer();
        gallina2.envejecer();
        gallina2.ponerHuevos();      
        
        gallina1.mostrarInfo();
        gallina2.mostrarInfo();        
    }
    
}
