/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/13 14:38
 * @version: 1.0$
 */
import java.util.*;
public class No2549 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int t =s.nextInt();
            for(int i =0;i<t;i++) {
                String num = String.valueOf(s.nextDouble());//小数
                int n = s.nextInt();//需要保留的精度
                String str[] =num.split("\\.");//分成两个数组
                char []arr=str[1].toCharArray();//小数的小数点部分
                //n大于小数点部分的情况
                if(n > arr.length){
                    System.out.println(0);
                }else{
                    System.out.println(Integer.parseInt(String.valueOf(arr[n-1])));
                }
            }
        }
    }
}
