
import java.math.BigInteger;
import  java.util.*;
public class No1002 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n = s.nextInt();
            for(int i =1;i <= n;i++){
                BigInteger a = s.nextBigInteger();
                BigInteger b = s.nextBigInteger();
                System.out.println("Case "+ i +":");
                System.out.println(a+" + " + b + " = " + a.add(b));
                if(i != n){
                    System.out.println();
                }
            }
        }
    }
}
