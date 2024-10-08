package lista1;
import java.util.Scanner;
import java.lang.String;

public class Email {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nomeUsu = scan.nextLine();
      
        System.out.println(nomeUsu.trim().replaceAll("\\s+", "").toLowerCase() + "@gmail.com");
    }
}
