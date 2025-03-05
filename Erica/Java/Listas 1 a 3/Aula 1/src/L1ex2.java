import java.util.Scanner;

public class L1ex2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite suas notas respectivamente:");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        double peso1 = 3;
        double peso2 = 3;
        double peso3 = 4;

        double media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);

        System.out.println("A média é: " + media);

        scanner.close();
    }
}
