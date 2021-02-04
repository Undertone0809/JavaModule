/**
 * @author ：Zeeland
 * @date ：Created in 2021/2/3 18:55
 * @version: 1.0$
 */
import java.util.Scanner;
public class P1217 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int a = s.nextInt();
            int b = s.nextInt();
            //如果是奇数，则直接进入循环
            //如果不是奇数，则+1后再进入循环
            //因为回文数一定是奇数
            //所以每一次判断的数字一定都是奇数
            if(a % 2 == 0){
                a +=1;
            }
            //奇数循环
            for(int i =a;i <= b; i+=2){
                //先判断是否是回文数
                //但是100以下的数字可以直接判断
                if(i < 100){
                    if(i==2 || i== 3 || i == 5 || i ==7 || i==11){
                        System.out.println(i);
                    }
                    //判断大于100的情况
                    //拆分成字符数组
                }else {
                    char[] arr = String.valueOf(i).toCharArray();
                    //循环中只要存在一个不符合的情况就不是回文
                    boolean flag = false;
                    //只需要循环一半
                    //判断字符数组长度
                    //如果是长度是单数
                    int count = 0;
                    for (int i1 = 0; i1 < (arr.length + 1) / 2; i1++) {
                        //对称数字不相等
                        if (arr[i1] != arr[arr.length - 1 - i1]) {
                            count++;
                        }
                    }
                    int mid = 0;
                    //回文数入口
                    //下面判断质数
                    if (count == 0) {
                        mid = i;
                        //判断是否为质数
                        int count1 = 0;
                        for (int j = 2; j <= Math.sqrt(mid); j++) {
                            //若可以被整除,则不是质数
                            if (mid % j == 0) {
                                count1++;
                            }
                        }
                        //是质数
                        if (count1 == 0) {
                            System.out.println(mid);
                        }
                    }
                }
            }
        }
    }
}
