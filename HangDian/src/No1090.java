import java.util.Scanner;

public class No1090 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b,n;
        while (s.hasNext()) {
            n = s.nextInt();
            for (int i = 0; i < n; i++) {
                a = s.nextInt();
                b = s.nextInt();
                System.out.println(a + b);
            }
        }
    }
}
