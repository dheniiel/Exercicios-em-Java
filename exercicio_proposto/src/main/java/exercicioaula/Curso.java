package exercicioaula;

public class Curso {
    private String nomeCurso;
    private String duracaoCurso;
    
    Curso(String nomeCurso, String duracaoCurso){
        this.nomeCurso = nomeCurso;
        this.duracaoCurso = duracaoCurso;
    };
    public String getMostrarCurso(){
        return this.nomeCurso;
    };
    public String getMostrarDuracao(){
        return this.duracaoCurso;
    };
}
