import java.util.*;

public class No2010 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {

            //输入两组数字
            //确保n m 大小的绝对性
            int n = s.nextInt();
            int m = s.nextInt();
            if(n > m){
                int temp = m;
                m = n;
                n =temp;
            }
            //定义一个数组放置水仙花
            //容量为M-N
            int arr[] = new int[m - n];
            //定义水仙花的个数
            int num = 0;

            for (int i = n; i <= m; i++) {
                int a = i / 100;
                int b = (i - a*100)/10 ;
                int c = i % 10;
                //如果i符合水仙花的条件
                //放入数组中
                //其中num的最大值为4
                if ((a*a*a+b*b*b+c*c*c)==i) {
                    arr[num++]=i;
                }
            }
            //如果num没有增加过
            if (num == 0) {
                System.out.println("no");
            } else {

                for (int i = 0; i < num - 1; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println(arr[num - 1]);
            }

        }

    }
}
/**
 * 总结
 * 数组容量与遍历的量可以不一致
 * 可以设立第三参数去遍历数组
 */
