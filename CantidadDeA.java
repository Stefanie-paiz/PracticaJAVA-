import java.util.Scanner;
public class CantidadDeA {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Ingresa una frase:");
 String frase = sc.nextLine();
 int contadorA = 0;
 for (int i = 0; i < frase.length(); i++) {
 if (Character.toLowerCase(frase.charAt(i)) == 'a') {
 contadorA++;
 }
 }
 System.out.println("La vocal 'A' aparece " + contadorA + " veces.");
 sc.close();
 }
}
 