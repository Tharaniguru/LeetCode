/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* intersect(int* nums1, int n1, int* nums2, int n2, int* returnSize) {
    int *arr=(int*)malloc(sizeof(int)*(n1<n2?n2 :n1));
    int k=0;
    for(int i=0;i<n1;i++){
        if(nums1[i]==-1){
            continue;
        }
        for(int j=0;j<n2;j++){
            if(nums1[i]==nums2[j]){
                arr[k]=nums1[i];
                nums1[i]=-1;
                nums2[j]=-1;
                k++;
                break;
            }
        }
    }
    *returnSize = k;
    return arr;
}