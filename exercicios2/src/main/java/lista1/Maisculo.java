package lista1;
import java.util.Scanner;

public class Maisculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nomeUsuario = scan.nextLine();
        
        System.out.println(nomeUsuario.toUpperCase());
    }
}
