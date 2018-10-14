package ex6;

import java.text.ParseException;

public class Runner {
    public static void main(String[] args) throws ParseException {
        Controler ctr = new Controler();
        if (ctr.IsAdult()){
            System.out.println("PEŁNOLETNI");
        } else {
            System.out.println("NIEPEŁNOLETNI");
        }
    }
}
