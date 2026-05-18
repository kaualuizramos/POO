import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

enum NivelPrioridade {
    BAIXA,
    MEDIA,
    ALTA,
    CRITICA;

    public String getDescricao() {
        switch (this) {
            case BAIXA:
                return "Prioridade Baixa";
            case MEDIA:
                return "Prioridade Média";
            case ALTA:
                return "Prioridade Alta";
            case CRITICA:
                return "Prioridade Crítica";
            default:
                return "";
        }
    }
}

interface Atendimento {
    String resolverChamado(Chamado chamado);
}

class SuporteBasico implements Atendimento {

    @Override
    public String resolverChamado(Chamado chamado) {
        return "[Suporte Básico] Chamado #" + chamado.getId() +
               " (" + chamado.getPrioridade() + ") resolvido: " +
               "Instalação/configuração simples.";
    }
}

class SuporteAvancado implements Atendimento {

    @Override
    public String resolverChamado(Chamado chamado) {
        return "[Suporte Avançado] Chamado #" + chamado.getId() +
               " (" + chamado.getPrioridade() + ") resolvido: " +
               "Troca de hardware / intervenção remota avançada.";
    }
}

class Cliente {
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}

class Chamado {
    private int id;
    private String descricao;
    private NivelPrioridade prioridade;
    private Cliente cliente;

    public Chamado(int id,
                    String descricao,
                    NivelPrioridade prioridade,
                    Cliente cliente) {

        this.id = id;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.cliente = cliente;
    }

    public void validar() {

        if (cliente == null) {
            throw new IllegalArgumentException("Cliente não pode ser nulo.");
        }

        if (cliente.getNome() == null ||
            cliente.getNome().trim().isEmpty()) {

            throw new IllegalArgumentException("Nome do cliente inválido.");
        }

        if (cliente.getEmail() == null ||
            cliente.getEmail().trim().isEmpty()) {

            throw new IllegalArgumentException("Email do cliente inválido.");
        }

        if (descricao == null ||
            descricao.trim().isEmpty()) {

            throw new IllegalArgumentException("Descrição do chamado inválida.");
        }

        if (prioridade == null) {
            throw new IllegalArgumentException("Prioridade inválida.");
        }
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public NivelPrioridade getPrioridade() {
        return prioridade;
    }

    public Cliente getCliente() {
        return cliente;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Prioridades disponíveis:");

            for (NivelPrioridade np : NivelPrioridade.values()) {
                System.out.println("- " + np);
            }

            System.out.print("\nNome do cliente: ");
            String nome = sc.nextLine();

            System.out.print("E-mail: ");
            String email = sc.nextLine();

            System.out.print("Descrição do chamado: ");
            String descricao = sc.nextLine();

            System.out.print("Prioridade (BAIXA, MEDIA, ALTA, CRITICA): ");
            String prioridadeTexto = sc.nextLine().toUpperCase();

            NivelPrioridade prioridade =
                    NivelPrioridade.valueOf(prioridadeTexto);

            Cliente cliente = new Cliente(nome, email);

            Chamado chamado = new Chamado(
                    1,
                    descricao,
                    prioridade,
                    cliente
            );

            chamado.validar();

            Atendimento atendimento;

            if (prioridade == NivelPrioridade.BAIXA ||
                prioridade == NivelPrioridade.MEDIA) {

                atendimento = new SuporteBasico();

            } else {

                atendimento = new SuporteAvancado();
            }

            String resolucao =
                    atendimento.resolverChamado(chamado);

            String linha =
                    "ID: " + chamado.getId() +
                    " | Cliente: " + cliente.getNome() +
                    " | Email: " + cliente.getEmail() +
                    " | Prioridade: " + prioridade +
                    " | Resolução: " + resolucao;

            System.out.println("\n" + linha);

            try (FileWriter fw =
                         new FileWriter("chamados.txt", true);

                 PrintWriter pw = new PrintWriter(fw)) {

                pw.println(linha);

                System.out.println("\nChamado gravado com sucesso em chamados.txt");

            } catch (IOException e) {

                System.out.println(
                        "Erro ao gravar o chamado: " +
                        e.getMessage()
                );
            }

        } catch (IllegalArgumentException e) {

            System.out.println("Erro de validação: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("Erro inesperado: " + e.getMessage());

        } finally {

            sc.close();
        }
    }
}