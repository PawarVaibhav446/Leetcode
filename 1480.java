/* 
1480. Running Sum of 1d Array

Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
*/

class RunningArray{
    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        for (int j = 0; j < result.length; j++) {
            System.out.print(result[j] + " ");
        }
    }
}
