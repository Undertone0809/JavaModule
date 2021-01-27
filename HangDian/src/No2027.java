/**
 * Problem Description
 * 统计每个元音字母在字符串中出现的次数。
 *
 *
 * Input
 * 输入数据首先包括一个整数n，表示测试实例的个数，然后是n行长度不超过100的字符串。
 *
 *
 * Output
 * 对于每个测试实例输出5行，格式如下：
 * a:num1
 * e:num2
 * i:num3
 * o:num4
 * u:num5
 * 多个测试实例之间由一个空行隔开。
 *
 * 请特别注意：最后一块输出后面没有空行：）
 *
 *
 * Sample Input
 * 2
 * aeiou
 * my name is ignatius
 *
 *
 * Sample Output
 * a:1
 * e:1
 * i:1
 * o:1
 * u:1
 *
 * a:2
 * e:1
 * i:3
 * o:0
 * u:1
 */

import java.util.*;
public class No2027 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n = s.nextInt();
            String ss=s.nextLine();
            int count = 1;
            for(int i = 1; i <= n ;i++){
                String str =s.nextLine();
                //将str转换成字符组
                //遍历数组
                //如果满足对应条件
                //则对应字母数加1
                char array[] =str.toCharArray();
                int num1 = 0,num2=0,num3= 0,num4 = 0,num5 =0;
                for(int j = 0;j < array.length;j++){
                    if(array[j] == 'a'){
                        num1 +=1;
                    }else if(array[j] == 'e'){
                        num2 +=1;
                    }else if(array[j] == 'i'){
                        num3 +=1;
                    }else if(array[j] == 'o'){
                        num4 +=1;
                    }else if(array[j] == 'u'){
                        num5 +=1;
                    }
                    }

                    System.out.println("a:"+num1);
                    System.out.println("e:"+num2);
                    System.out.println("i:"+num3);
                    System.out.println("o:"+num4);
                    System.out.println("u:"+num5);

                if(count != n){
                    System.out.println();
                }
                    count +=1;
            }
        }
    }
}
