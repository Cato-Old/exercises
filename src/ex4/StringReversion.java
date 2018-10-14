package ex4;

import java.util.Scanner;

public class StringReversion {
    private String str;

    public StringReversion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Napisz coś: ");
        str = scanner.nextLine();
    }

    public String Reverse() {
        char[] array = str.toCharArray();
        char[] arrayRev = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayRev[i] = array[array.length - 1 - i];
        }
        return String.valueOf(arrayRev);
    }

}
