package atv03_PolimorfismoClasseAbstrata;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Circulo circulo01 = new Circulo(10);
        Retangulo retangulo01 = new Retangulo(20,10);

        ArrayList<Forma> teste03 = new ArrayList<>();

        teste03.add(circulo01);
        teste03.add(retangulo01);

        for (Forma teste04: teste03){

            System.out.println("Area da forma: "+teste04.calcularArea());
        }
    }
}
