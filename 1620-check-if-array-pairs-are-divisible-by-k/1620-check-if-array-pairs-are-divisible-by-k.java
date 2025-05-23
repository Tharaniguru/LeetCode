import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canArrange(int[] arr, int k) {
        Map<Integer, Integer> remainderCount = new HashMap<>();
        
        for (int num : arr) {
            int rem = ((num % k) + k) % k; 
            remainderCount.put(rem, remainderCount.getOrDefault(rem, 0) + 1);
        }
        
        for (int rem : remainderCount.keySet()) {
            int count = remainderCount.get(rem);
            if (rem == 0) { 
                if (count % 2 != 0) return false;
            } else {
                int complement = k - rem;
                if (remainderCount.getOrDefault(complement, 0) != count) return false;
            }
        }
        
        return true;
    }
}
