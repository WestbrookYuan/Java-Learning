package Days.Day06.Codes;

import java.io.InputStream;
import java.util.Objects;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int num = scanner.nextInt();
            System.out.println(num);
        }
    }
}
