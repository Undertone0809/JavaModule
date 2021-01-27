/**
 * Problem Description
 * 输入n(n<100)个数，找出其中最小的数，将它与最前面的数交换后输出这些数。
 *
 *
 * Input
 * 输入数据有多组，每组占一行，每行的开始是一个整数n，表示这个测试实例的数值的个数，跟着就是n个整数。n=0表示输入的结束，不做处理。
 *
 *
 * Output
 * 对于每组输入数据，输出交换后的数列，每组输出占一行。
 *
 *
 * Sample Input
 * 4 2 1 3 4
 * 5 5 4 3 2 1
 * 0
 *
 *
 * Sample Output
 * 1 2 3 4
 * 1 4 3 2 5
 */

import java.util.Scanner;
public class No2016 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            if(n == 0){
                break;
            }
            int array[] =new int[n] ;
            for(int i =0;i < n ;i++){
                array[i]=s.nextInt();
            }
            int count = 0;
            int min = array[0];
            int temp = array[0];
            for(int i =0;i < array.length;i++){
                if(array[i] < min){
                    min =array[i];
                    count = i;
                }
            }
            array[0] =min;
            array[count] = temp;
            for(int i =0;i < array.length;i++){
                System.out.print(array[i]);
                if(i < array.length -1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
