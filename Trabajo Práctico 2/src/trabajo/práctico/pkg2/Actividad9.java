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
public class Actividad9 {

    public static double calcularCostoEnvio(double peso, String zona) {
        
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;  
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10; 
        } else {
            System.out.println("Zona inválida. Debe ser Nacional o Internacional.");
            return 0;
        }
    }
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
          
        return precioProducto + costoEnvio;
    }
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
       System.out.print("Ingrese el precio del producto: ");
       double precioProducto = scanner.nextDouble(); 

       System.out.print("Ingrese el peso del paquete en kg: ");
       double peso = scanner.nextDouble(); 
       
       scanner.nextLine();
       System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
       String zona = scanner.nextLine(); 
       
       double costoEnvio = calcularCostoEnvio(peso, zona);
       double totalCompra = calcularTotalCompra(precioProducto, costoEnvio);
            
       System.out.println("El costo de envío es: " + costoEnvio);
       System.out.println("El total a pagar es: " + totalCompra);
        
    }
    
}