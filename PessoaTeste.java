package poo.conceitos;

public class PessoaTeste {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa("Joana", 2010);
		
		System.out.println("Nome1: " + pessoa1.nome);
		System.out.println("Idade1: " + pessoa1.idade);
		System.out.println("Ano de Nascimento1: " + pessoa1.anoNascimento);
		
		System.out.println();
		
		System.out.println("Nome2: " + pessoa2.nome);
		System.out.println("Idade2: " + pessoa2.idade);
		System.out.println("Ano de Nascimento2: " + pessoa2.anoNascimento);
		
		System.out.println();
		
		pessoa1.anoNascimento = 2000;
		System.out.println("Nome1: " + pessoa1.nome);
		System.out.println("Idade1: " + pessoa1.calculaIdade(2022));
		System.out.println("Idade1: " + pessoa1.idade);
		System.out.println("Ano de Nascimento1: " + pessoa1.anoNascimento);
		

	}

}
