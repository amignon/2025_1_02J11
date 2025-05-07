package aula_10;

import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        ListaPosto postosCombustivel = new ListaPosto();
        Ponto ponto1 = new Ponto(4, 5);
        Posto p1 = new Posto("Mack1", "BR", ponto1);
        postosCombustivel.adicionaPosto(p1);

        postosCombustivel.adicionaPosto(
            new Posto("Mack2", "Ipiranga", new Ponto(3, 6)));
        postosCombustivel.adicionaPosto(
            new Posto("Mack3", "Shell", new Ponto(30, 60)));
        postosCombustivel.adicionaPosto(
            new Posto("Mack4", "Ipiranga", new Ponto(48, 90)));
        postosCombustivel.adicionaPosto(
            new Posto("Mack5", "BR", new Ponto(1, 1)));

        Circulo c = new Circulo(new Ponto(3, 4), 4.5);

        ArrayList<Posto> proximos = postosCombustivel.listaPostosProximos(c);
        for (Posto p : proximos) {
            System.out.printf("%-10s - %-10s\n", p.getNome(), p.getBandeira());
        }
    }
}
