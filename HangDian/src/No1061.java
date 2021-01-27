import java.util.Scanner;

public class No1061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
                long b = method(a, a, 10);
                System.out.println(b);
            }
        }
    }
    static long method(long a, long b, int c) {
        a = a % c;
        long sum = 1;
        while (true) {
            if (b == 0) {
                break;
            }
            if (b % 2 == 1) {
                sum = (sum * a) % c;
            }
            a = (a * a) % c;
            b /= 2;
        }
        return sum;
    }
}