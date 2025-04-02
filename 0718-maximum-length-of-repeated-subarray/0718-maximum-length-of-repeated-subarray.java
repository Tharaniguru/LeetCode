class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int count=0;
                if(nums1[i]==nums2[j]){
                    int one=i;
                    int two=j;
                    while (one < n && two < m && nums1[one] == nums2[two]) {
                        count++;
                        one++;
                        two++;
                    }
                }
                if(max<count){
                    max=count;
                }
            }

        }
        return max;
    }
}