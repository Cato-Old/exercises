package ex7;

import java.util.Scanner;

public class UpperCase {
    private String str;

    public UpperCase() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj tekst: ");
        str = scanner.nextLine();
    }

    public void toUpperCase() {
        System.out.println(str.toUpperCase());
    }
}
