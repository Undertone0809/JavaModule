import java.util.Scanner;

public class No1093 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int sum =0;
        //输入一个数字N，代表有N行需要求和
        int n =s.nextInt();

        //进行求和的N次循环
        for (int i = 0;i < n; i++){
            //第一次循环输入一个数字k
            int k = s.nextInt();
            //表示需要k次循环输入数字
            for (int j = 1; j <= k; j++) {
                a = s.nextInt();
                sum = sum + a;
            }
            System.out.println(sum);
            sum =0;
        }

    }
}