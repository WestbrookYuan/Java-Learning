package Days.Day11.Codes;

import java.util.Arrays;

public class ArrayTools {
    public static void main(String[] args) {
        int[] nums = {1,3,2,4};
        int[] nums2 = {1,2,3,4};
        System.out.println(Arrays.equals(nums2, nums));
        System.out.println(Arrays.toString(nums));
        Arrays.fill(nums, 5);
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums2);
        int index = Arrays.binarySearch(nums2, 4);
        if(index >=0){
            System.out.println(index);
            System.out.println("found");
        }
        else {
            System.out.println(index);
            System.out.println("not found");
        }
    }
}
