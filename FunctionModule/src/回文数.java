/**
 * @author ：Zeeland
 * @date ：Created in 2021/2/4 11:39
 * @version: 1.0$
 */
public class 回文数 {

    public static boolean isHuiWenShu(int x){
        int y=x,num=0;//int y=x,防止x被改变
        while (y!=0)
        {
            num=num*10+y%10;//上一次数字的记录进位再加上下一位数
            y/=10;
        }
        if (num==x) return true;
        else return false;
    }
}
