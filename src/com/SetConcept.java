package com;

import java.util.LinkedHashSet;

public class SetConcept {
    public static void main(String[] args) {
        LinkedHashSet < Integer > raj = new LinkedHashSet < Integer > ();
        // it contains unique value
        raj.add(78);
        raj.add(852);
        raj.add(962);
        raj.add(45);
        raj.add(7565);
        raj.add(45); // it is duplicate value
        System.out.println(raj);
    }

}