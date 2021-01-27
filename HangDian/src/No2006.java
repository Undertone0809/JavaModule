import java.util.Scanner;

public class No2006 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        //有N个数字，代表要输入N次
        int n,a;
        int sum =1;
        while(s.hasNext()){
            n =s.nextInt();
            for(int i =0;i < n;i++){
               a =s.nextInt();
               if(a % 2 == 1){
                   sum = a * sum;
               }

            }
            System.out.println(sum);
            sum = 1;
        }
    }
}
