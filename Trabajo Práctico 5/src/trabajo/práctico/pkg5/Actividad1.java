/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.práctico.pkg5;


public class Actividad1 {

    public static void main(String[] args) {
        Titular titular = new Titular("Juan Pérez", "40123456");
        Pasaporte pasaporte = new Pasaporte("AR1234567", "2023-06-10", "juan.jpg", "JPG");
        pasaporte.setTitular(titular);

        System.out.println(pasaporte);
        System.out.println("Titular del pasaporte: " + pasaporte.getTitular().getNombre());
        System.out.println("Pasaporte del titular: " + titular.getPasaporte().getNumero());
    }   
}
