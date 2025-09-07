/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.práctico.pkg2;
import java.util.Scanner;
/**
 *
 * @author fedeq
 */
public class Actividad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       System.out.print("Ingrese su edad: ");
       int edad = scanner.nextInt();        
       
       if ((edad < 12) && (edad > 0)){
           System.out.print("Eres un niño");
       } else if ((edad >= 12) && (edad <= 17)){
           System.out.print("Eres un adolescente");
       } else if ((edad >= 18) && (edad <= 59)){
           System.out.print("Eres un adulto");
       } else if (edad >= 60){
           System.out.print("Eres un adulto mayor");
       }  else {
           System.out.print("Ingrese una edad válida");
       }
    }
    
}
