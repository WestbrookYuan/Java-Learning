package Days.Day10.Codes;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] test = {1,3,5,2,3,8,5,9,5,3};
//        selectSort(test);
//        bubbleSort(test);
//        insertSort(test);
        updateInsertSort(test);
        System.out.println(Arrays.toString(test));
    }

    public static void swap(int[] nums, int origin,int after){
        int temp = nums[origin];
        nums[origin] = nums[after];
        nums[after] = temp;
    }
    public static void selectSort(int[] nums){
        for (int start = 0; start < nums.length;start++){
            int minIndex = start;
            for (int i=start+1;i<nums.length;i++){
                if (nums[i] < nums[minIndex]) {
                    minIndex = i;
                }
            }
            swap(nums, minIndex, start);
        }

    }

    public static void bubbleSort(int[] nums){
        int length = nums.length;
        boolean swapped = false;
        for (int i=0; i < length - 1; i++){
            for (int j = 0; j < length - 1 - i; j++){
                if (nums[j] > nums[j+1]){
                    swap(nums, j, j+1);
                    swapped = true;
                }
            }
            if (! swapped){
                return;
            }
        }
    }
    public static void insertSort(int[] nums){
        for (int i=1;i<nums.length;i++){
            int temp = nums[i];
            int j;
            for (j=i-1;j>=0;j--){
                if (nums[j] > temp){
                    nums[j+1] = nums[j];
                }
                else {
                    break;
                }
            }
            nums[j+1] = temp;
        }
    }
    public static void updateInsertSort(int[] nums){
        for (int i=1;i<nums.length;i++){
            int key = nums[i];
            int l = 0;
            int r = i-1;
            while (l <= r){
                int mid = (l + r) / 2;
                if (nums[mid] > key){
                    r = mid - 1;
                }
                else {
                    l = mid + 1;
                }
            }

            for (int j = i-1; j >= l;j--){
                nums[j+1] = nums[j];
            }

            nums[l] = key;
        }
    }
}
