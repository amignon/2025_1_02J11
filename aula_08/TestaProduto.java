public class TestaProduto {
    public static void main(String[] args) {
        Produto p = new Produto("Teclado", 565.00, 3);
        System.out.printf("%-15s|%8.2f|%2d%n", p.getNome(),
                            p.getPreco(), p.getQuantidade());
        p.aplicaDesconto(10);
        System.out.printf("%-15s|%8.2f|%2d%n", p.getNome(),
                            p.getPreco(), p.getQuantidade());
        double valorTotal = p.calcularValorTotal();
        System.out.printf("Valor Total: %.2f%n", valorTotal);
    }
}
