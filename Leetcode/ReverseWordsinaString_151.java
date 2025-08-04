package Leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsinaString_151 {
    public static void main(String[] args) {
        String str = "the sky is blue";
        str = str.trim();
        List<String> strings = Arrays.asList(str.split("\\s+"));
        Collections.reverse(strings);
        System.out.println(String.join(" ", strings));
    }
}
