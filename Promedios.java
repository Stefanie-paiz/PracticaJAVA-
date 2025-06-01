import java.util.ArrayList;
import java.util.Scanner;
public class Promedios {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 ArrayList<Double> numeros = new ArrayList<>();
 String opcion;
 int positivos = 0;
 double suma = 0;
 do {
 System.out.println("Ingresa un valor numérico:");
 double num = sc.nextDouble();
 numeros.add(num);
 if (num > 0) {
 positivos++;
 }
 suma += num;
 System.out.println("¿Deseas agregar otro número? (s/n):");
 opcion = sc.next();
 } while (opcion.equalsIgnoreCase("s"));
 if (numeros.size() > 0) {
 double promedio = suma / numeros.size();
 System.out.println("Promedio: " + promedio);
 System.out.println("Cantidad de números positivos: " + positivos);
 } else {
 System.out.println("No se ingresaron números.");
 }
 sc.close();
 