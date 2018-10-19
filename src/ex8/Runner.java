package ex8;

public class Runner {
    public static void main(String[] args) {
        NumberList nl = new NumberList(args);
        nl.WriteAll();
        nl.WriteAllReversed();
        nl.WriteAllOnUnevenIndex();
        nl.WriteAllDivisableByThree();
        nl.WriteSumOfAll();
        nl.WriteSumOfFirstFour();
        nl.WriteSumOfLastFive();
        nl.WriteSumFromBegin();
    }
}
