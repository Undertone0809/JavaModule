/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/14 16:21
 * @version: 1.0$
 */
import java.util.*;
public class No1562 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            for(int i =0;i< n ;i++){
                int a =s.nextInt();
                int b =s.nextInt();
                int c =s.nextInt();
                int count =0;
                for(int j=1000;j< 10000;j++){
                    if(j % a ==0 && (j+1)%b==0 &&(j+2) % c == 0){
                        System.out.println(j);
                        break;
                    }
                    count++;
                    if(count == 9000){
                        System.out.println("Impossible");
                    }
                    }
                }
            }
        }
    }
