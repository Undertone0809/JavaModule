/**
 * @author ：Zeeland
 * @date ：Created in 2021/2/3 10:38
 * @version: 1.0$
 */
import java.util.Scanner;
public class P1980_2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        while(s.hasNext()){
            int n = s.nextInt();
            int k = s.nextInt();
            int lastNum = 0;//i的最后一位
            int mid = 0;
            int count = 0;
            //（1，n）循环
            for(int i=1;i<=n;i++){
                mid = i;
                while(mid != 0){
                    //求最后一位是什么
                    lastNum = mid % 10;
                    //判断是否为k
                    if(lastNum == k)count ++;
                    //除10,取下一位进行判断
                    mid /= 10;
                }
            }
            System.out.println(count);
        }
    }
}
