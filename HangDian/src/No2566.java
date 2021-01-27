/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/13 13:58
 * @version: 1.0$
 */
import java.util.*;
public class No2566 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            for(int i =0;i < n;i++){
                int a =s.nextInt();//硬币数量
                int b =s.nextInt();//总分数
                int count =0;
                for(int z=0;z <= b;z++){
                    for(int k =0;k <= b;k++){
                        for(int j=0;j <= b ;j++){
                            if(j+k+z == a && j + 2*k + 5*z ==b){
                                count++;
                            }
                        }
                    }
                }
                System.out.println(count);
            }
        }
    }
}