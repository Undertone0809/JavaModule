/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/14 17:21
 * @version: 1.0$
 */
import java.util.Scanner;
public class No1062 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            s.nextLine();
            for(int i =0;i<n;i++){
                String str =s.nextLine();
                //根据空格分离成一个个数组
                String []arr1 =str.split(" ");
                //最后一个数组不能输出
                //再将里面的每一个元素都拆分成一个更小的数组
                char [][]arr2=new char[arr1.length][30];
                //将每个单词转换成字符数组
                for(int j =0;j< arr2.length;j++){
                    arr2[j] =arr1[j].toCharArray();
                }
                //对arr2中的数组进行倒序排序
                //创建一个新的数组arr3接收并输出
                for(int k =0;k< arr1.length;k++) {
                        for (int j = arr2[k].length - 1; j >= 0; j--) {
                            if (arr2[k][j] != ' ') {
                                System.out.print(arr2[k][j]);
                            }
                        }
                        if (k < arr1.length - 1) {
                            System.out.print(" ");
                        }
                    }
                if (str.charAt(str.length() - 1) == ' ') {
                    System.out.println(' ');
                } else {
                    System.out.println();
                }
            }
        }
    }
}
