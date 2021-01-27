/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/24 17:05
 * @version: 1.0$
 */
import java.util.Scanner;
public class No1020 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            int n=s.nextInt();
            for(int j =0;j<n;j++){

                String str=s.next();
                char []arr=new char[str.length()+1];
                for(int i=0;i<str.length();i++){
                    arr[i]=str.charAt(i);
                }
                arr[str.length()]=' ';
                int count=1;
                for(int i=0;i<arr.length-1;i++) {
                    if(arr[i+1]==arr[i]) {
                        count++;
                    }else{
                        if(count==1) {
                            System.out.print(arr[i]);
                        }
                        else{
                            System.out.print(count+""+arr[i]);
                        }
                        count=1;
                    }
                }
                System.out.println();
            }
        }
    }
}

