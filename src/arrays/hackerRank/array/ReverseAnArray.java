package arrays.hackerRank.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.hackerrank.com/challenges/arrays-ds/problem?isFullScreen=true

public class ReverseAnArray {
    public static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            arr.add(a.get(a.size() - i - 1));

        }
        return arr;
    }

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 239, 3, 4, 0,30567);
        List<Integer> reversedList = reverseArray(myList);
        System.out.println(reversedList);
    }
}
