import java.util.ArrayList;

public class MainAlumno {
    public static void main(String[] args) {
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(new Alumno("001", "Juan Pérez", "20230001"));
        listaAlumnos.add(new Alumno("002", "Ana Gómez", "20230002"));
        listaAlumnos.add(new Alumno("003", "Luis Ramírez", "20230003"));

        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
    }
}