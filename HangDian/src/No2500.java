/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/26 22:49
 * @version: 1.0$
 */

import java.util.Scanner;
public class No2500 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            int n=s.nextInt();
            for(int i =0;i < n;i++){
                int a =s.nextInt();
                for(int j=0;j<a*3;j++){
                    for(int k =0;k<a;k++){
                        System.out.print("HDU");
                        if(k == a-1){
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}
