import java.util.Scanner;

public class Java_Lab01{

    public static void main(String[] args){

        //parte 1

        Scanner entrada = new Scanner(System.in);
        int num1;
        double num2;
        long num3;
        boolean num4;

        System.out.println("Insira um número inteiro: ");
        num1 = entrada.nextInt();

        System.out.println("Insira um número decimal");
        num2 = entrada.nextDouble();

        System.out.println("Insira um número longo: ");
        num3 = entrada.nextLong();

        System.out.println("Insira uma variável booleana: ");
        num4 = entrada.nextBoolean();

        //parte 2

        Integer wrappernum1 = Integer.valueOf(num1);
        Double wrappernum2 = Double.valueOf(num2);
        Long wrappernum3 = Long.valueOf(num3);
        Boolean wrappernum4 = Boolean.valueOf(num4);

        //parte 3

        int conta1 = wrappernum1 * 2;
        double conta2 = wrappernum2 + 5.5;
        long conta3 = wrappernum3 / 2;
        boolean conta4 = !wrappernum4;

        //parte 4

        System.out.println("Resultado da multiplicação do número inteiro por 2: " + conta1);
        System.out.println("Resultado da soma de 5.5 ao número decimal: " + conta2);
        System.out.println("Resultado da divisão do número Long por 2: " + conta3);
        System.out.println("Resultado da inversão do valor booleano: " + conta4);

        entrada.close();
    } 
}