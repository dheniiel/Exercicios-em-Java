package exercicioaula;
import java.util.Scanner;

public class Aluno {
    private int codigo;
    private String nome;
    private String endereco;
    
    Aluno(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }       
    
    public int inserirDados(){    
       return this.codigo;
    }
    public int getMostrarCodigo(){
        return this.codigo;
    };
    public String getMostrarNome(){
        return this.nome;
    };
    
        
}   
