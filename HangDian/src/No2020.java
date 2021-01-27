/**
 *
 Problem Description
 输入n(n<=100)个整数，按照绝对值从大到小排序后输出。题目保证对于每一个测试实例，所有的数的绝对值都不相等。


 Input
 输入数据有多组，每组占一行，每行的第一个数字为n,接着是n个整数，n=0表示输入数据的结束，不做处理。


 Output
 对于每个测试实例，输出排序后的结果，两个数之间用一个空格隔开。每个测试实例占一行。


 Sample Input
 3 3 -4 2
 4 0 1 2 -3
 0


 Sample Output
 -4 3 2
 -3 2 1 0

 */
import  java.util.Scanner;
public class No2020 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            if(n ==0){
                break;
            }
            int []array =new int[n];
            for(int i =0;i < n ; i++){
                array[i] = s.nextInt();
            }
            AbsSort(array);
            for(int i=0 ;i < array.length;i++){
                System.out.print(array[i]);
                if(i < array.length -1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void AbsSort(int array[]) {
        int t = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++)
                if (Math.abs(array[j]) < Math.abs(array[j + 1])) {
                    t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
        }
    }
}
