package aula_11;

public class TestaConta {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Ale", 1000);
        System.out.printf("Saldo CB: %.2f\n", conta.getSaldo());
        conta.sacar(1200);
        System.out.printf("Saldo CB: %.2f\n", conta.getSaldo());

        ContaPoupanca cp = new ContaPoupanca("Mignon", 2000, 0.05);
        cp.aplicarRendimento();
        System.out.printf("Saldo CP: %.2f\n", cp.getSaldo());
        cp.sacar(300);
        System.out.printf("Saldo CP: %.2f\n", cp.getSaldo());

        ContaCorrente cc = new ContaCorrente("Ale Mignon",1000, 500);
        System.out.printf("Saldo CC: %.2f\n", cc.getSaldo());
        cc.sacar(1200);
        System.out.printf("Saldo CC: %.2f\n", cc.getSaldo());
    }
}
