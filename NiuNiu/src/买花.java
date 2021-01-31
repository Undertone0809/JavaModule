/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/30 17:07
 * @version: 1.0$
 */
import java.util.Scanner;
public class 买花 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n = s.nextInt();
            for (int i = 0; i < n; i++) {
                long num = s.nextLong();
                boolean flag = false;
                long count =0;
                long sum =0;
                //判断num是单复数
                //双数情况
                if(num ==2){

                }else if(num % 2 ==0){
                    //判断方式：
                    //在15天内把全部情况都执行过去
                    //如果没有一个符合
                    //则说明不能买到
                    //最多循环到num/3
                    //2 4 8 NO
                    //4 8 9
                    //6 12 321 no
                    //如果两个两个加，循环完了都是false，那就是false
                    for(int j=2; j<=(num/3); j+=2){
                        count = j;
                        sum =0;
                        //循环15遍，但是如果循环中count大于num了就停下来
                        for (int i1 = 0; i1 < 15; i1++) {
                            //大于num了还没有相等就不可能再相等了
                            //判断count是否和num相等
                            //count增加的方法
                            sum += count;
                            count *= 2;
                            if(sum == num){
                                flag = true;
                                break;
                            }else if(sum > num){
                                break;
                            }
                        }
                    }
                }else if(num == 1){

                }else if(num % 2 != 0){
                    //单数情况
                    //1 2 4
                    //3 6 12
                    //5 10 20
                    for(int j=1; j<=(num/3); j+=2){
                        count = j;
                        sum = 0;
                        //循环15遍，但是如果循环中count大于num了就停下来
                        for (int i1 = 0; i1 < 15; i1++) {
                            //大于num了还没有相等就不可能再相等了
                            //判断count是否和num相等
                            //count增加的方法
                            sum += count;
                            count *= 2;
                            if(sum == num){
                                flag = true;
                                break;
                            }else if(sum > num){
                                break;
                            }
                        }
                    }
                }
                //判断，输出结果
                if(flag == true){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }

            }
        }
    }
}
