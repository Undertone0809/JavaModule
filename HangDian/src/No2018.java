/**
 * Problem Description
 * 有一头母牛，它每年年初生一头小母牛。每头小母牛从第四个年头开始，每年年初也生一头小母牛。请编程实现在第n年的时候，共有多少头母牛？
 *
 *
 * Input
 * 输入数据由多个测试实例组成，每个测试实例占一行，包括一个整数n(0<n<55)，n的含义如题目中描述。
 * n=0表示输入数据的结束，不做处理。
 *
 *
 * Output
 * 对于每个测试实例，输出在第n年的时候母牛的数量。
 * 每个输出占一行。
 *
 *
 * Sample Input
 * 2
 * 4
 * 5
 * 0
 *
 *
 * Sample Output
 * 2
 * 4
 * 6
 */

import java.util.Scanner;
public class No2018 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            //第n年的数量等于(n-1)数量+(n-3)年的数量
            //array[n] = array[n-1] + array[n-3]
            int []array =new int[55];
            array[0] =1;
            array[1] =2;
            array[2] =3;
            array[3] =4;
            array[4] =6;
            for(int i =5;i < array.length;i++){
                array[i] = array[i-1] + array[i-3];
            }
            int n = s.nextInt();

            if(n ==0){
                break;
            }else if(n > 0){System.out.println(array[n-1]);}
        }
    }
}
