package exercicio_4;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Conta conta1 = new Conta();

        conta1.nomeProprietario = "Dheniel";

        System.out.println("Digite o valor a ser sacado: ");
        double saque = scan.nextDouble();

        System.out.println("Digite o valor a ser depositado: ");
        double deposito = scan.nextDouble();

        conta1.saldo = 100;
        conta1.limite = 50;

        boolean retornoSaque = conta1.sacar(saque);
        boolean retornoDeposito = conta1.depositar(deposito);

        if (retornoSaque == true && retornoDeposito == true) {
            System.out.println("Saque e deposito efetivado com sucesso!");
        } else if (retornoSaque == true && retornoDeposito == false) {
            System.out.println("Saque realizado e deposito não realizado!");
        } else if (retornoSaque == false && retornoDeposito == true) {
            System.out.println("Saque não realizado e deposito realizado!");
        } else {
            System.out.println("Nenhuma das operações foram feitas!");
        }

        System.out.println(conta1.nomeProprietario + " seu salde é de: " + conta1.saldo);
    }
}
