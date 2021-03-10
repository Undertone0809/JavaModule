/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/6 16:04
 * @version: 1.0$
 */
package 天梯赛预选赛;
import java.text.DecimalFormat;
import java.util.Scanner;
public class No7_10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            int []money =new int[n+1];
            int []count = new int[n+1];//红包个数
            if(n > 1){

                //第i个人
                for (int i = 1; i <= n; i++) {
                    count[i]=s.nextInt();//记录红包个数
                    int id =0;
                    int change =0;
                    for (int j = 0; j < count[i]; j++) {
                        id = s.nextInt();
                        change = s.nextInt();
                        money[id]+=change;
                        money[i]-=change;
                    }
                }

                int []arr =new int[n+1];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = i;
                }
                //排序,0不参与排序
                for (int i = money.length-1;i > 0 ; i--) {
                    for(int j =1;j < i;j++){
                        if(money[j] > money[j+1]){
                            //money转换
                            int temp =money[j];
                            money[j] = money[j+1];
                            money[j+1] = temp;
                            //arrid转换
                            temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                            //红包个数转换
                            temp = count[j];
                            count[j] = count[j+1];
                            count[j+1] =temp;
                        }
                    }
                }
                //如果money[i]一样，则看count[i]谁大，如果count[i]相等,则看arr[i]谁小
                for(int i=n;i>0;i--){
                    if(money[i] ==money[i-1]){
                        if(count[i] < count[i-1]){
                            int temp = arr[i];
                            arr[i] = arr[i-1];
                            arr[i-1] = temp;

                        }else if(count[i] == count[i-1]){
                            if(arr[i]>arr[i-1]){
                                int temp = arr[i];
                                arr[i] = arr[i-1];
                                arr[i-1] = temp;
                            }
                        }
                    }
                }

                DecimalFormat format  = new DecimalFormat("0.00");
                for (int i = n; i >0; i--) {
                    //转换money
                    double mid = (double)money[i] / 100;
                    System.out.println(arr[i]+" "+format.format(mid));

                }
            }else if(n ==1){
                int some = s.nextInt();
                for (int i = 0; i < some; i++) {
                    s.nextInt();
                    s.nextInt();
                }
                System.out.println("1 0.00");
            }
        }
    }
}
