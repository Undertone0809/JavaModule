/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/24 16:14
 * @version: 1.0$
 */

import java.util.Arrays;
import java.util.Scanner;
public class No2028 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            int []arr =new int[n];
            int []tank =new int[n*n];
            Arrays.fill(tank,1);
            for(int i=0;i <n;i++){
                arr[i]=s.nextInt();
            }
            int count =0;
            for(int i=0;i< n;i++){
                for(int j=0;j <n;j++){
                    tank[count] = arr[i]*arr[i+1];
                    count++;
                }
            }
            int count2[] =new int[tank.length];
            for(int i=0;i < tank.length;i++){
                if(tank[0] ==0){ }
                for(int j=0;j < arr.length;j++){
                    if(tank[i]%arr[j] !=0 ){
                        count2[i]++;
                    }
                }

            }

        }
    }
}
