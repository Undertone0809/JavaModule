import java.util.Scanner;

public class No1001 {
    public static void main(String[] args) {
        int n,sum =0;
        Scanner s =new Scanner(System.in);
        while (s.hasNext()){
            n = s.nextInt();
            for (int i =0;i <= n;i++){
                sum = sum + i ;
            }
            System.out.println(sum);
            System.out.println();
            sum =0;
        }
    }
}
