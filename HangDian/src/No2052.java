import java.util.Scanner;

public class No2052 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()) {
            int a=s.nextInt();
            int b=s.nextInt();
            for(int j=0;j<b+2;j++) {
                if(j==0||j==b+1) {
                    System.out.print("+");
                    for(int i=1;i<a+1;i++)
                        System.out.print("-");
                    System.out.println("+");
                }else {
                    System.out.print("|");
                    for(int i=1;i<a+1;i++)
                        System.out.print(" ");
                    System.out.println("|");
                }
            }
            System.out.println("");
        }

    }
}