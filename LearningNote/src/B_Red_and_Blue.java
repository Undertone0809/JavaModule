/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/1 18:44
 * @version: 1.0$
 */
import java.util.ArrayList;
import java.util.Scanner;
public class B_Red_and_Blue {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()) {
            int n = s.nextInt();
            for (int i = 0; i < n; i++) {
                int a =s.nextInt();
                int []arrRed=new int[a];
                for (int i1 = 0; i1 < a; i1++) {
                    arrRed[i1] = s.nextInt();
                }
                int b =s.nextInt();
                int [] arrBlue=new int[b];
                for (int i1 = 0; i1 < b; i1++) {
                    arrBlue[i1] = s.nextInt();
                }
                int counta = 0;
                int countb = 0;
                int suma =0;
                int sumamid =0;
                int sumb =0;
                int sumbmid =0;
                int sum =0;
                while(counta != a && countb !=b){
                    suma += arrRed[counta];
                    sumb += arrBlue[countb];
                    if(suma > sumb){
                        counta++;
                        sumb = sumbmid;
                        sumamid =suma;
                        sum =suma;
                    }else if(suma < sumb){
                        countb++;
                        suma = sumbmid;
                        sumbmid = sumb;
                        sum = sumb;
                    }
                }
                System.out.println(sum);

            }



        }
    }
}

