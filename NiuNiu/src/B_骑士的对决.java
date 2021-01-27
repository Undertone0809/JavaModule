/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/5 14:58
 * @version: 1.0$
 */
import java.util.Scanner;
public class B_骑士的对决 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            String str1 =s.next();
            String str2 =s.next();
            method(str1,str2);
        }
    }
    public static void method(String str1,String str2){
        char []arr1 =str1.toCharArray();
        char c =str2.charAt(0);
        int numa ='S';
        int numb ='J';
        int numc ='B';
    }
}
