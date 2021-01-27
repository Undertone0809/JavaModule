/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/25 17:56
 * @version: 1.0$
 */
import java.util.Scanner;
public class No2022 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int row =s.nextInt();
            int col =s.nextInt();
            long [][]arr=new long[row][col];
            for(int i =0;i< row;i++){
                for(int j =0;j< col;j++){
                    arr[i][j] = s.nextLong();
                }
            }
            long max =arr[0][0];
            int a =0;
            int b=0;
            for(int i =0;i< row;i++){
                for(int j =0;j< col;j++){
                    if(Math.abs(arr[i][j]) > Math.abs(max)){
                        max = arr[i][j];
                        a =i;
                        b =j;
                    }
                }
            }
            System.out.print(a + 1);
            System.out.print(" "+(b+1)+" ");
            System.out.print(max);
            System.out.println();
        }
    }
}
