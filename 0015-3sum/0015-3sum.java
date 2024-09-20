import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(nums); // Sort the array first

        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                // Skip duplicates for the first number
                continue;
            }

            int j = i + 1, k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                
                if (sum == 0) {
                    arr.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    // Skip duplicates for the second number
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    // Skip duplicates for the third number
                    while (j < k && nums[k] == nums[k - 1]) k--;

                    j++;
                    k--;
                } else if (sum < 0) {
                    j++; // Move the left pointer right to increase the sum
                } else {
                    k--; // Move the right pointer left to decrease the sum
                }
            }
        }

        return arr;
    }
}
