package ex6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Controler {
    LocalDate birth;

    public Controler() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj datę urodzenia w formacie dd.mm.rrrr: ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        birth = birth.parse(scanner.nextLine(), formatter);
    }

    public boolean IsAdult () {
        LocalDate now = LocalDate.now();
        Period p = Period.between(birth, now);
        if (p.getYears() <= 18){
            return false;
        } else {
            return true;
        }
    }
}
