/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/6 15:28
 * @version: 1.0$
 */
/**
 * 化简方法
 * 如果数字可以被2或者3整除，则不用判断质数
 *
 */
package 天梯赛预选赛;
import java.util.Scanner;
public class No7_7 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            s.nextInt();//n位数字
            int k = s.nextInt();//间隔
            String str= s.next();
            boolean youPrime = false;//是否有质数
            char[] arr= str.toCharArray();//一堆数字
            if(k!=1){
                boolean exist = false;
                for(int i=0;i <str.length()-k+1;i++){
                    //arr[i]到arr[i+k-1]
                    String mid ="";

                    for(int j=i;j<i+k;j++){
                        //append
                        mid +=arr[j];
                    }
                    //String转int
                    int ki =Integer.parseInt(mid);
                    if(ki%2==0||ki%3==0){
                        //不用理
                    }else if(isPrime(ki)){
                        System.out.println(mid);
                        exist = true;
                        break;
                    }

                }
                if(!exist)System.out.println("404");

            }else{
                //遍历,先到 2 3 5 7,就结束
                for (int i = 0; i < str.length(); i++) {
                    if(arr[i]==50||arr[i]==51||arr[i]==53||arr[i]==55){
                        System.out.println(arr[i]);
                    }
                }
            }
        }
    }
    public static boolean isPrime(int num){
        if(num < 2) return false;
        for(int i=2;i*i<=num;i++){
            if(num % i ==0) return false;
        }
        return  true;
    }
}
