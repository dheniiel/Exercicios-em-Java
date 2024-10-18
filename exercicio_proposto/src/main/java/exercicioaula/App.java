package exercicioaula;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Aluno[] aluno = new Aluno[3];
        Curso[] curso = new Curso[3];
        
        for (int i = 0; i < 3; i++){
            System.out.println("Digite o código do aluno");
            int codigo = scan.nextInt();
            scan.nextLine();
            System.out.println("Digite o nome do aluno:");
            String nome = scan.nextLine();
                        
            aluno[i] = new Aluno(codigo, nome);
            
            System.out.println("Digite o nome curso: ");
            String nomeCurso = scan.nextLine();
            
            System.out.println("Digite a duração do curso:");
            String duracaoCurso = scan.nextLine(); 
            
            curso[i] = new Curso(nomeCurso, duracaoCurso);
            
            System.out.println("\n\n\n");
        }
        for(int i = 0; i < 3; i++){
            System.out.println("O aluno: " + aluno[i].getMostrarNome() + ", de código: " + aluno[i].getMostrarCodigo());
            System.out.println("Faz o curso: " + curso[i].getMostrarCurso() + ", de duração: " + curso[i].getMostrarDuracao() + "\n" );

        }
              
    }           
}
