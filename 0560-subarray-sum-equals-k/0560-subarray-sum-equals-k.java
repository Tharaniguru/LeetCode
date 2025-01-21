class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i]+(i > 0 ? arr[i - 1] : 0);
        }
        // int j=0;
       HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            
            if (map.containsKey(arr[i] - k)) {
                count += map.get(arr[i] - k);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        return count; 
    }
}