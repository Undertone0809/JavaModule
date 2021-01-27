import java.util.Scanner;
public class No2568 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            for(int i=0;i<n;i++){
                int num =s.nextInt();
                method(num);
            }
        }
    }
    //A为偶数减半
    //B为奇数减一
    //11 10 5 4 2 1 0
    //27 26 13 12 6 3 2 1 0
    public static void method(int num){
        int count =0;
        for(;num != 0;){
            if(num % 2 != 0){//如果a是奇数
                num -= 1;
                count++;
            }else{//如果是偶数
                num /= 2;
            }
        }
        System.out.println(count);
    }
}
