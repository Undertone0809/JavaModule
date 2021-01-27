/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/15 18:31
 * @version: 1.0$
 */
import java.util.Scanner;
public class K1009 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int t =s.nextInt();
            for(int i =0;i<t;i++){
                int a =s.nextInt();
                int b =s.nextInt();
                //拆分两个数字为数组
                //分别计算
                //遍历输出
                //把数字转换为字符串再转换为字符数字
                char []arr1 =String.valueOf(a).toCharArray();
                char []arr2 =String.valueOf(b).toCharArray();
                if(arr1.length > arr2.length){
                    //输出arr1
                    for(int j =0;j<arr1.length-arr2.length;j++){
                        System.out.print(arr1[j]);
                    }
                    char []arr3 =new char[arr2.length];
                    int mid = arr1.length-1;
                    int sss =0;
                    for(int j =arr2.length-1;j >= 0;j--){
                        int asd = arr1[mid-sss] + arr2[j] -96;
                        if(asd >= 10){
                            asd -= 10;
                        }
                        arr3[j] = String.valueOf(asd).charAt(0);
                        sss++;
                    }

                    //输出arr3
                    for(int j=0;j< arr3.length;j++){
                        System.out.print(arr3[j]);
                    }
                    System.out.println();
                }else if(arr1.length < arr2.length){
                    //输出arr1
                    for(int j =0;j<arr2.length-arr1.length;j++){
                        System.out.print(arr2[j]);
                    }
                    char []arr3 =new char[arr1.length];
                    int mid = arr2.length-1;
                    int sss =0;
                    for(int j =arr1.length-1;j >= 0;j--){
                        int asd = arr2[mid-sss] + arr1[j] -96;
                        if(asd >= 10){
                            asd -= 10;
                        }
                        arr3[j] = String.valueOf(asd).charAt(0);
                        sss++;
                    }

                    //输出arr3
                    for(int j=0;j< arr3.length;j++){
                        System.out.print(arr3[j]);
                    }
                    System.out.println();
                }else{
                    char []arr3=new char[arr1.length];
                    for(int j=0;j< arr1.length;j++){
                        int asd = arr1[j] + arr2[j] -96;
                        if(asd >= 10){
                            asd -= 10;
                        }
                        if(asd == 0){

                        }
                        arr3[j] = String.valueOf(asd).charAt(0);
                    }
                    int count =0;
                    for(int j=0;j< arr3.length;j++){
                        if(arr3[j] =='0'){
                            count++;
                        }
                    }
                    if(count == arr3.length){
                        System.out.println(0);
                    }else{
                        for(int j=0;j< arr3.length;j++){
                            //if(arr3[j] != '0'){
                                System.out.print(arr3[j]);
                           // }
                        }
                        System.out.println();
                    }
                }
            }
        }
    }
}
