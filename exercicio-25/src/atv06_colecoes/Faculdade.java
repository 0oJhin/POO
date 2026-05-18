package atv06_colecoes;
import java.util.LinkedList;

public class Faculdade {
    private LinkedList<Curso> cursos;
        
    public Faculdade(){
        cursos = new LinkedList<>();
    }

    public void adicionarCurso(Curso curso){
        cursos.add(curso);
        System.out.println(curso+" adicionado");
    }
    public void listarCursos(){
        System.out.println("Cursos atuais ");
            for(Curso curso : cursos){
            System.out.println(curso);
            }
    }
    public void mostrarPrimeiroCurso(){
        System.out.println("Primeiro curso-> "+cursos.getFirst());
    }
    public void mostrarUltimoCurso(){
        
        System.out.println("Ultimo curso-> "+cursos.getLast());
    }
    public void removerPrimeiroCurso(){
        cursos.removeFirst();
        System.out.println("Primeiro da lista removido");
    }
    public void mostrarQuantidadeCursos(){
        System.out.println("A lista possui "+cursos.size()+" itens");
    }
    public void verificarListaVazia(){
        if(cursos.isEmpty()){
            System.out.println("A lista atual está vazia");
        }else{
            System.out.println("A lista nao eta vazia e possui "+cursos.size()+" itens");
        }

    }
    }
