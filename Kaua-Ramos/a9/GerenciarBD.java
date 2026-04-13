import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GerenciarBD {

    private final String dbUrl;

    // FORÇA o carregamento do driver SQLite
    static {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Driver SQLite não encontrado no classpath.", e);
        }
    }

    public GerenciarBD(String dbFilePath) {
        this.dbUrl = "jdbc:sqlite:" + dbFilePath;
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl);
    }

    public void criarTabelaSeNaoExistir() throws SQLException {

        String sql =
                "CREATE TABLE IF NOT EXISTS produtos (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nome TEXT NOT NULL," +
                "preco REAL NOT NULL," +
                "quantidade INTEGER NOT NULL DEFAULT 0" +
                ")";

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.execute();
        }
    }

    public long inserirProduto(String nome, double preco, int quantidade) throws SQLException {

        String sql = "INSERT INTO produtos (nome, preco, quantidade) VALUES (?, ?, ?)";

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, nome);
            ps.setDouble(2, preco);
            ps.setInt(3, quantidade);

            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    return rs.getLong(1);
                }
            }
        }

        return -1;
    }

    public List<ProdutoDTO> listarTodos() throws SQLException {

        String sql = "SELECT id, nome, preco, quantidade FROM produtos ORDER BY id";

        List<ProdutoDTO> lista = new ArrayList<>();

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(new ProdutoDTO(
                        rs.getLong("id"),
                        rs.getString("nome"),
                        rs.getDouble("preco"),
                        rs.getInt("quantidade")
                ));
            }
        }

        return lista;
    }

    public List<ProdutoDTO> listarPorEstoqueAte(int limite) throws SQLException {

        String sql = "SELECT id, nome, preco, quantidade FROM produtos WHERE quantidade <= ? ORDER BY quantidade, id";

        List<ProdutoDTO> lista = new ArrayList<>();

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, limite);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    lista.add(new ProdutoDTO(
                            rs.getLong("id"),
                            rs.getString("nome"),
                            rs.getDouble("preco"),
                            rs.getInt("quantidade")
                    ));
                }
            }
        }

        return lista;
    }

    public int atualizarQuantidade(long id, int novaQuantidade) throws SQLException {

        String sql = "UPDATE produtos SET quantidade = ? WHERE id = ?";

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, novaQuantidade);
            ps.setLong(2, id);

            return ps.executeUpdate();
        }
    }

    public static class ProdutoDTO {

        public final long id;
        public final String nome;
        public final double preco;
        public final int quantidade;

        public ProdutoDTO(long id, String nome, double preco, int quantidade) {
            this.id = id;
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }

        @Override
        public String toString() {
            return id + " | " + nome + " | " + String.format("%.2f", preco) + " | " + quantidade;
        }
    }
}