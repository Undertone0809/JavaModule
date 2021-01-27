import java.text.SimpleDateFormat;
import java.util.Scanner;

public class No2005 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        SimpleDateFormat format =new SimpleDateFormat("yyyy/MM/dd");
        //N表示一年的第N天

        while(s.hasNext()){
            int n=0;
            //输入日期
            String date =s.next();
            //将日期转化为数组的形式储存
            //arr[0]表示年
            //arr[1]表示月
            //arr[2]表示日
            String  []arr=date.split("/");
            //创建平年月数组
            int AArrMonth[] ={31,28,31,30,31,30,31,31,30,31,30,31};
            //闰年月数组
            int BArrMonth[] ={31,29,31,30,31,30,31,31,30,31,30,31};


            //如果是闰年，则二月的日期不同

            if(IsOddYear(arr[0])){
                //把String数组改称int
                int month =Integer.parseInt(arr[1]);
                int day =Integer.parseInt(arr[2]);
                //System.out.println("闰年");
                //System.out.println(arr[0]);
                //如果是八月9号
                //遍历数组从1月加到7月(AArrMonth[0]-[6])
                for (int i=0;i < month-1;i++ ){
                    n += BArrMonth[i];
                }
                //再加9
                n += day;
                System.out.println(n);
                n = 0;

            }
            //如果是平年，则没有区别
             else{                //把String数组改称int
                int month =Integer.parseInt(arr[1]);
                int day =Integer.parseInt(arr[2]);
                //如果是八月9号
                //遍历数组从1月加到7月(AArrMonth[0]-[6])
                for (int i=0;i < month-1;i++ ){
                    n += AArrMonth[i];
                }
                //再加9
                n += day;
                System.out.println(n);
            }


        }
    }

    //定义一个判断闰年的方法
    public static boolean IsOddYear(String a){
        //将String类型的arr[0]转化为int类型的数据
        int b = Integer.parseInt(a);
        //如果它是4的倍数且不是100的倍数则是闰年
        if((b % 4 ==0 && b %100 !=0)||b%400==0 ){
            return true;
        }else{
            return false;
        }
    }

}
