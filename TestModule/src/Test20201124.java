/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/24 15:03
 * @version: 1.0$
 */
import java.util.*;
class Test20201124{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int n = s.nextInt();
            int[] array = new int[n];
            for(int i =0;i<n;i++){
                array[i]=s.nextInt();
            }
            Arrays.sort(array);
            int max = array[n-1];
            for(int j = max;;j+=max){
                boolean a = true;
                for(int m=0;m<n-1;m++){
                    if(j % array[m]!=0){
                        a = false;
                        break;
                    }
                }
                if(a){
                    System.out.println(j);
                    break;
                }
            }
        }
    }
}
