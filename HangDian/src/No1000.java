import java.util.Scanner;

public class No1000 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNextInt()) {
            int a = s.nextInt();//接受整数型字符串
            int b = s.nextInt();//again
            System.out.println(a + b);
        }
    }
}

