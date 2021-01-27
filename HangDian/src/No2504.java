/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/26 23:43
 * @version: 1.0$
 */

import java.util.Scanner;
public class No2504 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            for(int i =0;i < n;i++){
                int a =s.nextInt();//数字A
                int b =s.nextInt();//最大公约数
                int c = 0;//数字C
                for(int j =1;;j++){
                    if(j == b){

                    }else {
                        if (method(a, j) == b) {
                            System.out.println(j);
                            break;
                        }
                    }
                }
            }
        }
    }
    //定义一个方法，输入a和i
    //观察是否输出c
    //输出c return true
    public static int method(int a ,int b) {
        if(a < b){
            int temp =a ;
            a = b;
            b = temp;
        }
        int answer =0;
        while(true){
            int test = a % b;
            if(test ==0){
                answer = b;
                break;
            }
            a = b ;
            b = test;
        }
        return answer;
    }

}
