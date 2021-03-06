package com.houle.enums;

import java.util.Arrays;
import java.util.Scanner;

public class EnumTest {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.print("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE) ");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size=" + size);
        System.out.println("abbreviation=" + size.getAbbreviation());
        if (size == Size.EXTRA_LARGE)
            System.out.println("Good job--you paid attention to the _.");
        System.out.println(Size.MEDIUM.toString());  // MEDIUM
        System.out.println(Arrays.toString(Size.values()));  // [SMALL, MEDIUM, LARGE, EXTRA_LARGE]
        System.out.println(Size.LARGE.ordinal());  // 2
    }
}

enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
    private String abbreviation;
    // 构造器
    private Size(String abbreviation) { this.abbreviation = abbreviation; }
    public String getAbbreviation() { return abbreviation; }
}