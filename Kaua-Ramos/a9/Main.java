import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GerenciarBD dao = new GerenciarBD("loja.db");

        // CRIAR TABELA (COM DEBUG REAL)
        try {
            dao.criarTabelaSeNaoExistir();
            FileTools.appendLog("loja.log", "SUCESSO", "Tabela criada/verificada.");
            System.out.println("Banco inicializado com sucesso!");
        } catch (Exception e) {
            FileTools.appendLog("loja.log", "ERRO", "Erro ao criar tabela", e);
            System.out.println("Erro ao iniciar sistema. Veja o erro abaixo:");
            e.printStackTrace(); // 🔥 MOSTRA O ERRO REAL
            return;
        }

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Estoque baixo");
            System.out.println("4 - Atualizar estoque");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    try {
                        sc.nextLine();
                        System.out.print("Nome: ");
                        String nome = sc.nextLine();

                        System.out.print("Preço: ");
                        double preco = sc.nextDouble();

                        System.out.print("Quantidade: ");
                        int qtd = sc.nextInt();

                        long id = dao.inserirProduto(nome, preco, qtd);

                        System.out.println("Produto inserido com ID: " + id);
                        FileTools.appendLog("loja.log", "SUCESSO", "Produto inserido ID=" + id);

                    } catch (Exception e) {
                        FileTools.appendLog("loja.log", "ERRO", "Erro ao inserir produto", e);
                        System.out.println("Erro ao inserir produto");
                        e.printStackTrace(); // 🔥 debug
                    }
                    break;

                case 2:
                    try {
                        var lista = dao.listarTodos();

                        System.out.println("\n--- PRODUTOS ---");
                        for (var p : lista) {
                            System.out.printf("%d | %s | %.2f | %d\n",
                                    p.id, p.nome, p.preco, p.quantidade);
                        }

                        FileTools.appendLog("loja.log", "SUCESSO", "Listagem realizada");

                    } catch (Exception e) {
                        FileTools.appendLog("loja.log", "ERRO", "Erro ao listar", e);
                        System.out.println("Erro ao listar produtos");
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    try {
                        System.out.print("Informe o limite: ");
                        int limite = sc.nextInt();

                        var lista = dao.listarPorEstoqueAte(limite);

                        System.out.println("\n--- ESTOQUE BAIXO ---");
                        for (var p : lista) {
                            System.out.printf("%d | %s | %.2f | %d\n",
                                    p.id, p.nome, p.preco, p.quantidade);
                        }

                        FileTools.appendLog("loja.log", "SUCESSO", "Filtro estoque realizado");

                    } catch (Exception e) {
                        FileTools.appendLog("loja.log", "ERRO", "Erro no filtro", e);
                        System.out.println("Erro ao filtrar produtos");
                        e.printStackTrace();
                    }
                    break;

                case 4:
                    try {
                        System.out.print("ID do produto: ");
                        long id = sc.nextLong();

                        System.out.print("Nova quantidade: ");
                        int qtd = sc.nextInt();

                        int linhas = dao.atualizarQuantidade(id, qtd);

                        if (linhas > 0) {
                            System.out.println("Atualizado com sucesso!");
                            FileTools.appendLog("loja.log", "SUCESSO", "Atualizado ID=" + id);
                        } else {
                            System.out.println("Produto não encontrado.");
                            FileTools.appendLog("loja.log", "ERRO", "Produto não encontrado ID=" + id);
                        }

                    } catch (Exception e) {
                        FileTools.appendLog("loja.log", "ERRO", "Erro ao atualizar", e);
                        System.out.println("Erro ao atualizar produto");
                        e.printStackTrace();
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}