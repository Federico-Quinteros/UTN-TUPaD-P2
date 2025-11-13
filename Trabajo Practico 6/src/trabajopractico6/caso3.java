/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico6;

public class caso3 {
    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Nacional de Tecnología");

        Profesor p1 = new Profesor("P001", "Dra. Ana López", "Matemáticas");
        Profesor p2 = new Profesor("P002", "Ing. Carlos Méndez", "Programación");
        Profesor p3 = new Profesor("P003", "Lic. Sofía Ramírez", "Base de Datos");

        Curso c1 = new Curso("MAT101", "Álgebra Lineal");
        Curso c2 = new Curso("PRO102", "Programación I");
        Curso c3 = new Curso("PRO203", "Programación II");
        Curso c4 = new Curso("BD301", "Base de Datos I");
        Curso c5 = new Curso("BD402", "Base de Datos II");

        System.out.println(" Agregando profesores y cursos...");
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        System.out.println("\n Asignando profesores a cursos...");
        uni.asignarProfesorACurso("MAT101", "P001");
        uni.asignarProfesorACurso("PRO102", "P002");
        uni.asignarProfesorACurso("PRO203", "P002");
        uni.asignarProfesorACurso("BD301", "P003");
        uni.asignarProfesorACurso("BD402", "P003");

        uni.listarCursos();
        uni.listarProfesores();
        System.out.println("\n--- Detalle por profesor ---");
        p1.listarCursos();
        p2.listarCursos();
        p3.listarCursos();

        System.out.println("\n Cambiando profesor de 'PRO102' a Dra. Ana López...");
        uni.asignarProfesorACurso("PRO102", "P001");

        System.out.println("\n Verificación post-cambio:");
        c2.mostrarInfo(); 
        p1.listarCursos(); 
        p2.listarCursos(); 

        System.out.println("\n️ Eliminando curso 'MAT101'...");
        uni.eliminarCurso("MAT101");
        p1.listarCursos();

        System.out.println("\n Eliminando profesor 'P002' (Carlos Méndez)...");
        uni.eliminarProfesor("P002");
        uni.listarCursos(); 

        uni.mostrarReporteCursosPorProfesor();
    }
}