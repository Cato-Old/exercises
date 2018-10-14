package ex3;

import java.util.Scanner;

public class Factorial {
    private int n;

    public Factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        n = scanner.nextInt();
        scanner.nextLine();
    }

    public int GetFactorialNIter() {
        int factorial = 1;
        for (int i =1 ; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public int getN() {
        return n;
    }

    public int GetFactorialNRec(int n) {
        return n == 1 ? n : n * GetFactorialNRec(n-1);
    }
}
