package leetcode;

import java.util.Arrays;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1;
        return newNumber;
    }


    public static void main(String[] args) {
        int[] digits = {9, 8, 7, 6, 5, 4, 3, 2, 1, 9};
        PlusOne p = new PlusOne();
        System.out.println(Arrays.toString(p.plusOne(digits)));
    }

}
