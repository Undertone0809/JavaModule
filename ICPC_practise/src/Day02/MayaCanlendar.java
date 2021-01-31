/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/28 21:20
 * @version: 1.0$
 */
package Day02;

/**
 * 设计一个程序，要求把Haab转换成Tzolkin
 * 思路：把两个日期通过num中间参量来传递
 * 提供一个传递的方法
 * 只要你传入一个Haab的日期，就可以转换成Tzolkin的日期
 * 首先先要定义格式
 */
import java.util.Scanner;
public class MayaCanlendar {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            //输出一行Haab的数据
            String Haab =s.nextLine();
            transform(Haab);

        }
    }

    public static void transform(String Haab){
        //定义这是一年的第几天
        int count =0;

        //定义所有月份
        String HM_Name [] ={"pop","no","zip","zotz","tzec","xul","yoxkin","mol","chen","yax","zac","ceh","mac","kankin","muan","pax","koyab","cumbu","uayet"};
        //将字符串通过空格分成三个数组
        String [] Harr =Haab.split(" ");
        int year = Integer.parseInt(Harr[2]);
        int Hmon =0;
        //日期用【0-19】表示
        int Hday =0;

        //计算天
        //将Harr[0]拆分成字符数组，除了最后一个元素，其余元素拼接就是Hday
        char [] HdayArr =Harr[0].toCharArray();
        if(HdayArr.length == 2){
            String num =HdayArr[0]+"";
            Hday = Integer.parseInt(num);
        }else{
            //Hday大于9的情况
            String num = HdayArr[0] + HdayArr[1]+"";
            //num转换为int
            Hday = Integer.parseInt(num);
        }

        //计算月份
        //如果月份匹配上了
        //那么i就是月份数+1
        for (int i = 0; i < 19; i++) {
            if(Harr[1].equals(HM_Name[i])){
                Hmon = i + 1;
                break;
            }
        }
        //开始count
        if(Hmon == 1){
            count = Hday + 1;
        }else{
            count = (Hmon -1) * 20 + Hday + 1;
        }

        //analyse Tzolkin Canlendar
        //13个月
        //每个月20天
        String []Tarr={"imix","ik","akbal","kan","chicchan","cimi","manik","lamat","muluk","ok","chuen","eb","ben","ix","men","cib","caban","eznab","canac","ahau"};
        int Tday =0;
        int Tmon =0;
        //月份显示
        if(count > 260){
            Tmon = ((count-260) / 20)+1;
            year ++;
        }else{
            Tmon = count /20 +1;
        }

        //天数
        int mid = count % 20;
        System.out.println(Tmon+" "+Tarr[mid-1]+" "+year);
        System.out.println(count);
    }
}
