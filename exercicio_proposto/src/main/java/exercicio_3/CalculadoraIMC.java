package exercicio_3;

import java.util.Scanner;
import java.lang.Math;

public class CalculadoraIMC {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o nome: ");
        String nome = scan.nextLine();

        System.out.println("Digite o peso: (em Kg)");
        float peso = scan.nextFloat();

        System.out.println("Digite a altura: (em cm)");
        float altura = scan.nextFloat();
        
        double imc = peso / Math.pow(altura, 2);
        scan.close();

        System.out.println("\n\n" + nome + "\npeso = " + peso + "\naltura = " + altura + "\nimc = " + imc);
    }
}
