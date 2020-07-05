package main.java.com.hwnumber6.collections;

import java.util.ArrayList;

public class DivisionBy3 {
    public void deleteDivisibleNum() {
        ArrayList<Integer> divisionBy3 = new ArrayList<>();
        divisionBy3.add(3);
        divisionBy3.add(9);
        divisionBy3.add(11);
        divisionBy3.add(18);
        divisionBy3.add(20);
        divisionBy3.add(22);
        divisionBy3.removeIf(i -> i % 3 == 0);
        System.out.println("\n Numbers that are not divisible by 3 : " + divisionBy3);
    }
}
