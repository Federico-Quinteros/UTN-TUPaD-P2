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
public class Actividad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Ingrese el primer número: ");
       int num1 = scanner.nextInt();
  
       System.out.print("Ingrese el segundo número: ");
       int num2 = scanner.nextInt();

       System.out.print("Ingrese el tercer número: ");
       int num3 = scanner.nextInt();   
       
       int numMayor;
       
       if ((num1 > num2) && (num1 > num3)){
           numMayor = num1;
       } else if ((num2 > num1) && (num2 > num3)){
           numMayor = num2;
       } else {
           numMayor = num3;
       }
       System.out.println("El número mayor es " + numMayor);
       }
       
}
