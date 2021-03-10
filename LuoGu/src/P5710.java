/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/4 19:52
 * @version: 1.0$
 */
import java.util.Scanner;
public class P5710 {
    public static void main(String[] args) {
        //1.是偶数
        //2.大于4且不大于12
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n = s.nextInt();
            int []arr= new int[4];
            boolean j1 = (n%2==0);
            boolean j2 = (n>4&&n<=12);
            if(j1&j2) arr[0] =1;
            if(j1|j2) arr[1] =1;
            if((j1 ==true && j2==false)||(j1==false&&j2==true))arr[2] =1;
            if(!j1 &&!j2) arr[3] =1;
            for (int i = 0; i < arr.length-1; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println(arr[3]);
        }
    }
}
