import java.util.Scanner;
public class CantidadFrases{
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Ingresa una frase:");
 String frase = sc.nextLine();
 // Separa por espacios para contar palabras
 String[] palabras = frase.trim().split("\\s+");
 System.out.println("Cantidad de palabras: " + palabras.length);

 sc.close();
 }
}
