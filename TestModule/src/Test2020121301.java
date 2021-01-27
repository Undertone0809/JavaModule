/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/13 13:17
 * @version: 1.0$
 */
import java.util.*;
public class Test2020121301 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            String str1 =s.next();
            String str2="clycdd";
            String str3="clytxdy";
            char []arr1= str1.toCharArray();
            char []arr2= str2.toCharArray();
            char []arr3= str3.toCharArray();
            int count =0;
            if(arr1[4]=='d'){
                for(int j=0;j< arr2.length;j++){
                    if(arr1[j]==arr2[j]){
                        count++;
                    }
                }
                if(count == arr2.length){
                    System.out.println("clycdd");
                }
            }else{
                for(int j =0;j< arr3.length;j++){
                    if(arr1[j] == arr3[j]){
                        count++;
                    }
                    if(count == arr3.length){
                        System.out.println("clytxdy");
                    }
                }
            }
        }
    }
}