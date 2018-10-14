package ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Avverage {
    List<Double> number = new ArrayList<>();

    public Avverage() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz liczby oddzielone spacją i potwierdź ENTEREM: ");
        String input = scanner.nextLine();
        String[] numbersString = input.split(" ");
        for (String str : numbersString) {
            number.add(Double.parseDouble(str));
        }
    }

    public double ComputeAvv() {
        double sum = 0;
        for (double x : number) {
            sum += x;
        }
        return sum / number.size();
    }
}
