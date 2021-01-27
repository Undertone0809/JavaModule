/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/13 16:51
 * @version: 1.0$
 */
import java.util.Scanner;
public class Test2020121303 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            //第一行
            for(int i =0;i<n;i++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int i =0;i<n+2;i++){
                System.out.print(" ");
            }
            for(int i =0;i< n;i++){
                System.out.print("*");
            }
            System.out.println();
            //第二部分
            int count =1;
            for(int i =0;i < (n+1)/2-1;i++){
                for(int j =0;j<n-i-1;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int j=0;j<i+count;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int j =0;j<n-i;j++){
                    System.out.print(" ");
                }
                System.out.println("*");
                count++;
            }
            //第三部分
            System.out.print(" ");
            for(int i =0;i<n+1;i++){
                System.out.print("*");

            }
            System.out.print("*");
            System.out.println();
            //第四部分
            System.out.print("*");
            for(int i =0;i<n+1;i++){
                System.out.print(" ");
            }
            System.out.print("  ");
            for(int i =0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
