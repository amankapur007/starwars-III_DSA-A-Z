import java.util.Arrays;
import java.util.HashMap;

public class TwoSum1 {
    public static void main(String[] args) {
        int nums[] = {3,2,4};//{2,7,11,15};
        int target = 6;//9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> diff =  new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if(diff.containsKey(target-nums[i])){
                return new int[]{ diff.get(target-nums[i]), i};
            }
            diff.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}
