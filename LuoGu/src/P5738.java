/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/6 12:34
 * @version: 1.0$
 */
import java.util.Arrays;
import java.util.Scanner;
public class P5738 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        while(s.hasNext()){
            int n=s.nextInt();//学生人数
            int m=s.nextInt();//评委个数
            double []score= new double[n];//全部人的成绩
            double [] mid = new double[m];//每个评委的评分
            double sum =0;
            for (int i = 0; i < n; i++) {
                for(int j=0;j<m;j++){
                    mid[j] = s.nextDouble();
                }
                Arrays.sort(mid);

                //求和
                for (int i1 = 1; i1 < mid.length-1; i1++) {
                    sum+=mid[i1];
                }
                //求平均数
                score[i] = sum/(m-2);
                sum =0;
            }
            Arrays.sort(score);
            System.out.printf("%.2f\n",score[n-1]);
        }
    }
}
