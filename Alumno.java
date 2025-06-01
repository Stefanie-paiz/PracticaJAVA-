import java.util.ArrayList;
public class Alumno {
 private String codigo;
 private String nombre;
 private String carnet;
 public Alumno(String codigo, String nombre, String carnet) {
 this.codigo = codigo;
 this.nombre = nombre;
 this.carnet = carnet;
 }
 public String getCodigo() {
 return codigo;
 }
 public String getNombre() {
 return nombre;
 }
 public String getCarnet() {
 return carnet;
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
public class Ejercicio2 {
 public static void main(String[] args) {
 ArrayList<Alumno> listaAlumnos = new ArrayList<>();
 listaAlumnos.add(new Alumno("001", "Juan Pérez", "20230001"));
 listaAlumnos.add(new Alumno("002", "Ana Gómez", "20230002"));
 listaAlumnos.add(new Alumno("003", "Luis Ramírez", "20230003"));
 for (Alumno alumno : listaAlumnos) {System.out.println(alumno);
 }
 }
}