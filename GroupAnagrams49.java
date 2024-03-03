import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.DocFlavor.STRING;

public class GroupAnagrams49 {
    public static void main(String[] args) {
        String[] strs = {"bdddddddddd","bbbbbbbbbbc"};//{ "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> l = groupAnagramsFaster(strs);
        for (List<String> s : l) {
            System.out.println(s.toString());
        }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {

            int[] ch = new int[26];
            for (char c : s.toCharArray()) {
                ch[c - 'a']++;
            }
            String enc = "";
            for (int n : ch) {
                enc += n+"-";
            }
            System.out.println(enc);
            if (map.containsKey(enc)) {
                map.get(enc).add(s);
            } else {
                map.put(enc, new ArrayList<>());
                map.get(enc).add(s);
            }
        }
        for (List<String> v : map.values()) {
            res.add(v);
        }

        return res;
    }

    public static List<List<String>> groupAnagramsFaster(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String enc = new String(ch);
            if (map.containsKey(enc)) {
                map.get(enc).add(s);
            } else {
                map.put(enc, new ArrayList<>());
                map.get(enc).add(s);
            }
        }

        List<List<String>> res =  new ArrayList<>(map.values());
        return res;
    }
}
