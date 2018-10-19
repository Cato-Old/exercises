package ex7;

public class Runner {
    public static void main(String[] args) {
        UpperCase uc = new UpperCase();
        while (!uc.isClosed()){
            uc.toUpperCase();
            uc = new UpperCase();
        }
    }
}
