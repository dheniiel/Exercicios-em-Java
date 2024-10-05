package lista2;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o nome do funcionário: ");
        String nome = scan.nextLine();
        
        System.out.println("Digite a função do funcionário: ");
        String funcao = scan.nextLine();
        
        System.out.println("Digite o salario do funcionário: ");
        double salario = scan.nextDouble();
        
        Funcionario funcionarioUm = new Funcionario(nome, funcao, salario);
        
        System.out.println("Digite a promoção desejada do funcionário: ");
        double promocao = scan.nextDouble();
        funcionarioUm.promoverSalario(promocao);
        
        
    }
}
