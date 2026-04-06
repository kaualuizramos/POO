import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();

        try {
            System.out.print("Digite o nome do produto: ");
            String nome = sc.nextLine();
            System.out.print("Digite o preço: ");
            double preco = sc.nextDouble();
            sc.nextLine(); // consume newline
            menu.adicionarProduto(nome, preco);
        } catch (InputMismatchException e) {
            System.out.println("ERRO: tipo de dado inválido para preço.");
        } catch (IllegalArgumentException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        // Adicionando produtos fixos com tratamento
        try {
            menu.adicionarProduto("Coca-Cola", 5);
        } catch (IllegalArgumentException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            menu.adicionarProduto("Pizza", 20);
        } catch (IllegalArgumentException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            menu.adicionarProduto("Hambúrguer", 15);
        } catch (IllegalArgumentException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            menu.adicionarProduto("Sorvete", 10);
        } catch (IllegalArgumentException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            menu.adicionarProduto("Pão de queijo", 5);
        } catch (IllegalArgumentException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            menu.exibirMenu();
        } catch (NullPointerException e) {
            System.out.println("ERRO: produto nulo encontrado no menu.");
        }

        try {
            menu.calcularMediaPreco();
        } catch (ArithmeticException e) {
            System.out.println("ERRO: divisão por zero ao calcular média (nenhum produto no menu).");
        }

        try {
            System.out.print("Digite a posição do produto para consultar: ");
            int posicao = sc.nextInt();
            menu.consultarProduto(posicao);
        } catch (InputMismatchException e) {
            System.out.println("ERRO: posição deve ser um número inteiro.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERRO: posição fora dos limites do array.");
        } catch (NullPointerException e) {
            System.out.println("ERRO: produto nulo na posição consultada.");
        }

        sc.close();
    }
}
