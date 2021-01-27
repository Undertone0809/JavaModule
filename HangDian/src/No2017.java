/**
 * Author:Zeeland
 * Problem Description:
 * 对于给定的一个字符串，统计其中数字字符出现的次数。
 *
 *
 * Input
 * 输入数据有多行，第一行是一个整数n，表示测试实例的个数，后面跟着n行，每行包括一个由字母和数字组成的字符串。
 *
 *
 * Output
 * 对于每个测试实例，输出该串中数值的个数，每个输出占一行。
 *
 *
 * Sample Input
 * 2
 * asdfasdf123123asdfasdf
 * asdf111111111asdfasdfasdf
 *
 *
 * Sample Output
 * 6
 * 9
 */

import java.util.*;
public class No2017 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            for(int i =0;i < n;i++){
                String word =s.next();
                //定义一个计数器
                int count =0;
                char []arr =word.toCharArray();
                for(int j =0;j < arr.length;j++){
                    //让数组中的每个元素一一与数字做对比
                    switch (arr[j]){
                        case '0' :count++;
                        break;
                        case '1' :count++;
                        break;
                        case '2' :count++;
                            break;
                        case '3' :count++;
                            break;
                        case '4' :count++;
                            break;
                        case '5' :count++;
                            break;
                        case '6' :count++;
                            break;
                        case '7' :count++;
                            break;
                        case '8' :count++;
                            break;
                        case '9' :count++;
                            break;
                    }
                }
                System.out.println(count);
            }
        }
    }
}
