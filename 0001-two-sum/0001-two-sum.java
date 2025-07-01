class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer ,Integer> twosum=new HashMap<>();
        int n=nums.length;
        // Arrays.sort(nums);        
        for(int i=0;i<n;i++){
            twosum.put(nums[i],i);
        }
        int ans[]=new int[2];
        // int k=0;
        for(int i=0;i<n;i++){

            int comp=target-nums[i];
            if(twosum.containsKey(comp) && twosum.get(comp) != i){
                ans[0]=i;
                ans[1]=twosum.get(comp);
            }

        }
        return ans;
        
    }
}