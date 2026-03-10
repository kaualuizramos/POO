package Jokenpo;

public class Main {
    public static void main(String[] args) {

        Jogador jogador = new Jogador();

        System.out.println("Iniciando programa de Jokenpo!");

        Jogo jogo = new Jogo(new String[]{"Pedra", "Papel", "Tesoura"});
        jogo.jogar(jogador);

    }
}
