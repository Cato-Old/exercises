package ex1;

public class Runner {
    public static void main(String[] args) {
        if (args.length == 0) {
            Adding adding = new Adding();
            adding.ShowResult();
        } else if (args.length == 2) {
            Adding adding = new Adding(args[0], args[1]);
            adding.ShowResult();
        } else {
            System.out.println("Nieprawidłowe dane wejściowe");
        }
    }
}
