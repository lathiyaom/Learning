package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {10, 19, 12, 14, 15};
        int[] arr2 = {22, 23, 12};
        // Convert arr2 to a Set for fast lookup
        Set<Integer> set2 = Arrays.stream(arr2).boxed().collect(Collectors.toSet());

        // Filter arr using Stream to keep only elements also in arr2
        List<Integer> ans = Arrays.stream(arr)
                .filter(set2::contains)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(ans);
    }
}
