import java.util.Arrays;

public class ProductOfItSelf238 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }


    public static int[] productExceptSelf(int[] nums) {
        int left[] = new int[nums.length];
        left[0]=1;
        //[1,1,2,6]
        //[24,12,4,1]

        for(int i=0;i<nums.length-1;i++){
            left[i+1] = left[i]*nums[i];
        }

        int curr=1;
        for(int i=nums.length-1;i>0;i--){
            left[i-1] = curr*nums[i]*left[i-1];
            curr = nums[i]*curr;
        }
        return left;
    }
}
