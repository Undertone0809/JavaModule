/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/28 16:41
 * @version: 1.0$
 */

import java.util.Scanner;
public class No2503 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            for(int i =0;i<n;i++){
                int a =s.nextInt();
                int b =s.nextInt();
                int c =s.nextInt();
                int d =s.nextInt();
                int x = b * d;
                int y = a * d + b * c;
                method(y,x,i,n);
            }
        }
    }
    //定义一个求最大公因数的方法
    //返回num1 num2被除完后的数字
    public static void method(int a ,int b,int i,int n){
        int num1 =a;
        int num2 =b;
        int result =0;//最大公约数
        if(a < b){
            int temp = b;
            b =a;
            a =temp;
        }
        int test =1;
        for(int k =0;;k++){
            test = a % b;
            if(test ==0){
                result =b;
                break;
            }
            a = b;
            b =test;
        }
        num1 = num1 / result;
        num2 = num2 / result;
        System.out.print(num1+" "+num2);
        if(i != n){
            System.out.println();
        }
    }
}
