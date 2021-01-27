/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/15 19:30
 * @version: 1.0$
 */
import java.util.Arrays;
import java.util.Scanner;
public class K1006 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            for(int i=0;i<n;i++){
                char []arr1 = s.next().toCharArray();
                int []arr2= new int[arr1.length];
                for(int j=0;j< arr1.length;j++){
                    arr2[j] =arr1[j] -48;
                }
                Arrays.sort(arr2);
                for(int j=0;j< arr2.length;j++){
                    for(int k = arr2.length-1;k >= 0;k--){
                        if(arr2[j] + arr2[k] == 10 && j != k){
                            arr2[j] =0;
                            arr2[k] =0;
                        }
                    }
                }
                int count = 0;
                for(int j=0;j< arr2.length;j++) {
                    if(arr2[j] != 0){
                        count ++;
                    }
                }
                System.out.println(count);
            }
        }
    }
}
