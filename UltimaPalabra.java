import java.util.Scanner;
public class UltimaPalabra{
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Ingresa una frase:");
 String frase = sc.nextLine();
 String[] palabras = frase.trim().split("\\s+");
 if (palabras.length > 0) {
 StringBuilder nuevaFrase = new StringBuilder();
 for (int i = 0; i < palabras.length - 1; i++) {
 nuevaFrase.append(palabras[i]).append(" ");
 }
 System.out.println("Frase sin la última palabra: " +
nuevaFrase.toString().trim());
 } else {
 System.out.println("La frase está vacía.");
 }
 sc.close();
 }
}
