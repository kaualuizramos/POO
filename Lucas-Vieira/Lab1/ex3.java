import java.util.Scanner;
import java.lang.StringBuilder;


public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        StringBuilder input = new StringBuilder(scanner.nextLine());
        
        System.out.println("Você digitou: " + input);
        
        System.out.println("Tamanho da string: " + input.length());

        System.out.println("String em maiúsculas: " + input.toString().toUpperCase());

        System.out.println("String invertida: " + input.reverse());

        System.out.println("String com 'a' substituído por '*': " + input.reverse().toString().replaceAll("[aAeEiIoOuU]", "*"));

    }
    scanner.close();

}
