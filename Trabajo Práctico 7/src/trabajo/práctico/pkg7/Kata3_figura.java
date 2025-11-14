/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.práctico.pkg7;


public class Kata3_figura {
    public static void main(String[] args) {
        Figura[] figuras = {
            new Circulo(5),
            new Rectangulo(4, 6),
            new Circulo(3)
        };

        for (Figura f : figuras) {
            System.out.printf("%s → Área: %.2f%n", f.getNombre(), f.calcularArea());
        }
    }
}