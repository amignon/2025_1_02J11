public class Produto {
    // atributos
    private String nome;
    private double preco;
    private int quantidade;

    // construtor
    public Produto(String nome, double preco, int quantidade) {
        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);
    }

    // métodos
    public double calcularValorTotal() {
        return preco * quantidade;
    }

    public void aplicaDesconto(double percentual) {
        double desconto = preco * (percentual / 100);
        setPreco(preco - desconto);
    }

    // getters / setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.trim().length() > 0) {
            this.nome = nome;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0.0) {
            this.preco = preco;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        }
    }

}
