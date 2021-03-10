/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/7 15:23
 * @version: 1.0$
 */
package 蓝桥杯2019河南B;

import java.util.*;

public class B_不同子串 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            String str= s.next();
            char[] arr=str.toCharArray();
            HashSet<String> set =new HashSet<>();
            String sss = "";
            for(int i=0;i<arr.length;i++){
                //连续j个字符拼接
                for(int j=1;j<=arr.length;j++){
                    //从i到i+j,循环j次
                    for(int k=i;k<i+j&&k<arr.length;k++){
                        //字符拼接
                        sss +=""+arr[k];
                    }
                    set.add(sss);
                    sss="";
                }
            }
            int count =0;
            Iterator it =set.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
                count++;
            }
            System.out.println(count);
        }
    }
}
