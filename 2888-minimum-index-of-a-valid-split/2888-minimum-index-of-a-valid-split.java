import java.util.*;

class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int dominant = -1, totalCount = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > n / 2) {
                dominant = entry.getKey();
                totalCount = entry.getValue();
                break;
            }
        }

        if (dominant == -1) return -1; 
        int leftCount = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums.get(i) == dominant) {
                leftCount++;
            }
            if (leftCount * 2 > (i + 1)) {
                int rightCount = totalCount - leftCount;
                if (rightCount * 2 > (n - i - 1)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
