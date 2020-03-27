package alunos;

public class Alunos {
    private String nome;
    private int matricula;
    private String curso;
    
    public Alunos(String nome,int matricula,String curso){
        this.nome=nome;
        this.matricula=matricula;
        this.curso=curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    /*
    public String toString() {
        return "Nome aluno=" + this.nome + ", Matricula=" + this.matricula + ", Curso=" + this.curso ;
    }*/
}
