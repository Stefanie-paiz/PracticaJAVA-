import java.util.Scanner;
public class palíndroma{
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Ingresa una palabra:");
 String palabra = sc.nextLine().toLowerCase();
 StringBuilder invertida = new StringBuilder(palabra).reverse();
 if (palabra.equals(invertida.toString())) {
 System.out.println("La palabra es palíndroma.");
 } else {
 System.out.println("La palabra no es palíndroma.");
 }
 sc.close();
 }
}