/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/21 18:18
 * @version: 1.0$
 * Problem Description
 * 有一个长度为n(n<=100)的数列，该数列定义为从2开始的递增有序偶数，现在要求你按照顺序每m个数求出一个平均值，如果最后不足m个，则以实际数量求平均值。编程输出该平均值序列。
 *
 *
 * Input
 * 输入数据有多组，每组占一行，包含两个正整数n和m，n和m的含义如上所述。
 *
 *
 * Output
 * 对于每组输入数据，输出一个平均值序列，每组输出占一行。
 *
 *
 * Sample Input
 * 3 2
 * 4 2
 *
 *
 * Sample Output
 * 3 6
 * 3 7
 *
 */
import java.util.Scanner;
public class No2015 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()) {
            int n = s.nextInt();
            int[] array = new int[n + 1];
            int m = s.nextInt();
            int arr[] = new int[n / m + 2];
            array[1] = 2;
            for (int i = 1; i <= array.length - 1; i++) {
                array[i] = i * 2;
            }//true
            //每m个求一个平均值
            //剩下不足m的分一组求平均值
            //放入数组A中遍历
            //数组A的容量：n/m+1
            //more用来最后作为array[num*m+1]到array[n]取平均值的个数
            int num = n / m;
            int more = n - m * num;
            //分别截取1-1m 1m+1-2m 2m+1-3m  3m+1-4m ...(num-1)*m+1-num*m  num*m+1-n 有num个相同的组的组 +1特殊组
            //截取中的数先求和再求平均数
            //平均数放到数组中
            if (n % m != 0) {
            for (int i = 1; i <= num; i++) {
                int sum = 0;
                if (i == 1) {
                    for (int j = 1; j <= m; j++) {
                        sum += array[j];
                    }
                    arr[i] = sum / m;
                    System.out.print(arr[i]);
                    System.out.print(" ");
                }
                if (i > 1) {
                    for (int j = (i - 1) * m + 1; j <= i * m; j++) {
                        sum += array[j];
                    }
                    arr[i] = sum / m;
                    System.out.print(arr[i]);
                    System.out.print(" ");
                }
            }
            int sum = 0;
            //分别截取1-1m 1m+1-2m 2m+1-3m  3m+1-4m ...(num-1)*m+1-num*m  num*m+1-n 有num个相同的组的组 +1特殊组

                for (int i = num * m + 1; i <= n; i++) {
                    sum += array[i];
                }
                arr[num + 1] = sum / more;
                System.out.print(arr[num + 1]);
                System.out.println();
            }else if(n % m ==0){
                for (int i = 1; i <= num; i++) {
                    int sum = 0;
                    if (i == 1) {
                        for (int j = 1; j <= m; j++) {
                            sum += array[j];
                        }
                        arr[i] = sum / m;
                        System.out.print(arr[i]);
                        System.out.print(" ");
                    }
                    if (i > 1) {
                        for (int j = (i - 1) * m + 1; j <= i * m; j++) {
                            sum += array[j];
                        }
                        arr[i] = sum / m;
                        System.out.print(arr[i]);
                        if (i < num) {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
/**
 * 优秀范文：
 * //吐槽一下，这个翻译真的是垃圾，最开始让我去求和，我也是醉了
 * import java.util.Scanner;
 *
 * public class HDU2015 {
 * 	public static void main(String[] args) {
 * 		Scanner in = new Scanner(System.in);
 * 		int[] arr = new int[100];
 * 		while(in.hasNext())
 *                {
 * 			int n = in.nextInt();
 * 			int m = in.nextInt();
 * 			//这个for循环是初始化数组
 * 			for(int i = 0;i<n ; i++)
 *            {
 * 				arr[i] = 2*(i+1);
 *            }
 *
 * 			int sum = 0;
 * 			int count = 0;
 * 			//开始步入题目核心，遍历整个数列
 * 			for(int k = 0; k<n; k++)
 *            {
 * 				sum += arr[k];
 * 				count++;//count用来记录循环次数
 * 				//如果循环次数等于m次，表明每m个数的这样一个规模已经形成，则可以进行输出
 * 				if(count == m)
 *                {
 * 					 System.out.print(sum/m);
 * 					 //每隔m个数进行一次平均值的计算，并且初始化sum跟count以方便重新下一轮循环
 * 					 sum = 0;
 * 					 count = 0;
 * 					 //这个if语句是用来应付最后不输出空格的解决方案
 * 					 if(k<n-1)
 *                     {
 * 						 System.out.print(" ");
 *                     }
 *                }
 *            }
 * 			//当计数值count没有被初始化，说明剩下的数未达到m个
 * 			if(count != 0)
 *            {
 * 				System.out.print(sum/count);
 *            }
 * 			//题目要求，每组输出独占一行
 * 			System.out.println();
 *        }
 * 		in.close();* 	}
 * }
 * 有一点像流水线包装货物
 * 包装完一个货物后包装的装置初始化
 * 从而可以包装下一个货物
 * 当包装材料不足时
 * 就用现有的包装材料包装一个比较小的货物
 * 需要一个count计数器
 * 类似于汽车挂挡表盘
 */


