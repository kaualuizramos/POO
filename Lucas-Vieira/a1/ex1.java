import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int n1 = entrada.nextInt();

        System.out.print("Insira um número decimal (double): ");
        double n2 = entrada.nextDouble();

        System.out.print("Insira um número grande (long): ");
        long n3 = entrada.nextLong();

        System.out.print("Insira um valor booleano (true/false): ");
        boolean n4 = entrada.nextBoolean();

        entrada.close();

        Integer w1 = Integer.valueOf(n1);
        Double w2 = Double.valueOf(n2);
        Long w3 = Long.valueOf(n3);
        Boolean w4 = Boolean.valueOf(n4);

        Integer resultadoInt = w1 * 2;
        Double resultadoDouble = w2 + 5.5;
        Long resultadoLong = w3 / 2;
        Boolean resultadoBoolean = !w4;

        System.out.println("\nResultados:");
        System.out.println("Inteiro multiplicado por 2: " + resultadoInt);
        System.out.println("Double + 5.5: " + resultadoDouble);
        System.out.println("Long dividido por 2: " + resultadoLong);
        System.out.println("Boolean invertido: " + resultadoBoolean);
    }
}
