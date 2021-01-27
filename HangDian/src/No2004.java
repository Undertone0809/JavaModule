import  java.util.Scanner;
public class No2004 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int a =s.nextInt();
            //如果....则...
            if (a < 0 || a >100){
                System.out.println("Score is error!");
            }else if(a >= 90){
                System.out.println("A");
            }else if(a >= 80){
                System.out.println("B");
            }else if(a >= 70){
                System.out.println("C");
            }else if(a >= 60){
                System.out.println("D");
            }else if(a >= 0){
                System.out.println("E");
            }
        }
    }
}
