package org.example;

public class Calc {
    public String sum(String a, String b) {
        int result = Integer.parseInt(a) + Integer.parseInt(b);
        return String.valueOf(result);
    }
}
