/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/6 13:27
 * @version: 1.0$
 */
import java.util.Scanner;
public class B_拯救小A {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int count =0;
            for(int i =0;;i++){
                String str= s.next();
                char []arr=str.toCharArray();
                for(int j =0;j< arr.length;j++){
                    if(arr[j] == 'a'){
                        count++;
                    }
                }
                if(str.equals(".")){
                    System.out.println(count);
                    break;
                }

            }
        }
    }
}
