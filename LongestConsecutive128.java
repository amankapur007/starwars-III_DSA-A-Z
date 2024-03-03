import java.util.HashMap;

public class LongestConsecutive128 {
    public static void main(String[] args) {
        int nums[] ={0,3,7,2,5,8,4,6,0,1};//{100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> visited = new HashMap<>();
        for(int n:nums){
            visited.put(n, false);
        }
        int max=0;
        for(int n:nums){
            int cur = 1;
            int next=n+1;
            visited.put(n, true);
            while(visited.containsKey(next) && !visited.get(next)){
                cur++;
                visited.put(next, true);
                next++;
            }

            int prev = n-1;
            while (visited.containsKey(prev) && !visited.get(prev)) {
                cur++;
                visited.put(prev, true);
                prev--;
            }
            max = Math.max(cur, max);
        }
        return max;   
    }
}
