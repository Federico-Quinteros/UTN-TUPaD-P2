/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.práctico.pkg2;
import java.util.Scanner;


public class Actividad11 {

    public static double descuentoEspecial = 0.10;
    
    public static double calcularDescuentoEspecial(double precio){
    
        double descuentoAplicado = precio * descuentoEspecial;
        return descuentoAplicado;
    }
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
       System.out.print("Ingrese el precio del producto: ");
       double precio = scanner.nextDouble(); 
       
       double descuentoAplicado = calcularDescuentoEspecial(precio);
       System.out.print("El descuento especial aplicado es: " + descuentoAplicado + "\n");
       System.out.print("El precio final con descuento es: " + (precio - descuentoAplicado)+ "\n");
       
    }
    
}
