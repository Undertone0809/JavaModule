/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/23 22:56
 * @version: 1.0$
 */
import java.util.Scanner;
public class 自私放牧 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            int []start =new int[n];
            int []end   =new int[n];
            for (int i = 0; i < n; i++) {
                start[i] =s.nextInt();
                end[i] = s.nextInt();
            }
            for (int i = n-1; i >0; i--) {
                 for(int j=0;j < i;j++){
                 if(end[j] > end[j+1]){
                     int temp =end[j];
                     end[j] = end[j+1];
                     end[j+1] = temp;
                     temp =start[j];
                     start[j] =start[j+1];
                     start[j+1] =temp;
                 }
                 }
            }
            int count =0;
            for (int i = 0; i < n; i++) {
                if(i<n-1 && start[i] < end[i+1]){
                    count++;
                }
                //System.out.print(start[i]+" ");
               // System.out.println(end[i]);
            }
            System.out.println(count-1);
        
        }
    }
}
