package ex1;

import java.util.Scanner;

public class Adding {
    private double numA;
    private double numB;

    public Adding() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        numA = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Podaj drugą liczbę: ");
        numB = scanner.nextDouble();
        scanner.nextLine();
    }

    public Adding(String numA, String numB){
        this.numA = Double.parseDouble(numA);
        this.numB = Double.parseDouble(numB);
    }

    public double DoAdding() {
        return numA + numB;
    }

    public void ShowResult() {
        System.out.print("Wynik dodawania: ");
        System.out.println(DoAdding());
    }
}