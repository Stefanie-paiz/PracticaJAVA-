import java.util.Scanner;
import java.util.TreeSet;
public class MultiplesValores {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 TreeSet<Double> numeros = new TreeSet<>();
 String opcion;
 do {
 System.out.println("Ingresa un número:");
 double num = sc.nextDouble();
 numeros.add(num);
 System.out.println("¿Deseas ingresar otro número? (s/n):");
 opcion = sc.next();
 } while (opcion.equalsIgnoreCase("s"));
 System.out.println("Números ordenados de menor a mayor:");
 for (double n : numeros) {
 System.out.println(n);
 }
 sc.close();
 }
}
