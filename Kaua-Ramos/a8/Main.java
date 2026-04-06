import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produto[] produtos = new Produto[5];
        int opcao = 0;

        do {
            System.out.println("\n1-Cadastrar  2-Exibir  3-Média  4-Consultar  5-Sair");
            System.out.print("Opção: ");

            try {
                opcao = sc.nextInt();

                switch (opcao) {

                    case 1: // cadastrar
                        try {
                            int pos = -1;
                            for (int i = 0; i < 5; i++) {
                                if (produtos[i] == null) {
                                    pos = i;
                                    break;
                                }
                            }

                            if (pos == -1) {
                                System.out.println("Lista cheia!");
                                break;
                            }

                            sc.nextLine();
                            System.out.print("Nome: ");
                            String nome = sc.nextLine();

                            System.out.print("Preço: ");
                            double preco = sc.nextDouble();

                            System.out.print("Código: ");
                            int codigo = sc.nextInt();

                            produtos[pos] = new Produto(nome, preco, codigo);
                            System.out.println("Cadastrado!");

                        } catch (InputMismatchException e) {
                            System.out.println("Entrada inválida!");
                            sc.nextLine();
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case 2: // exibir
                        for (int i = 0; i < 5; i++) {
                            try {
                                System.out.println(i + ": " + produtos[i].toString());
                            } catch (NullPointerException e) {
                                System.out.println(i + ": vazio");
                            }
                        }
                        break;

                    case 3: // média
                        try {
                            double soma = 0;
                            int cont = 0;

                            for (Produto p : produtos) {
                                if (p != null) {
                                    soma += p.preco;
                                    cont++;
                                }
                            }

                            double media = soma / cont;
                            System.out.println("Média: " + media);

                        } catch (ArithmeticException e) {
                            System.out.println("Nenhum produto cadastrado!");
                        }
                        break;

                    case 4: // consultar
                        try {
                            System.out.print("Posição (0-4): ");
                            int pos = sc.nextInt();

                            Produto p = produtos[pos];

                            if (p == null) {
                                throw new NullPointerException("Posição vazia!");
                            }

                            System.out.println(p);

                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("Posição inválida!");
                        } catch (NullPointerException e) {
                            System.out.println(e.getMessage());
                        } catch (InputMismatchException e) {
                            System.out.println("Digite número!");
                            sc.nextLine();
                        }
                        break;

                    case 5:
                        System.out.println("Fim.");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }

            } catch (InputMismatchException e) {
                System.out.println("Digite um número!");
                sc.nextLine();
            }

        } while (opcao != 5);

        sc.close();
    }
}