/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/2 16:02
 * @version: 1.0$
 * 使用INSERT方法复制数组
 * 将s2中的内容转移到s1的(arr.length-1)/2中
 */
import java.util.Scanner;
public class No2567 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            for(int i =0;i<n;i++){
                StringBuffer str1= new StringBuffer(s.next());
                StringBuffer str2= new StringBuffer(s.next());
                str1.insert((str1.length())/2,str2);
                System.out.println(str1);
            }
        }
    }
}
