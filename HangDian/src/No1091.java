import java.util.Scanner;

public class No1091 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b ;//一直这样做（for循环），直到满足 00时结束循环
        for (int i =0; i<10 ;) {
            a = s.nextInt();
            b = s.nextInt();
            if(a ==0 && b ==0){
                i =10;
            }else{
                System.out.println(a + b);
            }
        }
    }
}

