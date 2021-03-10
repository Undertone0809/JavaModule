/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/6 11:04
 * @version: 1.0$
 */
import java.util.ArrayList;
import java.util.Scanner;
public class P5732 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            ArrayList<Integer> arr =new ArrayList();
            int mid = 0;
            for (int i = 0; i < n; i++) {
                mid = s.nextInt();
                if(isZhiShu(mid)) arr.add(mid);
            }
            for(int i=0;i<arr.size()-1;i++){
                System.out.print(arr.get(i)+" ");
            }
            System.out.println(arr.get(arr.size()-1));
        }
    }

    public static boolean isZhiShu(int num){
        if(num < 2) return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
}
