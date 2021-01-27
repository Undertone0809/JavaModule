/**
 * Problem Description
 * 统计给定文本文件中汉字的个数。
 *
 *
 * Input
 * 输入文件首先包含一个整数n，表示测试实例的个数，然后是n段文本。
 *
 *
 * Output
 * 对于每一段文本，输出其中的汉字的个数，每个测试实例的输出占一行。
 *
 * [Hint:]从汉字机内码的特点考虑~
 *
 *
 *
 * Sample Input
 * 2
 * WaHaHa! WaHaHa! 今年过节不说话要说只说普通话WaHaHa! WaHaHa!
 * 马上就要期末考试了Are you ready?
 *
 *
 * Sample Output
 * 14
 * 9
 */

import java.util.Scanner;
public class No2030 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            s.nextLine();
            for(int i = 0; i< n;i++){
                String ak = s.nextLine();
                int count = 0;
                char [] array = ak.toCharArray();
                for(int j = 0; j < array.length; j++){
                    if(array[j]>=0x4E00 && array[j]<=0x29FA5){
                        count ++;
                    }
                }
                System.out.println(count);
            }
        }
    }
}
