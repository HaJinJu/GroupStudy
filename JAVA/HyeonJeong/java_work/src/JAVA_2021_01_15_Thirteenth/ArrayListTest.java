package JAVA_2021_01_15_Thirteenth;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("MILK");
        list.add("BREAD");
        list.add("BUTTER");

        list.add(1, "APPLE");
        list.add(2, "GRAPE");

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("**********************");
        list.remove(3);

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}