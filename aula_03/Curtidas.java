/*
 * Imagine que você foi contratado para desenvolver um sistema de análise de engajamento para uma rede social, 
 * onde os usuários interagem curtindo as publicações. Neste exercício, seu programa deverá solicitar ao usuário o
 * número de publicações que ele deseja analisar. Em seguida, para cada publicação, o programa pedirá que o usuário 
 * informe quantas curtidas ela recebeu. Para cada publicação, verificar se o número de curtidas é igual ou superior a 100. 
 * Caso seja, o programa deve exibir a mensagem “Publicação popular!”. Se não, exibir a mensagem “Publicação com poucas curtidas.”. 
 * Ao final, o sistema deve apresentar ao usuário a média de curtidas das publicações analisadas, além de informar 
 * o total de publicações processadas.
 */


import java.util.Scanner;
public class Curtidas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroPublicacoes;
        do {
            System.out.print("Número de Publicações: ");
            numeroPublicacoes = entrada.nextInt();
            if (numeroPublicacoes <= 0) {
                System.out.println("\tInforme um valor positivo!");
            }
        } while (numeroPublicacoes <= 0);
        
        int totalCurtidas = 0; // acumuladora
        for (int i = 1; i <= numeroPublicacoes; i++) {
            System.out.printf("Curtidas de Publicação #%d: ", i);
            int numeroCurtidas = entrada.nextInt();
            totalCurtidas = totalCurtidas + numeroCurtidas;
            if (numeroCurtidas >= 100) {
                System.out.println("Publicação popular!");
            }
            else {
                System.out.println("Publicação com poucas curtidas!");
            }
        }
        double mediaCurtidas = (double) totalCurtidas / numeroPublicacoes;
        System.out.printf("Média de curtidas = %.1f\n", mediaCurtidas);
        System.out.printf("Número de Publicações = %d\n", numeroPublicacoes);

        entrada.close();
    }
}