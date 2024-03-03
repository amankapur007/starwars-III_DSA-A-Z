import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        int num[] = {1,1,1,3,3,4,3,2,4,2};//{1,2,3,4};//{1,2,3,1};
        System.out.println(containsDuplicate(num));      
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numberSet =  new HashSet<>();
        for (int n:nums){
            if(numberSet.contains(n)){
                return true;
            }
            numberSet.add(n);
        }
        return false;
    }
}
