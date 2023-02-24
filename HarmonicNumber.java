import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("N cannot be 0");
            return;
        }

        double harmonicNumber = 0;

        for (int i = 1; i <= n; i++) {
            harmonicNumber += 1.0 / i;
        }

        System.out.println("The " + n + "th harmonic number is " + harmonicNumber);
    }
}
