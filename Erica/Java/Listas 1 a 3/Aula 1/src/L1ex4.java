import java.util.Scanner;

public class L1ex4 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salario atual:");
        double salarioAtual = scanner.nextDouble();

        double gratificacao = salarioAtual * 0.05;
        double imposto = salarioAtual * 0.07;
        double salarioAtualizado = salarioAtual + gratificacao - imposto;

        System.out.println("Seu salario com o calculo de gratificacao e impostos é de: " + salarioAtualizado);
        System.out.println("Você ganhou de gratificação: " + gratificacao);
        System.out.println("Foram descontados do seu salario base de impostos: " + imposto);

        scanner.close();
    }
}
