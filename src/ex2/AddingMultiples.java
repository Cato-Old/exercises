package ex2;

import java.util.Scanner;

public class AddingMultiples {
    int n;

    public AddingMultiples(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę naturalną: ");
        n = scanner.nextInt();
        scanner.nextLine();
    }

    public int GetMultipleOf3() {
        int countOfMultiples = n / 3;
        int[] multiplesOf3 = new int[countOfMultiples];
        int sumMultiplesOf3 = 0;
        for (int i = 0 ; i <= multiplesOf3.length-1; i++) {
            multiplesOf3[i] = (i+1) * 3;
            sumMultiplesOf3 += multiplesOf3[i];
        }
        return sumMultiplesOf3;
    }

    public int GetMultipleOf5() {
        int countOfMultiples = n / 5;
        int[] multiplesOf5 = new int[countOfMultiples];
        int sumMultiplesOf5 = 0;
        for (int i = 0 ; i <= multiplesOf5.length-1; i++) {
            multiplesOf5[i] = (i+1) * 5;
            sumMultiplesOf5 += multiplesOf5[i];
        }
        return sumMultiplesOf5;
    }
     public int ShowResult() {
        return GetMultipleOf3() + GetMultipleOf5();
     }


}
