class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int p=1;
        List<Integer> ans= new ArrayList<>();
        int i=0;
        
       while( p<(n+1)){
           if(i<n && nums[i]==p){
               while(i<n && nums[i]==p)i++;
           }
           else{
               ans.add(p);
           }
           p++;
       }
        return ans;
    }
}