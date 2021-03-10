/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/5 23:06
 * @version: 1.0$
 */
import javax.swing.*;
import java.util.Scanner;
public class Test20210305 {
    public static void main(String[] args) {
        /**
         * 当前存储的几种进制转换方法
         * String.format("%x",200)
         */
        //10进制转换成16进制
        System.out.println(String.format("%x",10));
        int num =0x0b;
        System.out.println(Integer.parseInt(num+"",10));//11
        int num1= 012;//八进制
        System.out.println(Integer.parseInt(num1+"",10));
        int num2 = 10;
        System.out.println(Integer.parseInt(num2+"",8));//8

        //使用StringBuilder拼接
        StringBuffer buffer = new StringBuffer("first");
        char []arr= new char[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] +=i+97;
        }
        for (int i = 0; i < 26; i++) {
            buffer.append(arr[i]);
        }
        System.out.println(buffer);
        long startTime =System.currentTimeMillis();
        StringBuffer buffer1 =new StringBuffer();
        for (int i = 0; i < 10000000; i++) {
            buffer1.append(i);
        }
        long endTime =System.currentTimeMillis();
        long time =endTime - startTime ;
        System.out.println("first spend "+ time +"time");

        System.out.println("----------------------------");
        int ki = 10;
        System.out.println(Integer.parseInt(ki+"",2));
        System.out.println(Integer.toString(10,2));

        System.out.println("_______________________________");
        //String 转换Int
        String num3 = "10";
        int num4 =Integer.parseInt(num3);
        System.out.println(num4);
        System.out.println("num4 is integer?"+judgeInt(num4));
        //int转String
        String num5 = String.valueOf(10);
        System.out.println(num5);

    }
    public static boolean judgeInt(Object obj){
        if(obj instanceof Integer){
            return true;
        }else{
            return false;
        }
    }
}
