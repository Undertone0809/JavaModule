/**今日复习
 * 1.日期格式的定义与使用
 * date SimpleDateFormat System.currentTime data
 * 2.小数点的保留
 * 3.将字符串转换为数组
 * 4.将字符串或字符转换为ASCII
 * 5.字符数组的排序与比较
 */

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test20201113 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        //如果Date()里面没有内容则默认为当前时间（格式型）
        //默认当前时间是通过构造方法来创建的
        //如果输入一个数值（数据类型long date）
        //则原时间加上毫秒数就是Date的时间
        Date date =new Date();
        System.out.println("现在的时间是"+date);


        //print现在的时间（毫秒数）
        System.out.println("现在的毫秒数是:"+System.currentTimeMillis());//输出结果为毫秒数
        //print现在的时间
        //使用java.util.Date方法

        //更改时间的格式
        //原理：利用SimpleDateFormat具有format方法可以修改date类中的格式
        SimpleDateFormat ak =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println("更改格式之后的时间是："+ak.format(date));//调用了toString方法

        //计算昨天此时的时间
        Date time1 =new Date(System.currentTimeMillis() - 1000*60*60*24);
        System.out.println("昨天此时的时间是："+time1);
        System.out.println("昨天此时的时间是："+ak.format(time1));

        //限制小数位
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###.000");
        double No1 =3000000.1415926;
        System.out.println("限制三位小数输出后的值："+decimalFormat.format(No1));

        //字符串转换为数组
        String []arrString = new String[100] ;
        String str ="HelloWorld";
        int []num=new int[100];
        for (int i =0;i < num.length;i++){
            num[i]=i+1;
        }
        System.out.println(num);//输出值为内存地址hashcode
        //将abc bcd cde传入数组x中
        String x[] =new String[3];
        for (int i =0;i < x.length ;i++){
            x[i] = "abc";
            System.out.println("你输出的x["+ i +"]的值是："+x[i]);
        }

        //将字符串转换成ASCII码
        //直接用byte数据类型转换
        String abc  ="HelloWorld";
        char cde ='c';
        int c =(int)cde;
        System.out.println("c用int表示的ASCII码是："+c);
        byte a =(byte)cde;
        System.out.println("c用byte表示的ASCII码是："+a);
        //可以转型的原因：
        //int和byte extends 了char
        //因此char可以使用数据类型转换转换成int 和byte

        //直接比较字符的顺序
        //作用与扩展

    }
}
