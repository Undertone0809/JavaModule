/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/6 19:46
 * @version: 1.0$
 */
import java.util.Scanner;
public class P2670 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n = s.nextInt();
            int m = s.nextInt();
            int [][]arr =new int[n][m];
            String [][]place = new String[n][m];//放地雷
            for (int x = 0; x < n; x++) {
                for (int y = 0; y < m; y++) {
                    place[x][y] = s.next();//放地雷
                    if(place[x][y].equals("*")){
                        for(int i=x-1;i<=x+1;){}
                    }
                }
            }


        }
    }
    //判断范围
    public static boolean limit(int a,int b,int x,int y){
        if(a-1<0) return false;
        if(a+1>x) return false;
        if(b-1<0) return false;
        if(b+1>y) return false;
        return true;
    }
}
