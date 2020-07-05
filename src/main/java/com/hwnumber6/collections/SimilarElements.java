package main.java.com.hwnumber6.collections;

import java.util.ArrayList;

public class SimilarElements {
    public void checkElements() {
        ArrayList<Integer> firstArray = new ArrayList<>();
        firstArray.add(23);
        firstArray.add(48);
        firstArray.add(61);
        firstArray.add(76);
        firstArray.add(84);
        firstArray.add(21);
        System.out.println("\n First array values : " + firstArray);

        ArrayList<Integer> secondArray = new ArrayList<>();
        secondArray.add(29);
        secondArray.add(75);
        secondArray.add(41);
        secondArray.add(11);
        secondArray.add(48);
        secondArray.add(23);
        System.out.println("Second array values : " + secondArray);
        secondArray.retainAll(firstArray);
        System.out.println("Matching elements : " + secondArray);
    }
}
