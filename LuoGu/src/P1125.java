/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/4 22:59
 * @version: 1.0$
 */
import java.util.Scanner;
public class P1125 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            char []dic= new char[26];
            for (int i = 0;i<26;i++){
                dic[i] +=97+i;
            }
            String str= s.next();
            char []arr= str.toCharArray();
            int []count = new int[26];
            for (int i = 0; i < arr.length; i++) {
                for (int i1 = 0; i1 < 26; i1++) {
                    if (arr[i] == dic[i1]) count[i1]++;
                }
            }
            int max =1;
            int min =101;
            for (int i = 0; i < 26; i++) {
                if(count[i]!=0&&count[i]>max)max = count[i];
                if(count[i]!=0&&count[i]<min)min = count[i];
            }
            int mid = max-min;
            if(method(mid)){
                System.out.println("Lucky Word");
                System.out.println(mid);
            }else{
                System.out.println("No Answer");
                System.out.println(0);
            }
        }
    }
    public static boolean method(int num){
        if(num<2)return false;
        for (int i =2; i <= Math.sqrt(num); i++) {
            if(num%i==0)return false;
        }
        return true;
    }
}
