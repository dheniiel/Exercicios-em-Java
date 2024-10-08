package lista2;

public class Funcionario {
    private String nome;
    private String funcao;
    private double salario;
    
    Funcionario(String nome, String funcao, double salario){
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario; 
    }
    public double promoverSalario(double promocao){
        this.salario += promocao;
        return this.salario;
    }
    public double cacularSalario(){
        return this.salario * 12;
    }
}
