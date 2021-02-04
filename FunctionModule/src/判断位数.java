/**
 * @author ：Zeeland
 * @date ：Created in 2021/2/4 12:18
 * @version: 1.0$
 */

public class 判断位数 {
    public static int number(int x){
        int count =0;
        while(x!=0){
            x/=10;
            count++;
        }
        return count;
    }
}
