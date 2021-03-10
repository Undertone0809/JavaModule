/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/6 14:52
 * @version: 1.0$
 */
package 天梯赛预选赛;
import java.util.Scanner;
public class No7_5 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int student = s.nextInt();//学生人数
            int num = s.nextInt();//题目的数量
            int []numScore = new int[num];
            int []numAnswer =new int[num];
            //输入成绩和标准答案
            for (int i = 0; i < num; i++) {
                numScore[i] = s.nextInt();
            }
            for (int i = 0; i < num; i++) {
                numAnswer[i] = s.nextInt();
            }

            int [] sScore = new int[student];
            int sum = 0;
            int answer = 0;
            for (int i = 0; i < student; i++) {
                //输入每个学生的答案
                for (int i1 = 0; i1 < num; i1++) {
                    answer = s.nextInt();
                    //如果正确，加分
                    if(answer == numAnswer[i1]){
                        sScore[i] += numScore[i1];
                    }
                }

                sum = 0;
            }
            for (int i = 0; i < student; i++) {
                System.out.println(sScore[i]);
            }

        }
    }
}
