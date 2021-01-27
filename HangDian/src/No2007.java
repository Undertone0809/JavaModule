import  java.util.Scanner;

public class No2007 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int m,n;
        int a = 0,b=0;
        int arr[] =new int[100];
        while(s.hasNext()){
            n =s.nextInt();
            m =s.nextInt();
            /**这里的n和m大小的不同会影响结果
             * 因此我们可以采用if语句中和出错的风险
             *
             */
            if(n > m){
                int temp =n;
                n = m;
                m =temp;
            }
            //列出从m到n的数组
            //遍历数组
            //如果有偶数分到A类
            //如果有奇数分到B类
            for (int i =0;i < (m-n+1) ;i++ ){
                arr[i]=n +i;
                //System.out.println(arr[i]);
                //后续的数字不执行
                if(arr[i] == 0){
                    break;
                    //偶数
                }else if(arr[i] % 2 == 0){
                    a = a + arr[i] * arr[i];
                    //奇数
                }else if(arr[i] % 2 == 1){
                    b = b + arr[i] * arr[i] * arr [i];
                }
            }
            System.out.println( a + " " + b);
            a=0;
            b=0;

        }
    }
}