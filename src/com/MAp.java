package com;

import java.util.HashMap;
import java.util.Map;

public class MAp {
    public static void main(String[] args) {
        Map < Integer, String > studentInfo = new HashMap < > ();
        studentInfo.put(16, "Raja");
        studentInfo.put(18, "Raj");
        studentInfo.put(19, "Vi");
        System.out.println(studentInfo);
        System.out.println(studentInfo.values());
        System.out.println(studentInfo.keySet());
        System.out.println(studentInfo.get(16));
    }

}