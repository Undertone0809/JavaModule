/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/15 11:01
 * @version: 1.0$
 */
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
public class Test20201215 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()) {

            int[] arr = new int[50];
            Random num = new Random();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = num.nextInt(10000);
            }

            for (int count : arr) {
                System.out.println(count);//把arr中的数字给count
                // System.out.println(arr[count]);
            }
            System.out.println("--------------------");
            double x = s.nextDouble();
            DecimalFormat fd = new DecimalFormat("#.00#");
            DecimalFormat gd = new DecimalFormat("0.000");
            System.out.println("x =" + fd.format(x));
            System.out.println("x =" + gd.format(x));
        }
    }


    public static int search(int[] arr, int key){
        int start=0;
        int end=arr.length-1;
        while (start<=end)
        {
            int mid = (end+start)/2;
            if (key<arr[mid])
            {
                end=mid-1;
            }else if (key>arr[mid]){
                start=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
