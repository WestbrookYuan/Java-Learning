package Codes;

public class parametersTest {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        System.out.println("m: " + m + " n:" + n);
        new parametersTest().swap(m, n);
        System.out.println("m: " + m + " n:" + n);
        int temp = m;
        m = n;
        n = temp;
        System.out.println("m: " + m + " n:" + n);

        Data data = new Data();
        data.m = 10;
        data.n = 20;
        new parametersTest().swap(data.m, data.n);
        System.out.println(data.toString());
        new parametersTest().swap(data);
        System.out.println(data.toString());
    }

    public void swap(int m, int n){ // 换型参
        int temp = m;
        m = n;
        n = temp;
    }

    public void swap(Data data){
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }
}

class Data{
    int m, n;

    @Override
    public String toString() {
        return "Data{" +
                "m=" + m +
                ", n=" + n +
                '}';
    }
}
