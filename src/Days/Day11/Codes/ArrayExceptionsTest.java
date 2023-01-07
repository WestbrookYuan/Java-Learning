package Days.Day11.Codes;

public class ArrayExceptionsTest {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
//        System.out.println(nums[5]);
//        System.out.println(nums[-2]);
        int[] nums2 = {1,2,3,4,5};
        nums2 = null;
//        System.out.println(nums[2]);

        int[][] nums3 = new int[4][];
//        System.out.println(nums3[2][0]);
        String[] strings = new String[]{null, "BB", "CC"};
        System.out.println(strings[0].toString());
    }
}
