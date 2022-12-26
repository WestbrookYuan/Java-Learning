package Days.Day09.Codes;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int num;
        num = 10;
        int id = 1001;
        // static
        int[] ids = new int[]{1001, 1002, 1003};
        int[] idss = {1001, 1002, 1003};
        // dynamic
        String[] names = new String[10];
        System.out.println(ids[0]);
        names[0] = "syb";
        names[1] = "kxd";
        // names[10] = "overflow";
        for (int i=0; i<names.length;i++){
            System.out.println(names[i]);
        }
        // static
        int[][] haha = new int[][]{{1,2,3}, {4,5}, {6,7,8}};
        int[][] hahaha = {{1,2,3}, {4,5}, {6,7,8}};
        // dynamic
        int[][] lol = new int[3][4];
        String[][] strings = new String[3][];
        for(int i=0; i< lol.length; i++){
            for(int j=0;j< lol[0].length;j++){
                System.out.println(lol[i][j]);
            }
        }


        int[][] yanghui = new int[10][];
        for(int i=0; i<10;i++){
            yanghui[i] = new int[i+1];
            yanghui[i][0] = 1;
            yanghui[i][i] = 1;
        }
        for(int i=2;i<10;i++){
            for (int j=1; j<i;j++){
                yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
            }
        }

        for(int i=0;i<10;i++){
            System.out.println(Arrays.toString(yanghui[i]));
        }

        int[] testArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(testArray, 0));
    }
    public static boolean linearSearch(int[] nums, int target){
        for (int i=0;i<nums.length;i++){
            if(target == nums[i]){
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] nums, int target){
        int l = 0;
        int r = nums.length - 1;
        int mid;
        while (l <= r){
            mid = (r - l) / 2 + l;
            if (nums[mid] == target){
                return true;
            } else if (nums[mid] < target ) {
                l = mid+1;
            }
            else {
                r = mid-1;
            }
        }

        return false;

    }
}
