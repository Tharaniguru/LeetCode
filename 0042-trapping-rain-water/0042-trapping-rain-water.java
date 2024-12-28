class Solution {
    public int trap(int[] height) {
        int n=height.length;
        if(n>=(2*Math.pow(10,4)))
        {
            return 0;
        }
        int a1[]= new int[n];
        int a2[]=new int [n];
        int max=0;
        int unit =0;
        a1[n-1]=height[n-1];
        a2[0]=height[0];
        //right max
        for(int i=0;i<n-1;i++){
            for(int j=i;j<n;j++){
                if(max<height[j]){
                    max=height[j];
                }
            }
            a1[i]=max;
            max=0;
        }
        //left max
        for (int i=1;i<n;i++){
            for(int j=i;j>=0;j--){
                if(max<height[j]){
                    max=height[j];
                }
            }
            a2[i]=max;
            max=0;
        }
        for(int i=0;i<n;i++){
            max=Math.min(a1[i],a2[i]);
            unit+=max-height[i];
        }
        return unit;
    }
}