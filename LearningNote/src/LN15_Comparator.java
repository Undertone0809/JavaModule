import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/2 19:51
 * @version: 1.0$
 */

/**
 * 本程序旨在调试TreeSet中在排序中使用的两种排序方法之一：比较器
 */
public class LN15_Comparator {
    public static void main(String[] args) {
        //让TreeSet调用指定的比较器进行比较
        TreeSet<LN15_WuGui> set =new TreeSet<>(new Comparator<LN15_WuGui>() {
            @Override
            public int compare(LN15_WuGui o1, LN15_WuGui o2) {
                return o1.age - o2.age;
            }
        });
        set.add(new LN15_WuGui(712340));
        set.add(new LN15_WuGui(614314));
        set.add(new LN15_WuGui(6124410));
        set.add(new LN15_WuGui(510214));
        set.add(new LN15_WuGui(41023));
        set.add(new LN15_WuGui(21054));
        set.add(new LN15_WuGui(710576));
        for (LN15_WuGui wuGui:set){
            System.out.println(wuGui);
        }
        List l1 =new ArrayList();


    }
}


class LN15_WuGui{
    int age;
    public LN15_WuGui(){

    }

    public LN15_WuGui(int age) {
        this.age = age;
    }

    //重写WuGui的toString方法表达int
    @Override
    public String toString() {
        return "LN15_WuGui{" + "age=" + age + '}';
    }
}/*
class LN15_WuGuiComparator implements Comparator<LN15_WuGui>{
    @Override
    public int compare(LN15_WuGui o1, LN15_WuGui o2) {
        return o1.age - o2.age;
    }
}*/
