/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/4 20:43
 * @version: 1.0$
 */
import java.util.Scanner;
public class No2092 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            int m =s.nextInt();
            if(n ==0 && m == 0){
                break;
            }
            method(n,m);
        }
    }
    public static void method(int n,int m){
        if(n*n-4*m < 0){//无实数根
            System.out.println("No");
        }else if(n * n - 4 * m == 0){//存在一个实数根
            double b = n + Math.sqrt(n*n-4*m)/2;
            if((int)b ==b){
                int a =n -(int)b;
                if(a *(int)b ==m){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }else{
                System.out.println("No");
            }
        }else if(n*n - 4 * m > 0){//有两次实数根
            int count =0;//记录符1
            int count2 =0;//记录符2
            //System.out.println("有两个实数根");
            double b  =( n + Math.sqrt(n*n-4*m))/2;
            double b2 = (n - Math.sqrt(n*n-4*m))/2;
            //System.out.println("b1的值"+b);
            //System.out.println("b2的值"+b2);
            if((int)b ==b){//先检测第一个实数根
                int a =n -(int)b;
                //System.out.println("a的值是"+a);
                if(a *(int)b ==m){
                    System.out.println("Yes");
                    count2++;
                }else{//第一个不符合条件
                    count++;
                }
            }else{
                count++;
            }
            if(count2 != 1){
                if((int)b2 ==b2){//检测第二个实数根
                    int a =n -(int)b2;
                    //System.out.println("a的值是"+a);
                    if(a *(int)b2 ==m){
                        System.out.println("Yes");
                    }else{
                        count++;
                    }
                }else{
                    count++;
                }
            }
            if(count ==2){
                //System.out.println("执行了这里");
                System.out.println("No");
            }
        }
    }
}
