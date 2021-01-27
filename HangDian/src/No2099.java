/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/30 12:55
 * @version: 1.0$
 */
import java.util.Arrays;
import java.util.Scanner;
public class No2099 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        while(s.hasNext()){
            int a =s.nextInt();
            int b =s.nextInt();
            if(a == b && b ==0){
                break;
            }
            int c = a *100;
            int count1 = 0;
            int count2 = 0;
            for(int i =0;i < 100;i++){
                int temp =c + i;
                if(temp % b ==0 && i ==0){
                    count1++;
                }else if(temp % b ==0){
                    count1++;
                }
            }
            int ak =0;
            for(int i=0;i<=99;i++) {
                int temp = c + i;
                if(temp%b==0 && ak==0) {
                    System.out.printf("%02d",i);
                    ak=1;
                }
                else if(temp % b==0)
                    System.out.printf(" %02d",i);
            }
            System.out.println();
                }
            }
        }