/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/6 15:45
 * @version: 1.0$
 */
import java.util.Scanner;
public class I_很基础的模拟题 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n = s.nextInt();
            int q = s.nextInt();
            int []arr=new int[n];
            for(int i =0;i< arr.length;i++){
                arr[i] = s.nextInt();
            }
            for(int i=0;i < q;i++){
                int num1 = s.nextInt();
                int num2 = s.nextInt();
                if(num1 ==2){
                    int num3 =s.nextInt();
                }
                if(num1 ==1){
                    int arr2[] =method(num2,arr);
                    for(int j =0;j< arr2.length;j++){
                        if(j == arr2.length-1){
                            System.out.println(arr2[j]);
                        }else{
                            System.out.print(arr2[j]+" ");
                        }
                    }
                } else if(num1 == 2){
                    method2(num2,arr);
                }else if(num1 ==3){
                    //method3();
                }
            }
        }
    }
    //删除第x个元素
    public static void method1(int num2,int[] arr){
        int []arr2 = new int[arr.length-1];
        System.arraycopy(arr,0,arr2,0,num2-1);
        System.arraycopy(arr,num2,arr2,num2-1,arr.length-num2);
        for(int i =0;i< arr2.length;i++){
            if(i == arr2.length-1){
                System.out.println(arr2[i]);
            }else{
                System.out.print(arr2[i]+" ");
            }
        }
    }
    public static int[] method(int num2,int[] arr){
        int []arr2 = new int[arr.length-1];
        System.arraycopy(arr,0,arr2,0,num2-1);
        System.arraycopy(arr,num2,arr2,num2-1,arr.length-num2);

        return arr2;
    }
    public static void method2(int num2,int[] arr){

    }
}
