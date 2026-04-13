import java.util.Scanner;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        GerenciarBD dao = new GerenciarBD("loja.db"); // cria instância

        try {

            dao.criarTabelaSeNaoExistir();
            FileTools.appendLog("loja.log", "SUCESSO", "Tabela verificada/criada.");

        } catch (java.sql.SQLException ex) {

            FileTools.appendLog("loja.log", "ERRO", "Falha ao criar/verificar tabela.", ex);
            System.err.println("Não foi possível preparar a tabela. Encerrando.");

            return;
        }
        Scanner sc = new Scanner(System.in);
        int opcao = -1;
        System.out.println("1 - Adicionar produto\r\n" + //
                            "2 - Listar todos os produtos\r\n" + //
                            "3 - Listar produtos com estoque baixo (≤ limite informado)\r\n" + //
                            "4 - Atualizar estoque de um produto (por id)\r\n" + //
                            "0 - Sair\r\n" // 
                        );
        opcao = sc.nextInt();
        sc.nextLine(); // Consome a quebra de linha pendente
        while (opcao != 0) {
            switch (opcao) {
                case 1:
                    try (java.sql.Connection c = java.sql.DriverManager.getConnection("jdbc:sqlite:loja.db")) {
                        String sql = "INSERT INTO produtos (nome, preco, quantidade) VALUES (?, ?, ?)";
                        try (java.sql.PreparedStatement ps = c.prepareStatement(sql,java.sql.Statement.RETURN_GENERATED_KEYS)) {
                            ps.setString(1, "Caderno");
                            ps.setDouble(2, 15.90);
                            ps.setInt(3, 50);
                            int linhas = ps.executeUpdate();
                            if (linhas > 0) {
                                try (java.sql.ResultSet rs = ps.getGeneratedKeys()) {
                                    if (rs.next()) {
                                        long idGerado = rs.getLong(1);
                                            FileTools.appendLog("loja.log", "SUCESSO", "Produto inserido(id=" + idGerado + ").");
                                    }
                                }
                            }
                        }
                    } catch (java.sql.SQLException ex) {
                            FileTools.appendLog("loja.log", "ERRO", "Falha ao inserir produto.", ex);
                    }
                case 2:
                            
                case 3:
                    // Lógica para listar produtos com estoque baixo
                case 4:
                    // Lógica para atualizar estoque de um produto
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                        
            }
        }
    }
}
