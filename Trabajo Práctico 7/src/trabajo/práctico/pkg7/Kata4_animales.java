/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.práctico.pkg7;
import java.util.Arrays;
import java.util.List;

public class Kata4_animales {
    public static void main(String[] args) {
        List<Animal> animales = Arrays.asList(
            new Perro(),
            new Gato(),
            new Vaca(),
            new Perro()
        );

        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();
            System.out.println("---");
        }
    }
}