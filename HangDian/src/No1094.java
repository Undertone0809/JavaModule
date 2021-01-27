import java.util.Scanner;

public class No1094 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n,a;
        int sum =0;
        while(s.hasNext()) {
            n = s.nextInt();//输入一个数字N,如果不是0，则按照PLAN A

                for (int i = 1; i <= n; i++) {
                    a = s.nextInt();
                    sum = sum + a;//表示后面还有N个数字要输入，即要循环N次
                }
                System.out.println(sum);
                sum = 0;
            }
        }

        //上面为一组，以0为结束组
    }

