int partition(int* nums, int low, int high) {
    int pivot = nums[high];
    int i = (low - 1);

    for (int j = low; j <= high - 1; j++) {
        if (nums[j] < pivot) {
            i++;
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
    int temp = nums[i + 1];
    nums[i + 1] = nums[high];
    nums[high] = temp;
    return (i + 1);
}

void quickSort(int* nums, int low, int high) {
    if (low < high) {
        int pi = partition(nums, low, high);

        quickSort(nums, low, pi - 1);
        quickSort(nums, pi + 1, high);
    }
}


int findDuplicate(int* nums, int n) {
    quickSort(nums, 0, n - 1);

    for (int i = 1; i < n; i++) {
        if (nums[i] == nums[i - 1]) {
            return nums[i];
        }
    }

    return -1;  // In case no duplicate is found, though the problem guarantees at least one duplicate
}
