package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(    hasSameLastDigit(15,405,605));
    }

    public static boolean hasSameLastDigit (int one, int two, int three) {

        if ((one < 10 || one > 1000 ) || (two < 10 || two > 1000 ) || (three < 10 || three  > 1000 )) {
            return false;
        }

        int oneLastDigit = one % 10;
        int twoLastDigit = two % 10;
        int threeLastDigit = three % 10;

        if (oneLastDigit == twoLastDigit || oneLastDigit == threeLastDigit || twoLastDigit == threeLastDigit) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isValid (int number) {

        if (number < 10 || number > 1000) {
            return false;
        } else {
            return true;
        }

    }
}
