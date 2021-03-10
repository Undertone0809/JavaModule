import java.util.Scanner;

/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/8 22:59
 * @version: 1.0$
 */

public class P1536 {

    public static void join(int []pre,int x,int y){
        int lx = find(pre,x),ly= find(pre,y);
        if(lx != ly) pre[ly] =lx;
    }
    public static int find(int []pre,int x){
        //自己是根
        if(pre[x]==x) return x;
        int r =x;
        //如果上一级不是根
        //pre[a]=b pre[b]=c pre[c]=d pre[d]=d,停止a的根为d
        while(r !=pre[r]){
            r = pre[r];
        }
        //路径优化
        //让子树上的所有孩子都成为r的直系孩子
        //pre[a]=b pre[b]=c --> pre[a]=r pre[b]=r ...pre[r]=r
        //注意：要用两个变量承接
        int temp =x,mid;
        while(temp!=pre[temp]){
            mid =pre[temp];
            pre[temp] =r;
            temp = mid;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            if(n == 0)break;
            int m =s.nextInt();
            int []pre =new int[n+1];
            //初始化，自己为根
            for (int i = 0; i < pre.length; i++) {
                pre[i] = i;
            }
            for (int i = 0; i < m; i++) {
                join(pre,s.nextInt(),s.nextInt());
            }
            //如果是根，则置1
            int []mid =new int[n+1];
            for (int i = 1; i < mid.length; i++) {
                if(pre[i]==i) mid[i] =1;
//                mid[find(pre,i)] =1;
            }
            int count=0;
            for (int i = 1; i < mid.length; i++) {
                if(mid[i]==1)count++;
            }
            //遍历，如果两个城市的父母不同
            //则让两个父母join
            //算法复杂度太高
//            int count =0;
//            for (int i = 1; i < pre.length-1; i++) {
//                int lx = find(pre,pre[i]);
//                int ly = find(pre,pre[i+1]);
//                if(lx!=ly){
//                    join(pre,i,i+1);
//                    count++;
//                }
//            }
            System.out.println(count-1);
        }
    }
}
