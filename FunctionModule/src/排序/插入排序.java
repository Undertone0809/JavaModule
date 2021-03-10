/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/9 19:59
 * @version: 1.0$
 */
package 排序;

import java.util.Random;

public class 插入排序 {
    public static void main(String[] args) {
        int []arr =new int[100];
        Random random = new Random();
        for (int i = 0; i <arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        insertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static int[] insertSort(int []arr){
        if(arr==null) return null;
        //从第二个开始排序
        int temp =0;
        int mid =0;
        for(int i=1;i< arr.length;i++){
            //将第i个数字一次和前面的每一个比较
            //如果a<j，则调换数字
            //如果a>=j,break
            int j =0;
            temp =arr[i];
            for(j=i-1;j>=0;j--){
                if(arr[j]>temp){
                    arr[j+1] =arr[j];
                }else{
                    break;
                }
            }
            arr[j+1]=temp;
        }
        return arr;
    }
}
