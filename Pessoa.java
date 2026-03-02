package poo.classe;

public class Pessoa {

	String nome;
	int idade;
	int anoNascimento;

	Pessoa() {
	}

	Pessoa(String nome, int idade, int anoNascimento) {
		this.nome = nome;
		this.idade = idade;
		this.anoNascimento = anoNascimento;
	}

	Pessoa(String nome, int anoNascimento) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
	}

	int calculaIdade(int anoAtual) {
		if (anoAtual >= anoNascimento) {
			idade = anoAtual - anoNascimento;
		} else {
			System.out.println("A pessoa ainda não nasceu");
			idade = -1; // erro no anoAtual...
		}
		return idade;
	}
	
	void atualizaIdade(int novaIdade) {
		idade = novaIdade;
	}
}
