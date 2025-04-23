public class Aluno {
    // atributos
    private String nome;
    private double nota1;
    private double nota2;

    // getters / setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        }
    }




    // construtor
    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }




    // mé todos
    public double calculaMedia() {
        double soma = nota1 + nota2;
        return soma / 2;
    }
    
}
