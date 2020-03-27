
package biblioteca;

public class Biblioteca {
    private String titulo_livro;
    private String isbn;
    private int matriculaaluno;
    
    public Biblioteca(int matriculaaluno, String titulo, String isbn){
        setTitulo_livro(titulo);
        setIsbn(isbn);
        setMatriculaaluno(matriculaaluno);
    }

    public String getTitulo_livro() {
        return titulo_livro;
    }

    public void setTitulo_livro(String titulo_livro) {
        this.titulo_livro = titulo_livro;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getMatriculaaluno() {
        return matriculaaluno;
    }

    public void setMatriculaaluno(int matriculaaluno) {
        this.matriculaaluno = matriculaaluno;
    }
    
}
