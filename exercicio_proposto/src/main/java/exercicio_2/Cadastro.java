package exercicio_2;

import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = scan.nextLine();

        System.out.println("Digite o endereço:");
        String endereco = scan.nextLine();

        System.out.println("Digite o telefone:");
        int telefone = scan.nextInt();

        scan.close();

        System.out.println(nome + ", " + endereco + ", " + telefone);
    }
}
