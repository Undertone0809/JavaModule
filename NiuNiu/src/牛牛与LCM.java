/**
 * 链接：https://ac.nowcoder.com/acm/contest/8582/E
 * 来源：牛客网
 *
 * 汪欧涛玩《快乐的E》到了午夜12点，此时，汪欧涛的手机闹钟响了。
 * 汪欧涛拿起手机，躺着床上，带上耳机，说了一句：“生而为人，我很抱歉”。
 * 说完就打开了网抑云
 * 汪欧涛看着自己的歌曲名字，总觉得特别别扭，于是又仔细看了下，原来是因为歌曲的名字没有按照字典序排序，这加深了汪欧涛的抑郁
 * 请你判断接下来汪欧涛听的歌曲名字是否按照字典序排序，如果是，输出“YES”，不是，输出“NO”
 * 输入描述:
 * n表示有n个歌曲名字，m表示歌曲名字长度，然后输入n串由小写字母组成的字符串。处理到文件结尾
 * 输出描述:
 * 如果是字典序排序，输出“YES”，否则，输出“NO”
 * 示例1
 * 输入
 * 复制
 * 3 4
 * Abca
 * Bbca
 * Ccca
 * 输出
 * 复制
 * YES
 * 示例2
 * 输入
 * 复制
 * 3 3
 * Dcb
 * Dad
 * Abc
 * 输出
 * 复制
 * NO
 */


import java.util.Scanner;

public class 牛牛与LCM {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n,x;
        int []arr=new int[10000];
        int []arr2=new int[10000];
        while(s.hasNext()){
            //将所有数组放入数组中
            n = s.nextInt();
            //System.out.println("N执行了");
            for (int i =0 ;i < n ;i++){
                arr[i]=s.nextInt();
              //  System.out.println("第"+ (i+1) +"次赋值进数组");
            }
            //input x
            x = s.nextInt();
            //System.out.println("X执行了");
            //相互乘，如果遇到匹配则输出possible
            //两层循环
            //如果存在，则sum>=1
            //如果不存在，则sum=0
            int sum=0;
            for (int i =0;i < n;i++){
                for (int j = 1;j < n;j++){
                    arr2[j*(i+1)]=0;
                    if(arr[i]*arr[j] == x){
                        sum +=1;
                    }else{

                    }
                }
            }
            //System.out.println("SUM赋值完了");
            if (sum >= 1){
                System.out.println("Possible");
            }else{
                System.out.println("Impossible");
            }
            n =0;
            x =0;
            sum=0;
            //System.out.println("return");
        }
    }

}
