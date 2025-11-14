/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.práctico.pkg7;

import java.util.ArrayList;
import java.util.List;

public class Kata2_empleado {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Ana", 3000.0));
        empleados.add(new EmpleadoTemporal("Carlos", 160, 15.0));
        empleados.add(new EmpleadoPlanta("Laura", 3500.0));
        empleados.add(new EmpleadoTemporal("Diego", 120, 20.0));

        for (Empleado emp : empleados) {
            System.out.printf("%s → Sueldo: $%.2f", emp.getNombre(), emp.calcularSueldo());
            
            if (emp instanceof EmpleadoPlanta) {
                System.out.println(" (Planta)");
            } else if (emp instanceof EmpleadoTemporal) {
                System.out.println(" (Temporal)");
            }
        }
    }
}
