import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> primes = new ArrayList<>();

        System.out.print("Input : ");
        String input = scanner.nextLine();
        if (!input.matches("\\d+")) {
            System.out.println("Error");
            return;
        }

        int number = Integer.parseInt(input);
        if (number > 50000) {
            System.out.println("Input number is greater than 50,000.");
            return;
        }

        for (int i = 1; i <= number; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
            } else {
                numbers.add(i);
            }
        }

        System.out.print("number : ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.print("prime number : ");
        for (int p : primes) {
            System.out.print(p + " ");
        }
        System.out.println();
    }
}