/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/21 20:49
 * @version: 1.0$
 * Problem Description
 * 输入一个英文句子，将每个单词的第一个字母改成大写字母。
 *
 *
 * Input
 * 输入数据包含多个测试实例，每个测试实例是一个长度不超过100的英文句子，占一行。
 *
 *
 * Output
 * 请输出按照要求改写后的英文句子。
 *
 *
 * Sample Input
 * i like acm
 * i want to get an accepted
 *
 *
 * Sample Output
 * I Like Acm
 * I Want To Get An Accepted
 */
import java.util.Scanner;
public class No2060 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            String str =s.nextLine();
            char array[] =str.toCharArray();
            String a =String.valueOf(array[0]);
            String b =a.toUpperCase();
            array[0] =b.charAt(0);
            for(int i =0;i <array.length-1 ;i++){
                if(array[i]==' '){
                    String temp1 =String.valueOf(array[i+1]);
                    String temp2 = temp1.toUpperCase();
                    char ak = temp2.charAt(0);
                    array[i+1] =ak;
                }
            }
            for(int i=0;i < array.length;i++){
                System.out.print(array[i]);
            }
            System.out.println();
        }
    }
}
