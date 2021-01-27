
import java.util.Scanner;
public class No2037 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            if (n == 0) {
                break;
            }
            int arr[][] = new int[2][n];
            for (int k = 0; k < n; k++) {
                arr[0][k] = scan.nextInt();
                arr[1][k] = scan.nextInt();
            }
            //冒泡排序排列结束时间
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (arr[1][j] > arr[1][j + 1]) {
                        int temp = arr[1][j];
                        arr[1][j] = arr[1][j + 1];
                        arr[1][j + 1] = temp;

                        temp = arr[0][j];
                        arr[0][j] = arr[0][j + 1];
                        arr[0][j + 1] = temp;
                    }
                }
            }
            int count = 1;//计数器
            int mid = arr[1][0];//mid为中间变量
            for (int i = 1; i < n; i++) {
                if (mid <= arr[0][i]) {
                    mid = arr[1][i];
                    count++;
                }
            }
            System.out.println(count);
        }
        // 按结束时间的先后排序
    }
}