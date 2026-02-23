import java.util.Scanner;

public class Java_Lab01_2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Entrada de dados

        System.out.print("Insira um número inteiro: ");
        int numInt = entrada.nextInt();

        System.out.print("Insira um número decimal: ");
        float numFloat = entrada.nextFloat();

        System.out.print("Insira um número grande: ");
        long numLong = entrada.nextLong();

        System.out.print("Insira um caractere: ");
        char caractere = entrada.next().charAt(0);

        // Conversão para classes Wrapper

        Integer wrapperInt = Integer.valueOf(numInt);
        Float wrapperFloat = Float.valueOf(numFloat);
        Long wrapperLong = Long.valueOf(numLong);
        Character wrapperChar = Character.valueOf(caractere);

        // Operações

        int resultadoInt = wrapperInt + 10;
        float resultadoFloat = wrapperFloat * 2.5f;
        long resultadoLong = wrapperLong - 1000;
        boolean ehLetra = Character.isLetter(wrapperChar);

        // Exibição dos resultados

        System.out.println("\n--- Resultados ---");
        System.out.println("Inteiro + 10: " + resultadoInt);
        System.out.println("Float * 2.5: " + resultadoFloat);
        System.out.println("Long - 1000: " + resultadoLong);
        System.out.println("O caractere é uma letra? " + ehLetra);

        entrada.close();
    }
}