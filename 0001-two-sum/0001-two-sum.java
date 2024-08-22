class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int i,j;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                int sum=nums[i]+nums[j];
                if(sum==target){
                int []arr={i,j};
                return arr;
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution"); 
    }

}