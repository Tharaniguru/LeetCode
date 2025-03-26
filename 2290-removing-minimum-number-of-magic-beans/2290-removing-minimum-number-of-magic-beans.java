class Solution {
    public long minimumRemoval(int[] beans) {
         Arrays.sort(beans);
        long totalSum = 0, minRemovals = Long.MAX_VALUE;
        int n = beans.length;
        
        for (int b : beans) totalSum += b; 
        
        for (int i = 0; i < n; i++) {
            long beansKept = (long) beans[i] * (n - i);
            long removals = totalSum - beansKept;
            minRemovals = Math.min(minRemovals, removals);
        }
        
        return minRemovals;

    }
}