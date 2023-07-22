public class MinSubArray {
    public static void main(String[] args){
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        
        for(int r = 0; r < nums.length; ++r){
            sum += nums[r];
            while (sum >= s){
                ans = Math.min(ans, r - 1 + 1);
                sum -= nums[1++];
            }
        }
        
        return ans != Integer.MAX_VALUE ? ans :0;
    }
} 
