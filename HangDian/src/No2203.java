/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/1 22:47
 * @version: 1.0$
 * 判断
 * 需要一直满足j 和 i匹配，j+1和i+1/i-arr1.length-1匹配
 * 最后count等于0
 * do while j i匹配 一直匹配
 * 直到arr2循环完
 *
import java.util.Scanner;
public class No2203 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            String str1=s.next();
            String str2=s.next();
            if(str2.length()>str1.length()){
                System.out.println("no");
                continue;
            }
            char[] arr1=str1.toCharArray();
            char[] arr2=str2.toCharArray();
            int count =0;
            int flag =0;
            do {
                flag++;
            }while(arr2[0] != arr1[flag]);

            for(int j =1;j<arr2.length;j++){
                if(j ==1){
                    flag++;
                }
                //如果不是s1的最后一个数
                //则继续匹配
                if(flag != arr1.length-1){
                    if(arr2[j] != arr1[flag]){
                        count++;
                    }
                    flag++;
                //如果是
                //让flag==0继续比较
                }else{
                    if(arr2[j] !=arr1[flag]){
                        count++;
                    }
                    flag =0;
                }
            }
            if(count !=0){
                System.out.println("no");
            }else{
                System.out.println("yes");
            }
        }
    }
}
*/
import java.util.Scanner;
public class No2203 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            String str1=s.next();
            String str2=s.next();
            if(str2.length()>str1.length()){
                System.out.println("no");
                continue;
            }
            str1 = str1+str1;
            if(str1.indexOf(str2)!=-1){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}