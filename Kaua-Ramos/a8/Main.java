import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto[] produtos = new Produto[5];
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Exibir produtos");
            System.out.println("3 - Calcular média dos preços");
            System.out.println("4 - Consultar produto por posição");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");

            try {
                opcao = sc.nextInt();

                switch (opcao) {

                    case 1:
                        try {
                            int posicao = -1;
                            for (int i = 0; i < produtos.length; i++) {
                                if (produtos[i] == null) {
                                    posicao = i;
                                    break;
                                }
                            }

                            if (posicao == -1) {
                                System.out.println("Lista cheia!");
                                break;
                            }

                            sc.nextLine(); // limpar buffer

                            System.out.print("Nome: ");
                            String nome = sc.nextLine();

                            System.out.print("Preço: ");
                            double preco = sc.nextDouble();

                            System.out.print("Código: ");
                            int codigo = sc.nextInt();

                            produtos[posicao] = new Produto(nome, preco, codigo);
                            System.out.println("Produto cadastrado com sucesso!");

                        } catch (InputMismatchException e) {
                            System.out.println("Erro: entrada inválida.");
                            sc.nextLine();
                        } catch (IllegalArgumentException e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                        break;

                    case 2:
                        for (int i = 0; i < produtos.length; i++) {
                            try {
                                System.out.println("Posição " + i + ": " + produtos[i].toString());
                            } catch (NullPointerException e) {
                                System.out.println("Posição " + i + ": vazia");
                            }
                        }
                        break;

                    case 3:
                        try {
                            double soma = 0;
                            int count = 0;

                            for (Produto p : produtos) {
                                if (p != null) {
                                    soma += p.getPreco();
                                    count++;
                                }
                            }

                            double media = soma / count; // pode gerar ArithmeticException
                            System.out.println("Média dos preços: R$ " + media);

                        } catch (ArithmeticException e) {
                            System.out.println("Erro: nenhum produto cadastrado.");
                        }
                        break;

                    case 4:
                        try {
                            System.out.print("Digite a posição (0 a 4): ");
                            int pos = sc.nextInt();

                            Produto p = produtos[pos]; // pode gerar ArrayIndexOutOfBoundsException

                            if (p == null) {
                                throw new NullPointerException("Posição vazia.");
                            }

                            System.out.println(p);

                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("Erro: posição inválida.");
                        } catch (NullPointerException e) {
                            System.out.println("Erro: " + e.getMessage());
                        } catch (InputMismatchException e) {
                            System.out.println("Erro: digite um número válido.");
                            sc.nextLine();
                        }
                        break;

                    case 5:
                        System.out.println("Encerrando...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }

            } catch (InputMismatchException e) {
                System.out.println("Erro: digite um número inteiro.");
                sc.nextLine();
                opcao = 0;
            }

        } while (opcao != 5);

        sc.close();
    }
}