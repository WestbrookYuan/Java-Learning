package Codes;

public class ValueTransfer {
    public static void main(String[] args) {
        int m =10;
        int n = m;
        System.out.println("m:" + m +" n:" + n);
        m = 20;
        System.out.println("m:" + m +" n:" + n);

        ValueTransfer valueTransfer = new ValueTransfer();
        ValueTransfer valueTransfer1 = valueTransfer;
    }
}
