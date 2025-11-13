/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico6;
import java.util.*;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) {
        if (buscarProfesorPorId(p.getId()) != null) {
            System.out.println("️ Profesor con ID '" + p.getId() + "' ya existe.");
            return;
        }
        profesores.add(p);
        System.out.println(" Profesor agregado: " + p.getNombre());
    }

    public void agregarCurso(Curso c) {
        if (buscarCursoPorCodigo(c.getCodigo()) != null) {
            System.out.println(" Curso con código '" + c.getCodigo() + "' ya existe.");
            return;
        }
        cursos.add(c);
        System.out.println(" Curso agregado: " + c.getNombre());
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso == null) {
            System.out.println(" Curso con código '" + codigoCurso + "' no encontrado.");
            return;
        }
        if (profesor == null) {
            System.out.println(" Profesor con ID '" + idProfesor + "' no encontrado.");
            return;
        }

        curso.setProfesor(profesor); 
    }

    public void listarProfesores() {
        System.out.println("\n--- PROFESORES EN " + nombre.toUpperCase() + " ---");
        if (profesores.isEmpty()) {
            System.out.println("️ No hay profesores registrados.");
        } else {
            profesores.forEach(Profesor::mostrarInfo);
        }
    }

    public void listarCursos() {
        System.out.println("\n--- CURSOS EN " + nombre.toUpperCase() + " ---");
        if (cursos.isEmpty()) {
            System.out.println("️ No hay cursos registrados.");
        } else {
            cursos.forEach(Curso::mostrarInfo);
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) return p;
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) return c;
        }
        return null;
    }

    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso == null) {
            System.out.println(" Curso con código '" + codigo + "' no encontrado.");
            return;
        }

        curso.setProfesor(null);

        cursos.remove(curso);
        System.out.println("️ Curso eliminado: " + curso.getNombre());
    }

    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor == null) {
            System.out.println(" Profesor con ID '" + id + "' no encontrado.");
            return;
        }

        List<Curso> copiaCursos = new ArrayList<>(profesor.getCursos());
        for (Curso curso : copiaCursos) {
            curso.setProfesor(null); 
        }

        profesores.remove(profesor);
        System.out.println("️ Profesor eliminado: " + profesor.getNombre());
    }

    public void mostrarReporteCursosPorProfesor() {
        System.out.println("\n REPORTE: Cursos por profesor");
        if (profesores.isEmpty()) {
            System.out.println("️ No hay profesores.");
            return;
        }
        for (Profesor p : profesores) {
            System.out.println( p.getNombre() + ": " + p.getCursos().size() + " curso(s)");
        }

        long sinProfesor = cursos.stream().filter(c -> c.getProfesor() == null).count();
        if (sinProfesor > 0) {
            System.out.println(" Cursos sin profesor: " + sinProfesor);
        }
    }
}