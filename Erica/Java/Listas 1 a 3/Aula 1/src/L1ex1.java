import java.util.Scanner;

public class L1ex1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double numero1 = scanner.nextDouble();
        double numero2 = scanner.nextDouble();
        double numero3 = scanner.nextDouble();

        double mult = numero1 * numero2 * numero3;

        System.out.println("Os numeros multiplicados sao: " + mult);

        scanner.close();
    }
}
