class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int max=0;
        for(int i=0;i<n-1;i++){
            int count=1;
            int flag=0;
            for(int j=i+1;j<n;j++){
                if(nums[j]==nums[i]){
                    count++;
                }
                else if(nums[j]-nums[i]==1){
                    flag=1;
                    count++;
                }
                else{
                    break;    
                }
            }
            if(flag==1 && max<count){
                max=count;
            }
        }
        return max;
    }
}