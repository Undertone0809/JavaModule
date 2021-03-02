/**
 * @author ：Zeeland
 * @date ：Created in 2021/2/18 23:07
 * @version: 1.0$
 */
import java.util.Scanner;
public class Eastern_Exhibition{
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int z = s.nextInt();
            for(int i = 0;i<z;i++){
                int n =s.nextInt();
                int [][]arr =new int[n][1];
                for (int i1 = 0; i1 < n; i1++) {
                    //输入所有house的坐标
                    arr[i1][0] = s.nextInt();
                    arr[i1][1] = s.nextInt();
                }
                //取出所有人家中x的最大最小值，取出y的最大最小值
                int xmax = 0;
                int xmin = 0;
                int ymax = 0;
                int ymin = 0;

                for (int i1 = 0; i1 < n; i1++) {

                }
                //设商场的坐标
                int x = 0;
                int y = 0;
                //目标：让|x-arr[i][0]|+|y-arr[i][1]|的和最小
                int sum = 0;
                //让商场的坐标从左下角到右上角遍历
                //每一个坐标点都对应一个sum值
                //商场可能坐标点遍历
                for(int x1 =xmin;x1<=xmax;x1++){
                    for(int y1=ymin;y1<=ymax;y1++){
                        //商场坐标分别与所有house的坐标相减求绝对值
                        for (int i1 = 0; i1 < n; i1++) {
                            if(x1-arr[i1][0] < 0){
                                sum = arr[i1][0] - x1;
                            }else{
                                sum =  x1 - arr[i1][0];
                            }
                            if(y1-arr[i1][1] < 0){
                                sum = arr[i1][1] - y1;
                            }else{
                                sum = y1 - arr[i1][1];
                            }
                        }
                    }
                }

            }
        }
    }
}
