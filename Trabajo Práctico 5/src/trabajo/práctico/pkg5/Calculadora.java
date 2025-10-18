/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.práctico.pkg5;

public class Calculadora {
    public void calcular(Impuesto impuesto) {
        double resultado = impuesto.getMonto() * 0.21; 
        System.out.println("Calculando impuesto para: " + impuesto.getContribuyente().getNombre());
        System.out.println("Monto base: $" + impuesto.getMonto());
        System.out.println("IVA (21%): $" + resultado);
        System.out.println("Total a pagar: $" + (impuesto.getMonto() + resultado));
    }    
}
