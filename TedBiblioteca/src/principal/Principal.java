/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import alunos.Alunos;
import biblioteca.Biblioteca;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
               String nomealuno;
               int matriculaaluno;
               String matricula;
               String cursoaluno;
               String titulolivro;
               String isbnlivro;
               String pergunta;
               int resposta;
               String mensagem;
               ArrayList<Alunos> alunos=new ArrayList();
               ArrayList<Biblioteca> biblioteca=new ArrayList();
               
               pergunta=JOptionPane.showInputDialog("Deseja inserir quantos alunos?");
               resposta=Integer.parseInt(pergunta);
               for(int i=0;i<resposta;i++){
                    nomealuno=JOptionPane.showInputDialog("Insira o nome do aluno");
                    matricula=JOptionPane.showInputDialog("Insira a matricula do aluno (somente números)");
                    matriculaaluno=Integer.parseInt(matricula);
                    cursoaluno=JOptionPane.showInputDialog("Insira o curso do aluno");
                    Alunos aluno=new Alunos(nomealuno,matriculaaluno,cursoaluno);
                    alunos.add(aluno);
               }
               
               for (int i=0;i<1;i++){
                    matricula=JOptionPane.showInputDialog("Empréstimo de livros: Informe a matricula do aluno");
                    matriculaaluno=Integer.parseInt(matricula);
                    titulolivro=JOptionPane.showInputDialog("Informe o titulo do livro: ");
                    isbnlivro=JOptionPane.showInputDialog("Informe o ISBN do livro: ");
                    
                    Biblioteca livros=new Biblioteca(matriculaaluno,titulolivro,isbnlivro);
                    biblioteca.add(livros);
                    pergunta=JOptionPane.showInputDialog("Deseja inserir mais um empréstimo de livro?(1-sim | 2-Não)");
                    resposta=Integer.parseInt(pergunta);
                    if (resposta==1){ i--; }
               }
               mensagem="";
               for (Alunos a:alunos){
                   Alunos lista=new Alunos(a.getNome(),a.getMatricula(),a.getCurso());
                   mensagem+="Aluno:"+lista.getNome()+" - Matricula: "+lista.getMatricula()+" - Curso: "+lista.getCurso()+"\n";
                   
                   for (Biblioteca b:biblioteca){
                       Biblioteca listalivro=new Biblioteca(b.getMatriculaaluno(),b.getTitulo_livro(),b.getIsbn());
                       
                       if (b.getMatriculaaluno()==a.getMatricula()){
                           mensagem+="    Livro: "+listalivro.getTitulo_livro()+" ISBN: "+listalivro.getIsbn()+"\n";
                       }
                   }
                   //mensagem+="Aluno:"+a.getNome()+" - Matricula: "+a.getMatricula()+" - Curso: "+a.getCurso()+"\n";
                   
                   
                    //System.out.println(mensagem);
                   //System.out.println(a.getMatricula());
               }
               JOptionPane.showMessageDialog(null, mensagem);
	}
}
