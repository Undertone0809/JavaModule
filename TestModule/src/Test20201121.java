import java.util.*;
public class Test20201121 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.next();//输入字符串
            char[] arr=str.toCharArray();//将字符串拆成字符数组
            char max='a';//记录最大的字符
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){//如果比最大字符大，则赋给max
                    max=arr[i];
                }
            }
            for(int i=0;i<arr.length;i++) {
                if (max == arr[i]) {//与max字符相同的后面跟上(max)
                    System.out.print(arr[i] + "(max)");
                } else {
                    System.out.print(arr[i]);
                }
                if (i == arr.length - 1) {
                    System.out.println();
                }
            }

        }
    }
}

