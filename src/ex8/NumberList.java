package ex8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberList {
    private List<Integer> numList;

    public NumberList(String[] args) {
        numList = Arrays.stream(args)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public void WriteAll() {
        numList.stream()
                .forEach(System.out::println);
    }

    public void WriteAllReversed() {
        numList.stream()
                .sorted(Collections.reverseOrder())
                .forEachOrdered(System.out::println);
    }

    public void WriteAllOnUnevenIndex() {
        IntStream
                .range(0, numList.size())
                .filter(x -> x % 2 != 0)
                .mapToObj(x -> numList.get(x))
                .forEach(System.out::println);
    }

    public void WriteAllDivisableByThree() {
        numList.stream()
                .filter(x -> x % 3 == 0)
                .forEach(System.out::println);
    }

    public void WriteSumOfAll() {
        System.out.println(
                numList.stream()
                        .mapToInt(x -> x)
                        .sum()
        );
    }

    public void WriteSumOfFirstFour() {
        System.out.println(
                numList.stream()
                        .limit(4)
                        .mapToInt(x -> x)
                        .sum()
        );
    }

    public void WriteSumOfLastFive() {
        System.out.println(
                numList.stream()
                        .sorted(Collections.reverseOrder())
                        .filter(x -> x > 2)
                        .limit(5)
                        .mapToInt(x -> x)
                        .sum()
        );
    }

    public void WriteSumFromBegin() {
        IntStream
                .range(0, numList.size())
                .map(x -> numList.stream().limit(x+1).mapToInt(n -> n).sum())
                .filter(x -> x >= 10)
                .findFirst()
                .ifPresent(System.out::println);
    }

}
