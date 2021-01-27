import java.util.Scanner;
public class No1465 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long[] arr=new long[21];
        arr[1]=0;
        arr[2]=1;
        for(int i=3;i<=20;i++){
            arr[i]=(i-1)*(arr[i-1]+arr[i-2]);
        }
        while(sc.hasNext()){
            System.out.println(arr[sc.nextInt()]);
        }
    }
}
