/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/7 20:49
 * @version: 1.0$
 */
import java.util.Scanner;
public class P1551 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();//人数
            int m =s.nextInt();//m对关系
            int p =s.nextInt();//问p次关系
            int [] pre =init(new int[n+1]);
            for (int i = 0; i < (m + p); i++) {
                //m对关系
                if(i<m){
                    join(pre,s.nextInt(),s.nextInt());
                }else{
                    isFriend(pre,s.nextInt(),s.nextInt());
                }

            }
        }
    }
    public static void isFriend(int []pre,int x,int y){
        //如果两个根相等
        if(find(pre,x) == find(pre,y)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }


    //自己为根
    public static int[] init(int []pre){
        for (int i = 0; i < pre.length; i++) {
            pre[i] = i;
        }
        return pre;
    }
    //称为朋友
    public static void join(int []pre,int x,int y){
        //寻找两个子结点的根
        int lx=find(pre,x),ly=find(pre,y);
        //如果两个根相等，说明具有相同的关系
        if(lx==ly) return;
        //让lx称为ly的根
        pre[ly] = lx;
    }

    //如果自己就是根，则直接返回
    //如果pre[x]!=x，就一直找
    public static int find(int []pre,int x){
        if(pre[x] == x) return x;
        int r=x;
        while(r!=pre[r]) {
            r=pre[r];
        }
        int tmp=x,j;
        //如果根不是直接父母，则变成自己父母
        while(tmp!=pre[tmp]) {
            j=pre[tmp];
            pre[tmp]=r;
            tmp=j;
        }
        return r;
    }
}
