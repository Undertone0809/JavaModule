import java.util.Arrays;
import java.util.Scanner;

public class No2000 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
           String str= s.next();
           //将输入的字符串转化为字符数组
           char chars []=str.toCharArray();
           int pi = chars.length ;
           //调用转化方法
           CompareChar(chars,pi);
        }
    }

    /**
     *编写一个方法，用于比较字符的ASCII码
     *     //传入一个字符数组
     *     //先转化为ASCII数组
     *     //比较ASCII数组
     *     //最后将ASCII数组转化回字符
     *     //字符排序
     * @param chars
     * @param pi
     */
    public static void CompareChar(char chars[],int pi) {
        //将传入的数组转化为ASCII
        int arrs[]=new int[pi];
        for (int i=0;i < chars.length;i++) {
            arrs[i] = (int) chars[i];


        }
        //分类，输出
        Arrays.sort(arrs);
        char sd []=new char[pi];
        //arrs转化为字符
        for(int k =0; k < arrs.length; k++){
            sd[k] = (char)arrs[k];
            System.out.print(sd[k]);
            if(k != arrs.length-1){
                System.out.print(" ");

            }else{
                System.out.println();
            }
        }
        /**输出的另外一种方法
         *System.out.println((char)min +" "+(char)middle + " " +(char)max);
         * 这样子可以不用使用if语句
         */

    }
}
/**优化方法
 * 可以直接使用类型转化
 * 先将字符串转化为字符数组
 * 然后将字符数组直接转型为int类型，用几个中间值（min middle max，因为题目只给了三组数组）来比较
 * 最后直接对中间值使用数据类型转换转换回来用来输入，如“另外一种输出方法”所示
 */
