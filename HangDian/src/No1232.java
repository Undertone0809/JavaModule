import java.util.Scanner;

/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/7 21:13
 * @version: 1.0$
 */

public class No1232 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            int []pre =new int[n];

        }
    }
    //查询根
    public static int find(int []pre,int x){
        if(pre[x] == x) return x;
        int mid =x;
        while(mid !=pre[mid]) mid =pre[mid];

        return mid;
    }
    //添加关系
    public static void join(int []pre,int x,int y){
        int lx =pre[x],ly =pre[y];
        if(lx == ly) return;
        pre[lx] = ly;
    }
}
