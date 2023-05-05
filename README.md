# MAA-test

## SQL_Question

- 1
  
```bash
SELECT *FROM PRODUCT ORDER BY FCCODE DESC
```

- 2
  
```bash
SELECT c.FCCODE, c.FCNAME, p.FCCODE, p.FCNAME
FROM COOR c
INNER JOIN CORP p ON c.FCCODE = p.FCCODE
WHERE c.FCCODE IN ('8888', 'AIC')
ORDER BY c.FCCODE ASC
```

- 3
  
```bash
SELECT c.FCCODE, c.FCNAME, p.FCCODE, p.FCNAME, SUM(p.FNQTY) as FNQTY
FROM COOR c
INNER JOIN CORP p ON c.FCCODE = p.FCCODE
INNER JOIN PRODUCT pr ON pr.FCCODE = c.FCCODE
WHERE c.FCCODE IN ('51-01824', '9999')
GROUP BY c.FCCODE, c.FCNAME, p.FCCODE, p.FCNAME
ORDER BY FNQTY ASC
```

### Function Question

- 1

```bash
    public static int calculateFee(int value) {
        final int BASE_FEE = 50;
        final int FEE_TIER_1 = 5;
        final int FEE_TIER_2 = 10;
        final int FEE_TIER_3 = 30;
        final int FEE_TIER_4 = 50;

        int fee = BASE_FEE;
        if (value > 0 && value <= 10) {
            fee += value * FEE_TIER_1; 
        } else if (value <= 20) {
            fee += 10 * FEE_TIER_1; 
            fee += (value - 10) * FEE_TIER_2; 
        } else if (value <= 30) {
            fee += 10 * FEE_TIER_1; 
            fee += 10 * FEE_TIER_2; 
            fee += (value - 20) * FEE_TIER_3; 
        } else if (value > 30) {
            fee += 10 * FEE_TIER_1; 
            fee += 10 * FEE_TIER_2; 
            fee += 10 * FEE_TIER_3; 
            fee += (value - 30) * FEE_TIER_4;
        }
        return fee;
    }
```

- 2

```bash
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
```
