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
public class Actividad4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Ingrese el precio del producto: ");
       double precio = scanner.nextDouble(); 

       System.out.print("Ingrese la categoría del producto (A, B o C): ");
       char categoria = scanner.next().toUpperCase().charAt(0);  
       
       double descuento = 0;
       
       if (categoria == 'A'){
           descuento = 0.10;            
       }else if (categoria == 'B'){
           descuento = 0.15;  
       }else if (categoria == 'C'){
           descuento = 0.20;
       }else{
           System.out.print("Ingrese una categoría válida! ");
       }
       
       double montoDescuento = precio * descuento;
       double precioFinal = precio  - montoDescuento;
       System.out.print("Precio " + precio + " - descuento 10% = " + precioFinal);
    }
    
}
