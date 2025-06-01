import java.util.LinkedList;
public class ParteDos {
 public static void main(String[] args) {
 LinkedList<Alumno> listaAlumnos = new LinkedList<>();
 listaAlumnos.add(new Alumno("004", "María López", "20230004"));
 listaAlumnos.add(new Alumno("005", "Carlos Fernández", "20230005"));
 listaAlumnos.add(new Alumno("006", "Sofía Martínez", "20230006"));
 for (Alumno alumno : listaAlumnos) {
 System.out.println(alumno);
 }
 }
 static class Alumno {
 private String codigo;
 private String nombre;
 private String carnet;
 public Alumno(String codigo, String nombre, String carnet) {
 this.codigo = codigo;
 this.nombre = nombre;
 this.carnet = carnet;
 }
 @Override
 public String toString() {
 return "Alumno{" +
 "Código='" + codigo + '\'' +
 ", Nombre='" + nombre + '\'' +
 ", Carnet='" + carnet + '\'' +
 '}';
 }
 }
}
