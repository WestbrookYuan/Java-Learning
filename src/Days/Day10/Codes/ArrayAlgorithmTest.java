package Days.Day10.Codes;

import java.util.Arrays;

public class ArrayAlgorithmTest {

    public static void main(String[] args) {
        int[][] syb = yanghui(3);
        for(int i=0; i<3;i++){
            System.out.println(Arrays.toString(syb[i]));
        }

        int [][] test = huixing(4);
        for (int i=0;i<test.length;i++){
            System.out.println(Arrays.toString(test[i]));
        }

        int[] arr = new int[10];

        for (int i=0;i<10;i++){
            arr[i] = (int)(Math.random() * (99-10 + 1) + 10);
        }
        int maxValue = arr[0];
        int minValue = arr[0];
        int sum = 0;
        for(int i=0;i<10;i++){
            maxValue = maxValue > arr[i]? maxValue:arr[i];
            minValue = minValue < arr[i]? maxValue:arr[i];
            sum += arr[i];
        }
        double ave = (double) (sum/10);

        int[] arr1 = new int[]{2,3,5,7,11,13,17,19};
        int[] arr2 = arr1;
        System.out.println(Arrays.toString(arr1));
//        for (int i =0; i< 8; i++){
//            arr2[i] = i;
//        }
        int[] arr3 = new int[arr1.length];
        for (int i=0; i< arr1.length; i++){
            arr3[i] = arr1[i];
        }
        for (int i =0; i< 8; i++){
            arr3[i] = i;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        int midIndex = (arr3.length -1 + 0) / 2;

        for (int i=0; i < midIndex; i++){
            int temp = arr3[arr3.length-1-i];
            arr3[arr3.length-1-i] = arr3[i];
            arr3[i] = temp;
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static int[][] yanghui(int num){
        int[][] yanghui = new int[num][];
        for(int i=0; i<num;i++){
            yanghui[i] = new int[i+1];
            yanghui[i][0] = 1;
            yanghui[i][i] = 1;
        }
        for(int i=2;i<num;i++){
            for (int j=1; j<i;j++){
                yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
            }
        }
        return yanghui;
    }

    public static int[][] huixing(int num){
        int row, col;
        row = col = num;
        int top = 0;
        int bottom = row -1;
        int left = 0;
        int right = col-1;
        int[][] res = new int[row][col];
        int[] nums = new int[num * num];
        for(int i=0;i<(num * num);i++){
            nums[i] = i+1;
        }

        int index = 0;
        while (index < num * num){
            for(int i=left; i< right+1;i++){
                res[top][i] = nums[index];
                index ++;
            }
            top += 1;
            for(int i=top; i< bottom+1;i++){
                res[i][right] = nums[index];
                index ++;
            }
            right -= 1;

            for(int i=right; i > left-1; i--){
                System.out.println(res[bottom][i]);
                res[bottom][i] = nums[index];
                index ++;
            }
            bottom -= 1;

            for(int i=bottom; i > top-1; i--){
                System.out.println(res[i][left]);
                res[i][left] = nums[index];
                index ++;
            }
            left += 1;

        }
        return res;



    }
}
