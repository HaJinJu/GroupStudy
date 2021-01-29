package Thirteenth;

import java.util.ArrayList;

public class ArryaListTest {
    public static void main(String[] args) {
        ArrayList<String> List = new ArrayList<String>();

        List.add("MILK");
        List.add("BREAD");
        List.add("BUTTER");

        List.add(1, "APPLE");
        List.add(2, "GRAPE");

        for(int i=0; i<List.size(); i++) {
            System.out.println(List.get(i));
        }

        System.out.println("*************");

        List.remove(3);

        for (int i = 0; i < List.size(); i++) {
            System.out.println(List.get(i));
        }
    }
}
