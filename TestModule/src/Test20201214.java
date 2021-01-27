/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/14 23:55
 * @version: 1.0$
 */

import java.util.Scanner;
public class Test20201214 {
    int gcd(int a,int b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    int lcm(int a,int b){
        long tmp=(long)a*b;
        int x=gcd(a,b);
        tmp/=x;
        return (int)tmp;
    }
    public static void main(String[] args) {
        int t;
        Scanner cin=new Scanner(System.in);
        t=cin.nextInt();
        Test20201214 mObj=new Test20201214();
        while(t!=0){
            --t;
            int m=cin.nextInt();
            int ans=cin.nextInt();
            int b;
            for(int i=1;i<m;++i){
                b=cin.nextInt();
                ans=mObj.lcm(ans, b);
            }
            System.out.println(ans);
        }
        cin.close();
    }

}