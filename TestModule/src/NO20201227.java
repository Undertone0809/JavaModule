import java.util.Random;

/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/27 12:17
 * @version: 1.0$
 */

public class NO20201227 {
    public static void main(String[] args) {
        //测试冒泡排序法
        int []arr =new int[100];
        Random r1=new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] =r1.nextInt(12121);
        }
        //冒泡排序法
        for (int i = arr.length-1;i >= 0 ; i--) {
            for(int j =0;j < i;j++){
                if(arr[j] > arr[j+1]){
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i < arr.length -1 ){
                System.out.print(" ");
            }
        }
    

    }
}
