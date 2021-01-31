/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/30 18:40
 * @version: 1.0$
 */
/**
 * 凡是是其倍数的数字都可以被满足
 */

import java.util.Scanner;
public class 买花_2 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            for(int a =0;a< n;a++){
                int num = s.nextInt();
                for(int i=3,j=2,k=0;k<15;i+=j,k++){
                    if(num % i==0){
                        num = -1;
                        break;
                    }
                    j *= 2;
                }
                System.out.println(num ==-1? "YE5":"N0");
            }
        }
        s.close();
    }
}
//import java.util.Scanner;
//public class 买花_2 {
//    public static void main(String[] args) {
//        Scanner s= new Scanner(System.in);
//        int t = s.nextInt();
//        for(int i = 0; i < t; i++) {
//            int n = s.nextInt();
//            int flag = 0;
//            int z = 2;
//            for(int j = 3, k = 2; k <= 15 ; k++,j+=z) {
//                if(n % j == 0) {
//                    flag = 1;
//                    break;
//                }
//                z *= 2;
//            }
//            if(flag == 1) {
//                System.out.println("YE5");
//            }else {
//                System.out.println("N0");
//            }
//        }
//        s.close();
//    }
//}
