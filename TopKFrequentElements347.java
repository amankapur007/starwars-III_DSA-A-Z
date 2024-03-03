import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements347 {
    public static void main(String[] args) {
        int nums[] = {4,1,-1,2,-1,2,3 };
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        // count frequency
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int i : nums) {
            frequency.put(i, frequency.getOrDefault(i, 0) + 1);
        }
        // {1=3,2=2,3=1}

        List<Integer>[] count = new List[nums.length + 1];
        for (int key : frequency.keySet()) {
            int freq = frequency.get(key);
            if (count[freq] == null) {
                count[freq] = new ArrayList<>();

            }
            count[freq].add(key);
        }
        List<Integer> res = new ArrayList<>();
        for (int l = count.length - 1; l > 0 && k > 0; l--) {
            if (count[l] != null) {
                res.addAll(count[l]);
                k=k-count[l].size();
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
