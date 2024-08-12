int maxArea(int* height, int n) {
    int water;
    int max_water=0;
    int left=0;
    int right=n-1;
    
    
    while(left<right){
        
            if(height[left]>height[right]){
                water=(height[right])*(right-left);
            }
            else{
                water=(height[left])*(right-left);
            }
            
            if(water>max_water){
                max_water=water;
            }
            if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    return max_water;
}