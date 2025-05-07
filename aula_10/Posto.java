package aula_10;

public class Posto {
    private String nome;
    private String bandeira;
    private Ponto localizacao;

    public Posto(String nome, String bandeira, Ponto localizacao) {
        this.nome = nome;
        this.bandeira = bandeira;
        this.localizacao = localizacao;
    }

    public String getNome() {
        return nome;
    }

    public String getBandeira() {
        return bandeira;
    }

    public Ponto getLocalizacao() {
        return localizacao;
    }
}
