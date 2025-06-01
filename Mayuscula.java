import java.util.Scanner;
public class Mayuscula {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Ingresa una frase:");
 String frase = sc.nextLine();
 // Convertir en arreglo de caracteres
 char[] caracteres = frase.toCharArray();
 // Poner en mayúscula la primera letra
 if (caracteres.length > 0 && Character.isLetter(caracteres[0])) {
 caracteres[0] = Character.toUpperCase(caracteres[0]);
 }
 // Convertir a String y hacer la transformación después de cada espacio
 String resultado = new String(caracteres);
 String[] palabras = resultado.split(" ");
 for (int i = 1; i < palabras.length; i++) {
 if (palabras[i].length() > 0 && Character.isLetter(palabras[i].charAt(0))) {
 palabras[i] = Character.toUpperCase(palabras[i].charAt(0)) +
palabras[i].substring(1);
 }
 }
 String finalTexto = String.join(" ", palabras);
 System.out.println("Resultado: " + finalTexto);
 sc.close();
 }
}
