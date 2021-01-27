import java.util.Scanner;

/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/3 22:17
 * @version: 1.0$
 */
public class No2075 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            for(int i=0;i < n;i++){
                long a =s.nextLong();
                long b =s.nextLong();
                long temp =0;
                if(a>b){
                    temp = a;
                    a = b;
                    b = temp;
                }
                if(b % a ==0){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}


