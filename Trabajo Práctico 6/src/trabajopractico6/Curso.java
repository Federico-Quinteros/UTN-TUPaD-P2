/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico6;
import java.util.Objects;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor; 

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    public void setProfesor(Profesor nuevoProfesor) {
        if (this.profesor != null) {
            this.profesor.eliminarCursoInterno(this);
        }

        this.profesor = nuevoProfesor;

        if (this.profesor != null) {
            this.profesor.agregarCursoInterno(this);
        }

        String nombreProf = (nuevoProfesor != null) ? nuevoProfesor.getNombre() : "NINGUNO";
        System.out.println(" Curso [" + codigo + "] asignado a: " + nombreProf);
    }

    public void mostrarInfo() {
        String profNombre = (profesor != null) ? profesor.getNombre() : "Sin asignar";
        System.out.printf(" Curso[%s] → Nombre: %s | Profesor: %s%n",
                codigo, nombre, profNombre);
    }
}