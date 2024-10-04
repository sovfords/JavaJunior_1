package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(4);
        numbers.add(9);
        numbers.add(3);
        numbers.add(8);

        System.out.println(grtAvrEven(numbers));
    }
    public  static Double  grtAvrEven(ArrayList<Integer> numbers)
    {
        double[] sum = new double[]{0};
        numbers.stream().filter(num -> num % 2 == 0 ).forEach(num -> sum[0] += num);
        return sum[0] / numbers.stream().filter(num -> num % 2 == 0 ).toList().size();
    }
}
