/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/7 17:08
 * @version: 1.0$
 * @http: http://acm.hdu.edu.cn/showproblem.php?pid=1232
 * @title: 畅通工程
 */
package 常见题型;
import java.util.Scanner;
public class 并查集_01{

    //找树根
    public static int find(int []pre,int x) {
        if(x==pre[x]) return x;
        int r=x;
        while(r!=pre[r]) {
            r=pre[r];
        }
        //如果自己不是根，则直接让r称为x的根
        int tmp=x,j;
        //pre[a]=b j=pre[a] pre[a]=r b=pre[a]
        while(tmp!=pre[tmp]) {
            j=pre[tmp];
            pre[tmp]=r;
            tmp=j;
        }
        return r;
    }
    //连接元素
    public static void join(int a[],int x,int y) {
        int root1=find(a,x),root2=find(a,y);
        if(root1==root2) return;
        a[root1]=y;
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        while(in.hasNext()) {
            int n=in.nextInt();if(n==0) break;//n个城市
            int m=in.nextInt();
            int []pre=new int[n+1];//上一级数组
            for(int i=1;i<=n;i++)pre[i]=i;//自己是根
            //连接两个节点
            while(m-->0) {
                join(pre,in.nextInt(),in.nextInt());
            }
            int []t=new int[n+1];//值为1的是根
            int cnt=0;
            for(int i=1;i<=n;i++) {
                t[find(pre,i)]=1;
            }
            for(int i=1;i<=n;i++) {
                if(t[i]==1) cnt++;
            }
            System.out.println(cnt-1);
        }
    }
}
