package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromList {
    public static void main(String[] args) {
        ArrayList < String > name = new ArrayList < > (Arrays.asList("A", "B", "C", "D", "E", "F", "A", "E", "C"));
        System.out.println("ArrayList with Duplicate Value" + name);

        // Convert the arraylist into a set
        Set < String > set = new LinkedHashSet < > ();
        set.addAll(name);
        // clear using to delete al elements of arraylist
        name.clear();

        // add element from set to arraylist
        name.addAll(set);

        System.out.println("ArrayList without duplicate elements: " + name);
    }

}