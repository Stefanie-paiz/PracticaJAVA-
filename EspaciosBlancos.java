import java.util.Scanner;
public class EspaciosBlancos {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Ingresa una cadena:");
 String cadena = sc.nextLine();
 // Quitar todos los espacios
 String sinEspacios = cadena.replaceAll("\\s+", "");
 System.out.println("Cadena sin espacios: " + sinEspacios);

 sc.close();
 }
}
