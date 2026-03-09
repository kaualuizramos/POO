import java.util.Scanner;
import java.util.Random;

public class Jokenpo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int vitoriasUsuario = 0;
        String jogar = "s";

        while (jogar.equalsIgnoreCase("s")) {

            System.out.println("Escolha uma opção:");
            System.out.println("1 - Pedra");
            System.out.println("2 - Papel");
            System.out.println("3 - Tesoura");

            int escolhaUsuario;

            if (scanner.hasNextInt()) {
                escolhaUsuario = scanner.nextInt();
            } else {
                System.out.println("Entrada inválida! Digite um número.");
                scanner.next();
                continue;
            }

            if (escolhaUsuario < 1 || escolhaUsuario > 3) {
                System.out.println("Opção inválida! Escolha 1, 2 ou 3.");
                continue;
            }

            int numeroAleatorio = random.nextInt(100) + 1;
            int escolhaComputador;

            if (numeroAleatorio <= 33) {
                escolhaComputador = 1;
            } else if (numeroAleatorio <= 66) {
                escolhaComputador = 2;
            } else {
                escolhaComputador = 3;
            }

            String[] opcoes = {"", "Pedra", "Papel", "Tesoura"};

            System.out.println("Você escolheu: " + opcoes[escolhaUsuario]);
            System.out.println("Computador escolheu: " + opcoes[escolhaComputador]);

            if (escolhaUsuario == escolhaComputador) {
                System.out.println("Resultado: Empate!");
            } 
            else if ((escolhaUsuario == 1 && escolhaComputador == 3) ||
                     (escolhaUsuario == 2 && escolhaComputador == 1) ||
                     (escolhaUsuario == 3 && escolhaComputador == 2)) {

                System.out.println("Resultado: Você ganhou!");
                vitoriasUsuario++;
            } 
            else {
                System.out.println("Resultado: Você perdeu!");
            }

            System.out.println("Deseja jogar novamente? (s/n)");
            jogar = scanner.next();
        }

        System.out.println("Total de vitórias do usuário: " + vitoriasUsuario);
        scanner.close();
    }
}