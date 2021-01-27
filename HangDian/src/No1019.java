/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/14 23:26
 * @version: 1.0$
 */
import java.util.Scanner;
public class No1019 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int n = s.nextInt();//n组数组
            for (int i = 0; i < n; i++) {
                int num =s.nextInt()-1;
                int a =s.nextInt();
                for(int j=0;j<num;j++){
                    a =lcm(a,s.nextInt());//迭代使用最小公倍数
                }
                System.out.println(a);
            }
        }
    }
    public static int gcd ( int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }

    public static int lcm ( int a, int b){
        return a * b / gcd(a, b);
    }
}
/*
import java.util.Scanner;
public class Main {

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
        Main mObj=new Main();
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
 */