package ex3;

public class Runner {
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.println(fact.GetFactorialNIter());
        System.out.println(fact.GetFactorialNRec(fact.getN()));
    }
}
