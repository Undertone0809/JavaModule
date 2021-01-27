/**
 * 問題描述
 * 對於表達式n ^ 2 + n + 41，當n在（x，y）範圍內取積分值時（包括x，y）（-39 <= x <y <= 50），判定該表達式的值是否都為素數。
 *
 *
 * 輸入值
 * 輸入數據有多組，每組佔一行，由兩個整數x，y組成，當x = 0，y = 0時，表示輸入結束，該行不做處理。
 *
 *
 * 輸出量
 * 對於每個給定範圍內的取值，如果表達式的值都為素數，則輸出“ OK”，否則請輸出“ Sorry”，每組輸出佔一行。
 *
 *
 * 樣本輸入
 * 0 1
 * 0 0
 *
 *
 * 樣本輸出
 * 好
 */
import java.util.*;
public class No2012 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            //输入一个区间(x,y)
            //且确保x<=y
            int x =s.nextInt();
            int y =s.nextInt();
            if(x == 0 & y == 0){
                //不执行内容
            }else if(x != y ){
                if(x > y){
                    int temp = x;
                    x = y;
                    y =temp;
                }
                Judge(x,y);
            }

        }
    }

    //定义一个判断条件的方法
    //通过Boolean值输出Yes or NO
    public static void Judge(int x,int y){
        //遍历
        //如果区间中的所有整数都满足某种条件
        //则输出YES，反之输出NO
        //x,y=0时结束输出
        int count = 0;
        for(int i = x;i <= y;i++){
            for(int k = 2;k < i ;k++){
                    int j = i*i + i + 41;
                    //如果有一个数字不是素数
                    if(j % k==0){
                        count +=1;
                    }else{

                    }
                }
            }
        if(count > 0){
            System.out.println("Sorry");
        }else if(count ==0){
            System.out.println("OK");
        }
    }
}

