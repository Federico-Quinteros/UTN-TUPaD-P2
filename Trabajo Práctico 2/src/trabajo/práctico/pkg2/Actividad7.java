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
public class Actividad7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        do{  
            
        System.out.println("Ingrese una nota (0-10):");
        nota = scanner.nextInt();
          
        }while((nota < 0) || (nota > 10));

        System.out.println("Nota guardada correctamente.");
  }
}
