package aula_10;

import java.util.ArrayList;

public class ListaPosto {
    private ArrayList<Posto> postos;

    public ListaPosto() {
        postos = new ArrayList<>();
    }

    public void adicionaPosto(Posto p) {
        postos.add(p);
    }

    public ArrayList<Posto> listaPostosProximos(Circulo c) {
        ArrayList<Posto> proximos = new ArrayList<Posto>();
        for (Posto posto : postos) {
            Ponto localizacao = posto.getLocalizacao();
            boolean contido = c.estaContido(localizacao);
            if (contido) {
                proximos.add(posto);
            }
        }
        return proximos;
    }
}
