package lista2;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String nome = scan.nextLine();
        String funcao = scan.nextLine();
        double salario = scan.nextDouble();
        
        Funcionario funcionarioUm = new Funcionario(nome, funcao, salario);
        
        
    }
}
