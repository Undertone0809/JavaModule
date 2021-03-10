import java.util.HashSet;
import java.util.Scanner;

/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/7 23:08
 * @version: 1.0$
 */

public class P3405 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            String [] city =new String[n];
            String [] pro = new String[n];
            //接受数据
            String mid="";
            HashSet<String> set =new HashSet<>();
            for (int i = 0; i < n; i++) {
                city[i] = s.next().substring(0,2);
                pro[i] =  s.next();
                if(city[i].compareTo(pro[i])>0){
                    mid = city[i];
                    city[i] = pro[i];
                    pro[i] = mid;
                }
                set.add(city[i]+pro[i]);
            }
            int answer = n - set.size();
            System.out.println(answer);


//            int count =0;
//            for (int i = 0; i < (n - 1); i++) {
//                for (int j = i+1;j < n;j++) {
//                    if(city[i].equals(pro[j])&& pro[i].equals(city[j])){
//                        count++;
//                    }
//                }
//            }
//            System.out.println(count);

        }
    }
}
