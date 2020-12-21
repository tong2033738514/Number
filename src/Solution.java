/**
 * 连续子数组的和
 */
public class Solution {

//    public int FindGreatestSumOfSubArray(int[] array) {
//
//        int max = array[0];
//        for(int i=1;i<array.length;i++){
//            array[i]+=Math.max(array[i-1],0);
//            max = Math.max(array[i-1],max);
//        }
//        return max;
//    }

    public int FindGreatestSumOfSubArray(int[] array){
        int n = array.length;
        int[] dp = new int[n+1];

        int res = array[0];
        for(int i=1;i<=n;i++){
            dp[i] = Math.max(array[i-1],dp[i-1]+array[i-1]);
            res=Math.max(res,dp[i]);
        }
        return  res;
    }
}
