/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico6;
import java.util.*;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos; 

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    // Getters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public List<Curso> getCursos() { return Collections.unmodifiableList(cursos); } // inmutable para seguridad

    void agregarCursoInterno(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
        }
    }

    void eliminarCursoInterno(Curso curso) {
        cursos.remove(curso);
    }

    public void listarCursos() {
        System.out.println(" Cursos de " + nombre + ":");
        if (cursos.isEmpty()) {
            System.out.println("  → Ninguno.");
        } else {
            cursos.forEach(c -> System.out.println("  - [" + c.getCodigo() + "] " + c.getNombre()));
        }
    }

    public void mostrarInfo() {
        System.out.printf(" Profesor[ID: %s] → Nombre: %s | Especialidad: %s | Cursos: %d%n",
                id, nombre, especialidad, cursos.size());
    }
}