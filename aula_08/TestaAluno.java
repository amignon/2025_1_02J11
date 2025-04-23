import java.util.Scanner;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ale");
        Aluno a2 = new Aluno("Mignon", 8, 5);

        System.out.println(a1.getNome());
        a1.setNota1(7.0);
        a1.setNota2(9.0);

        System.out.printf("Nota 1: %.1f%n", a1.getNota1());



        System.out.println(a1.calculaMedia());

        System.out.println(a2.calculaMedia());

    }
}
