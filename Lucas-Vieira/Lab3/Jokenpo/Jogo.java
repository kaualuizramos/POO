package Jokenpo;
import java.util.Random;
import java.util.Scanner;

public class Jogo {
    private String[] opcoes = {"Pedra", "Papel", "Tesoura"};

    public Jogo(String[] opcoes) {
        this.opcoes = opcoes;
    }

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public void jogar(Jogador jogador) {

        System.out.println(" >>> Pedra : 0 >>> Papel : 1 >>> Tesoura : 2 \nEscolha sua jogada:");
        int escolha = scanner.nextInt();
        jogador.setJogada(opcoes[escolha]);

        int escolhaComputador = random.nextInt(3);
        String jogadaComputador = opcoes[escolhaComputador];

        System.out.println("Jogada do computador: " + jogadaComputador);
        if (jogador.getJogada().equals(jogadaComputador)) {
            System.out.println("Empate!");
            
        } else if ((jogador.getJogada().equals("Pedra") && jogadaComputador.equals("Tesoura")) ||
                   (jogador.getJogada().equals("Papel") && jogadaComputador.equals("Pedra")) ||
                   (jogador.getJogada().equals("Tesoura") && jogadaComputador.equals("Papel"))) {
            System.out.println("Voce venceu!");

        } else {
            System.out.println("Computador venceu!");
        }

        System.out.println("Deseja jogar novamente? (s/n)");
        String resposta = scanner.next();
        if (resposta.equals("s")) {
            jogar(jogador);
        } else if (resposta.equals("n")) {
            System.out.println("Obrigado por jogar!");
        }
        else {
            System.out.println("Resposta inválida. Encerrando o jogo.");
        }
    }
}