package exercicio_1;
import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = scan.nextInt();

        System.out.println("Digite o segundo número");
        int numero2 = scan.nextInt();
        
        int  numero3 = numero1 + numero2;
        
        scan.close();

        System.out.println(numero3);
    } 
}