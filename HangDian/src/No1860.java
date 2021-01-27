/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/24 15:37
 * @version: 1.0$
 */
import java.util.Arrays;
import java.util.Scanner;
public class No1860 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            String str1 =s.nextLine();
            if(str1.equals("#")){
                break;
            }
            String str2 =s.nextLine();
            char []arr1 =str1.toCharArray();
            char []arr2 =str2.toCharArray();
            int count[] =new int[str1.length()];
            Arrays.fill(count,0);
            for(int i =0;i < arr1.length;i++){
                for(int j=0;j <arr2.length;j++){
                    if(arr1[i] ==arr2[j]){
                        count[i]++;
                    }
                }
            }

            for(int i =0;i < count.length;i++){
                System.out.println(arr1[i]+" "+count[i]);
            }

        }
    }
}
