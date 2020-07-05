package main.java.com.hwnumber6;

import main.java.com.hwnumber6.collections.DivisionBy3;
import main.java.com.hwnumber6.collections.FruitList;
import main.java.com.hwnumber6.collections.SimilarElements;

public class Main {

    public static void main(String[] args) {
        DivisionBy3 divisionBy3 = new DivisionBy3();
        divisionBy3.deleteDivisibleNum();
        FruitList fruitList = new FruitList();
        fruitList.replaceFruit();
        SimilarElements similarElements = new SimilarElements();
        similarElements.checkElements();
    }
}
