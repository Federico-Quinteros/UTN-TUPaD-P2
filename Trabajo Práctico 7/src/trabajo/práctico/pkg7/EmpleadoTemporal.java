/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.práctico.pkg7;

class EmpleadoTemporal extends Empleado {
    private double horasTrabajadas;
    private double tarifaHora;

    public EmpleadoTemporal(String nombre, double horas, double tarifa) {
        super(nombre);
        this.horasTrabajadas = horas;
        this.tarifaHora = tarifa;
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * tarifaHora;
    }
}