package main.java.com.hwnumber6.collections;

import java.util.ArrayList;

public class FruitList {
    public void replaceFruit() {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("apricot");
        fruits.add("kiwi");
        fruits.add("orange");
        fruits.add("plump");
        System.out.println("\n Current fruits : " + fruits);
        int replace = fruits.indexOf("orange");
        fruits.set(replace, "grapefruit");
        System.out.println(" Really you want to take orange ? Better take grapefruit " + fruits);
    }
}
