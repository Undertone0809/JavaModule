/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/21 23:28
 * @version: 1.0$
 * Problem Description
 * 输入一个字符串，判断其是否是C的合法标识符。
 *
 *
 * Input
 * 输入数据包含多个测试实例，数据的第一行是一个整数n,表示测试实例的个数，然后是n行输入数据，每行是一个长度不超过50的字符串。
 *
 *
 * Output
 * 对于每组输入数据，输出一行。如果输入数据是C的合法标识符，则输出"yes"，否则，输出“no”。
 *
 *
 * Sample Input
 * 3
 * 12ajf
 * fi8x_a
 * ff  ai_2
 *
 *
 * Sample Output
 * no
 * yes
 * no
 */

import java.util.Scanner;
public class No2024 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n=s.nextInt();

            for(int i =0;i < n ;i++) {
                if(i ==0){
                    s.nextLine();
                }
                String str = s.nextLine();
                if (Character.isLetter(str.charAt(0)) || str.charAt(0) == '_') {
                    //只能有数字字母和下划线
                    int count = 0;
                    for (int j = 1; j < str.length(); j++) {
                        //如果不是下划线不是数字不是字母则count++
                        if (str.charAt(j)!='_' && !Character.isDigit(str.charAt(j)) && !Character.isLetter(str.charAt(j))) {
                            count++;
                        }
                    }
                    if (count > 0) {
                        System.out.println("no");
                    } else {
                        System.out.println("yes");
                    }
                } else {
                    System.out.println("no");
                }
            }
        }
    }
}
