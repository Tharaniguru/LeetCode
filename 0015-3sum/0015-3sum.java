
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int j,k;
        List<List<Integer>> arr=new ArrayList<>();
        
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        
        int n=nums.length;
        
        
        for(int i=0;i<n-2;i++){
            
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            
            j=i+1;
            k=n-1;
            while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
                
            if(sum==0){
                arr.add(Arrays.asList(nums[i],nums[j],nums[k]));
                while(j<k && nums[j]==nums[j+1]){
                    j++;
                }
                while(k>j && nums[k]==nums[k-1]){
                    k--;
                }
                j++;
                k--;
            }
                else if (sum<0)
                    j++;
                else
                    k--;
               
                
            }
            
            
        }
        
        return arr;
            
    }
}

    