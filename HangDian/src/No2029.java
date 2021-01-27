/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/24 14:48
 * @version: 1.0$
 * Problem Description
 * “回文串”是一个正读和反读都一样的字符串，比如“level”或者“noon”等等就是回文串。请写一个程序判断读入的字符串是否是“回文”。
 *
 *
 * Input
 * 输入包含多个测试实例，输入数据的第一行是一个正整数n,表示测试实例的个数，后面紧跟着是n个字符串。
 *
 *
 * Output
 * 如果一个字符串是回文串，则输出"yes",否则输出"no".
 *
 *
 * Sample Input
 * 4
 * level
 * abcde
 * noon
 * haha
 *
 *
 * Sample Output
 * yes
 * no
 * yes
 * no
 */

import java.util.Scanner;
public class No2029 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            for(int i =0;i < n;i++){
                String str =s.next();
                char array[] =str.toCharArray();
                int count =0;
                for(int j =0;j <array.length;j++){
                    if(array[j] !=array[array.length-j-1]){
                        count++;
                    }
                }
                if(count > 0){
                    System.out.println("no");
                }else{
                    System.out.println("yes");
                }
            }
        }
    }
}
