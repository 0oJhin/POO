package exercicio06;

public class Main {
    public static void main(String[] args) {
        Instrutor rogerio = new Instrutor("Rogerio Ceni", "Quimica", "Ceni@sp", 6);

        Curso curso = new Curso("Quimica Organica", 25, "intermediario", "Curso voltado para o estudo de substancias formadas por carbono");

        curso.associarInstrutor(rogerio);
        rogerio.aplicarAvaliacao(curso.getNome());
        curso.exibirCurso();
        rogerio.criarMaterialDeApoio("Como classificar susbstancias derivadas do alcool");
        rogerio.agendarLive("10/10/2022 10:00");
    }
}