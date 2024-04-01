package NumberSystem;

public class MissingNumber {

	public int missingNumber(int[] nums) {
        int n= nums.length;
        int curr_sum=0;
        int total_sm= n*(n+1)/2;
        for(int i=0;i<nums.length;i++){
            curr_sum+=nums[i];
        }
        return total_sm-curr_sum;
    }
}