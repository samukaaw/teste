import java.util.Scanner;
public class Teste{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1;
        double num2;
        double soma;
        System.out.println("Insira o primeiro numero da soma:");
        num1 = input.nextDouble();
        System.out.println("Insira o segundo numero da soma:");
        num2 = input.nextDouble();
        soma = num1 + num2;
        System.out.printf("%f + %f = %f", num1, num2, soma);
    }
}