package Days.Day12.Codes;

public class OverloadTest {
    public static void main(String[] args) {

    }
    public void getSum(int i, int j){
        System.out.println(i + j);
    }
    public void getSum(int i, int j, int k){
        System.out.println(i + j + k);
    }
    public void getSum(double i, double j, double e){
        System.out.println(i + j);
    }
//    public int getSum(double i, double j){
//        System.out.println(i + j);
//    }

    void getSum(double i, double j){
        System.out.println(i + j);
    }
}
