package Leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Most_Common_Word_819 {
    public static void main(String[] args) {
        String ans = mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"Hit"});
        System.out.println(ans);
    }

    public static String mostCommonWord(String paragraph, String[] banned) {

        HashMap<String, Integer> hashtable = new HashMap<>();

        HashSet<String> bannedStringSet = new HashSet<>();

        for (String str : banned) {
            bannedStringSet.add(str.toLowerCase());
        }

        String[] splitedParagraph = paragraph.split("[\\s!?',;.\"]+");

        for (String str : splitedParagraph) {
            hashtable.put(str.toLowerCase(), hashtable.getOrDefault(str.toLowerCase(), 0) + 1);
        }
        String ans = "";
        int maxFrequent = -1;
        for (Map.Entry<String, Integer> entry : hashtable.entrySet()) {
            if (maxFrequent < entry.getValue() && (!bannedStringSet.contains(entry.getKey()))) {
                ans = entry.getKey();
                maxFrequent = entry.getValue();
            }
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
//        bannedStringSet.stream().forEach(val -> {
//            System.out.println(val);
//        });
        System.out.println("------------");
        System.out.println(ans);
        System.out.println(maxFrequent);
        return ans;
    }
}
