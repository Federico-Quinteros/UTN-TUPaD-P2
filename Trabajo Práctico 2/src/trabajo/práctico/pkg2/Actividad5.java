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
public class Actividad5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = 1;
        int contador = 0;
        
        while (num != 0){
        System.out.print("Ingrese un número: ");
        num = scanner.nextInt();
        if (num % 2 == 0 ){
            contador += num;           
            }
                     
        }
        System.out.print("La suma de los números pares es igual a: "+ contador);  
    }
    
}
