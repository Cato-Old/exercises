package ex1;

import java.util.Scanner;

public class AddingCons {
    private double numA;
    private double numB;

    public AddingCons() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        numA = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Podaj drugą liczbę: ");
        numB = scanner.nextDouble();
        scanner.nextLine();
    }

    public double Adding() {
        return numA + numB;
    }

    public void ShowResult() {
        System.out.print("Wynik dodawania: ");
        System.out.println(Adding());
    }
}