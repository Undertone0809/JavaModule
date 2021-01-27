import java.util.Random;

/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/27 12:46
 * @version: 1.0$
 */

public class 选择排序法 {
    public static void main(String[] args) {
        Random r1=new Random();
        int []arr=new int[100];
        //5 3 2 4 6
        //2 3 5 4 6
        //2 3 5 4 6
        //2 3 4 5 6
        //2 3 4 5 6

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r1.nextInt(300);
        }
        methodSort1(arr);
        printArr(arr);
    }


    //定义打印arr的方法
    public static void printArr(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i < arr.length -1){
                System.out.print(" ");
            }
        }
    }
    //定义选择排序法
    public static int[] methodSort1(int []arr){
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for(int j = i ;j < arr.length;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }


}
