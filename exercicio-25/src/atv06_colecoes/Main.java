package atv06_colecoes;

public class Main {
    public static void main(String[]args){
    Curso c1 = new Curso("Engenharia da computacao");
    Curso c2 = new Curso("Engenharia da quimica");
    Curso c3 = new Curso("Engenharia da civil");
    Curso c4 = new Curso("Engenharia da florestal");
    Curso c5 = new Curso("Engenharia da aeroespacial");
    Faculdade f1 = new Faculdade();
    f1.adicionarCurso(c1); 
    f1.adicionarCurso(c2);
    f1.adicionarCurso(c3);
    f1.adicionarCurso(c4);
    f1.adicionarCurso(c5);
    
    f1.mostrarQuantidadeCursos();
    f1.mostrarPrimeiroCurso();
    f1.mostrarUltimoCurso();
    f1.listarCursos();

    f1.removerPrimeiroCurso();
    
    f1.mostrarQuantidadeCursos();
    f1.mostrarPrimeiroCurso();
    f1.mostrarUltimoCurso();
    f1.listarCursos();
        
}
}
