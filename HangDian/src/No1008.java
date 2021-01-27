/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/25 18:14
 * @version: 1.0$
 */

import java.util.Scanner;
public class No1008 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n = s.nextInt();
            int []arr= new int[n];
            if(n ==0){
                break;
            }
            for(int i=0;i<n;i++){
                arr[i] =s.nextInt();
            }
            //先计算所有等待时间
            int min =5*n;
            //第一次上楼的时间
            min += arr[0]*6;
            for(int i=0;i< arr.length;i++){
                if(i < arr.length-1){
                    if(arr[i]-arr[i+1]>0){
                        min =min + 4*(arr[i] -arr[1+i]);
                    }if(arr[i]-arr[i+1]<0){
                        min =min + 6*(arr[i+1]-arr[i]);
                    }
                }
            }
            System.out.println(min);
        }
    }
}
