class Solution {
    public int minOperations(int[][] grid, int x) {
        int n=grid.length;
        int m=grid[0].length;
        int arr[] = new int [n*m];
        int k=0;
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[k]=grid[i][j];
                k++;
            }
        }
        int count=0;
        Arrays.sort(arr);
        int median = arr[k/2];
        for(int i=0;i<k;i++){
            if((arr[i]-median)%x!=0){
                return -1;
            }
        }
        for(int i=0;i<k;i++){
            count+=Math.abs(arr[i]-median)/x;
        }
        return count;
    }
    
}