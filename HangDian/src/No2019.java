/**
 * Problem Description
 * 有n(n<=100)个整数，已经按照从小到大顺序排列好，现在另外给一个整数x，请将该数插入到序列中，并使新的序列仍然有序。
 *
 *
 * Input
 * 输入数据包含多个测试实例，每组数据由两行组成，第一行是n和m，第二行是已经有序的n个数的数列。n和m同时为0标示输入数据的结束，本行不做处理。
 *
 *
 * Output
 * 对于每个测试实例，输出插入新的元素后的数列。
 *
 *
 * Sample Input
 * 3 3
 * 1 2 4
 * 0 0
 *
 *
 * Sample Output
 * 1 2 3 4
 */
import java.util.Arrays;
import java.util.Scanner;
public class No2019 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            int m =s.nextInt();
            int []array = new int[n];
            int []brray = new int[n+1];
            if(n ==0&& m==0){
                break;
            }
            for(int i =0;i < n;i++){
                array[i] = s.nextInt();
                brray[i] =array[i];
            }
            brray[n] = m;
            Arrays.sort(brray);
            for(int i =0;i <brray.length; i++){
                System.out.print(brray[i]);
                if(i < brray.length -1){
                    System.out.print(" ");
                }else{
                    System.out.println();
                }
            }
        }
    }
}
