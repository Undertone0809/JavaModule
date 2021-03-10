import java.util.Scanner;

/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/7 16:35
 * @version: 1.0$
 */
public class Test20210307 {
    public static int [] rank = new int[100];

    public static void init(){
        for (int i = 0; i < rank.length; i++) {
            rank[i] = i;
        }
    }
    public static int findRoot(int x){
        int father =x;
        while(father!= rank[father]);
        father = rank[father];
        return father;
    }
    //连接两个没有联系的树,只要x的根作为y的根的父母就可以了
    public static void connect(int x,int y){
        int lx = findRoot(x),ly = findRoot(y);
        if(lx != ly)rank[lx] = ly;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            init();
            connect(1,2);
            connect(2,3);
            connect(4,5);
            connect(5,6);
            System.out.println(findRoot(3));

        }
    }

}

