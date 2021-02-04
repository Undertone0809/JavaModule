/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/25 18:59
 * @version: 1.0$
 */
package Day01;
import java.lang.*;
import java.util.ArrayList;
import java.util.Iterator;

public class SpecializedNumbers {
    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        //四位数循环
        for (int i = 1000; i < 9999; i++) {
            //按顺序输出符合规定的数字
            if(method(i)) {
                arr.add(i);
            }
        }
        //迭代arr数组
        //使用迭代器迭代
        //取得迭代器
        Iterator it = arr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        long endtime = System.currentTimeMillis();
        
    }
    //输入一个数字
    //每位数字相加之和为A
    //判断它的12进制和16进制每个位数相加之和是否等于A
    public static boolean method(int a){
        Integer num1 =0;
        Integer num2 =0;
        Integer num3 =0;
        //十进制下每个数字相加为num1
        char []arr =Integer.toString(a).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            //将每个数字相加
            num1 += Integer.parseInt(String.valueOf(arr[i]));
        }
        //十二进制下每个数字相加为num2
        //将a转换为12进制数字
        //拆分数字
        char []arr2 =Integer.toString(a,12).toCharArray();
        for (int i = 0; i < arr2.length; i++) {
            //拆分后相加
            num2 += Integer.parseInt(String.valueOf(arr2[i]),12);
        }
        //十六进制下每个数字相加为num
        char []arr3 =Integer.toHexString(a).toCharArray();
        for (int i = 0; i < arr3.length; i++) {
            num3 += Integer.parseInt(String.valueOf(arr3[i]),16);
        }
        if(num1==num2 && num3==num2){
            return true;
        }else{
            return false;
        }
    }
}
