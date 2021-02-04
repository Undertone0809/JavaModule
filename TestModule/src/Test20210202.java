/**
 * @author ：Zeeland
 * @date ：Created in 2021/2/2 13:54
 * @version: 1.0$
 */

/**
 * 复习冒泡排序
 * 复习记数型dp
 * 复习迭代算法
 * 复习gcd
 */
import java.util.Scanner;
public class Test20210202 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println(Test20210202gcd1(10,8));
        System.out.println(Test20210202gcd2(10,8));
        //实现n个数字的gcd
        //如果有n个数字
//        int n =s.nextInt();
//        int []arr =new int[n];
//        int mid = Test20210202gcd1(s.nextInt(),s.nextInt());
//        for (int i = 0; i < (n - 2); i++) {
//            mid = Test20210202gcd1(mid,s.nextInt());
//        }
//        System.out.println(mid);
        System.out.println("___________________________________________");
        int [] arr = {3,9,5,1,7,6,10,301,15,4};
        //Test20210202BubbleSort(arr);
        Test20210202BubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("_______________________________");

    }

    //求最大公约数,迭代算法
    /**
     *a  b
     * 10 8
     * 8 2
     * 2 0
     * 0
     * return 2
     */
    public static int Test20210202gcd1(int a,int b){
        return b == 0? a:Test20210202gcd1(b,a%b);
    }
    public static int Test20210202gcd2(int a,int b){
        int c = a % b;
        while(c != 0){
            /**
             * a b c
             * 10 8 2
             * 8 2 0
             */
            a = b;
            b = c;
            c = a % b;
         }
        return b;
    }

    /**
     *冒泡排序算法
     * 5 3 1 9 7排序
     * 1...执行4次
     * 3 5 1 9 7
     * 3 1 5 9 7
     * 3 1 5 9 7
     * 3 1 5 7 9
     * 保证9在最右边
     * 2...执行3次
     * 1 3 5 7 9
     * 保证7在最右边
     * 3...执行2次
     * 保证5在最右边
     * 4...执行1次
     * 保证3在最右边
     * 于是公式为：
     * (i=0;i<arr.length;i++)
     * j = arr.length - i -1;j++
     */
    //非正规版本，时间复杂度较大
    public static void Test20210202BubbleSort(int []arr){
        for (int i = 0; i < arr.length; i++) {
            for(int j =0;j <arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){

                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void Test20210202BubbleSort2(int []arr){
        for (int i = arr.length-1;i >= 0 ; i--) {
            for(int j =0;j < i ;j++){
                if(arr[j] > arr[j+1]){
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
