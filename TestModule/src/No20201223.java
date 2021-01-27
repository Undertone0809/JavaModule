/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/23 23:19
 * @version: 1.0$
 */
/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/23 22:56
 * @version: 1.0$
 */
import java.util.*;
public class No20201223 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt(),A=1;
        int[][] nums=new int[N][2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j]=scanner.nextInt();
            }
        }
        Arrays.sort(nums,new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                if(a[1]==b[1]){
                    //若a[0] b[0]值相同则比较a[1] b[1]，按升序
                    //返回小的那一个
                    return a[0]-b[0];
                }else{
                    return a[1]-b[1];
                }
            }
        });
        int endTime=nums[0][1];
        for(int i=1;i<N;i++){
            if(nums[i][0]>=endTime){
                A++;
                endTime=nums[i][1];
            }
        }
        System.out.println(A);
    }

}