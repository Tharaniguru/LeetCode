class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        int sum=0;
        int min=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    sum=nums[i]+nums[j]+nums[k];
                    int dis=Math.abs(sum-target);
                    if(dis<min){
                        min=dis;
                        ans=sum;
                    }
                    }
                }
            }
        return ans;
        }
        
    }
