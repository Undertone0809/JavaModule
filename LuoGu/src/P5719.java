/**
 * @author ：Zeeland
 * @date ：Created in 2021/2/2 17:40
 * @version: 1.0$
 */
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
public class P5719 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            int k =s.nextInt();
            ArrayList<Integer> isk = new ArrayList<>();
            ArrayList<Integer> isNotk = new ArrayList<>();
            for(int i=1;i <= n;i++){
                if(i % k ==0){
                    isk.add(i);
                }else{
                    isNotk.add(i);
                }
            }
            //遍历求和再做平均数
            double sum =0;
            double count =0;
            for(Integer num:isk){
                if(num != 0) count ++;
                sum += num;
            }
            double avisk = sum / count;
            count =0;
            sum =0;
            for(Integer num : isNotk){
                if(num != 0) count++;
                sum += num;
            }
            double avisNotk = sum /count;
            //格式化输出
            DecimalFormat format = new DecimalFormat("#.0");
            System.out.print(format.format(avisk)+" "+format.format(avisNotk));

        }
    }
}
