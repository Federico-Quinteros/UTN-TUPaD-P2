/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.práctico.pkg4;


public class CasoPrueba {

    public static void main(String[] args) {
    
        Empleado emp1 = new Empleado(1, "Federico Quinteros", "CEO", 500000);
        Empleado emp2 = new Empleado("Agostina Brutti", "Proyect Owner");
        Empleado emp3 = new Empleado("Patricia Miguez", "Developer");

        emp1.actualizarSalario(10);   
        emp2.actualizarSalario(200000); 
        emp3.actualizarSalario(5);    

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);

        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }    
    
    
}
