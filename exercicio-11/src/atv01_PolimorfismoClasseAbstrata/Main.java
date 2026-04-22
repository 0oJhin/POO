package atv01_PolimorfismoClasseAbstrata;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Papagaio papagaio = new Papagaio("Louro", "Verde");
        Vaca vaca = new Vaca("Mimosa", 10, "Branca", 500);
        Gato gato = new Gato("Mimi", 7);


        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(papagaio);
        animais.add(vaca);
        animais.add(gato);


        for (Animal animal : animais) {
            animal.emitirSom();
            animal.mover();
            System.out.println();
        }

        papagaio.emitirSom("Olá humanos!");
        vaca.emitirSom("Muuuuuuuuuuuu");
        gato.emitirSom("Miau miau");
    }
}