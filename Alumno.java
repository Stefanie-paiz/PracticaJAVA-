import java.util.ArrayList;
public class Alumno  {
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
