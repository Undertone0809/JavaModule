/**
 * Problem Description
 * 统计给定的n个数中，负数、零和正数的个数。
 *
 *
 * Input
 * 输入数据有多组，每组占一行，每行的第一个数是整数n（n<100），表示需要统计的数值的个数，然后是n个实数；如果n=0，则表示输入结束，该行不做处理。
 *
 *
 * Output
 * 对于每组输入数据，输出一行a,b和c，分别表示给定的数据中负数、零和正数的个数。
 *
 *
 * Sample Input
 * 6 0 1 2 3 -1 0
 * 5 1 2 3 4 0.5
 * 0
 *
 *
 * Sample Output
 * 1 2 3
 * 0 0 5
 */
import java.util.*;

public class No2008 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            int ZhengShu=0,FuShu=0,Ling=0;
            double b ;
            int a = s.nextInt();
            if(a ==0){

            }else if(a !=0){
            for(int i =0;i < a;i++){
                b = s.nextDouble();
                if(b > 0){
                    ZhengShu += 1;
                }else if(b == 0){
                    Ling += 1;
                }else if(b < 0){
                    FuShu +=1;
                }
            }
            System.out.println(FuShu+" "+Ling+" "+ZhengShu);
            }
        }
    }
}
