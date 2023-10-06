import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int size = str.length();
        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i < size/2; i++) {
            sumA += str.charAt(i) - '0';
        }

        for (int i = size / 2; i < size; i++) {
            sumB += str.charAt(i) - '0';
        }

        if (sumA == sumB) {
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }
    }
}
