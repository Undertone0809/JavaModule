import java.util.Random;

/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/27 22:30
 * @version: 1.0$
 */

public class 冒泡排序法 {
    public static void main(String[] args) {
        //测试冒泡排序法
        int []arr =new int[100];
        Random r1=new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] =r1.nextInt(12121);
        }
        //冒泡排序法
        // 9 5 3 8 7
        // 5 9 3 8 7
        // 5 3 9 8 7
        for (int i = arr.length-1;i >= 0 ; i--) {
            for(int j =0;j < i;j++){
                if(arr[j] > arr[j+1]){
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //冒泡排序法的快速调用
    public static int[] method(int []arr){
        for (int i = arr.length-1;i >= 0 ; i--) {
            for(int j =0;j < i;j++){
                if(arr[j] > arr[j+1]){
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
