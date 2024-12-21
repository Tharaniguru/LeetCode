class Solution {
    public int[] decrypt(int[] arr, int k) {
        int n = arr.length;
        int[] result = new int[n]; 

        if (k == 0) {
            return result; 
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            int steps = Math.abs(k); 
            for (int j = 1; j <= steps; j++) {
                if (k > 0) { 
                    sum += arr[(i + j) % n]; 
                } else { 
                    sum += arr[(i - j + n) % n]; 
                }
            }
            result[i] = sum;
        }

        return result; // Return the computed array
    }
}
