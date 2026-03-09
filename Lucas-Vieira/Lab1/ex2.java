import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int n1 = entrada.nextInt();

        System.out.print("Insira um número decimal (float): ");
        float n2 = entrada.nextFloat();

        System.out.print("Insira um número grande (long): ");
        long n3 = entrada.nextLong();

        System.out.print("Insira um caractére (char): ");
        char n4 = entrada.next().charAt(0);

        entrada.close();

        Integer w1 = Integer.valueOf(n1);
        Float w2 = Float.valueOf(n2);
        Long w3 = Long.valueOf(n3);
        Character w4 = Character.valueOf(n4);

        Integer resultadoInt = w1 + 10;
        Float resultadoFloat = w2 * 2.5f;
        Long resultadoLong = w3 - 1000;
        String resultadoCharacter = w4 >= 'a' && w4 <= 'z' && w4 >= 'A' && w4 <= 'Z' ? "É uma letra" : "Não é uma letra";

        System.out.println("\nResultados:");
        System.out.println("Inteiro somado a 10: " + resultadoInt);
        System.out.println("Float * 2.5: " + resultadoFloat);
        System.out.println("Long - 1000: " + resultadoLong);
        System.out.println("Caractere: " + resultadoCharacter);
    }
}
