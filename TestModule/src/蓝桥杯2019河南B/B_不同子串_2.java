/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/7 18:51
 * @version: 1.0$
 */
package 蓝桥杯2019河南B;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class B_不同子串_2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        while(s.hasNext()){
            String str=s.next();
            HashSet<String> set =new HashSet<>();
            //使用substring方法
            for (int i = 0; i < str.length(); i++) {
                for (int step = 1;step + i<= str.length(); step++) {
                    set.add(str.substring(i,step+i));
                }
            }
            int count = 0;
            Iterator<String> it = set.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
                count++;
            }
            System.out.println("num:"+count);
        }
    }
}
