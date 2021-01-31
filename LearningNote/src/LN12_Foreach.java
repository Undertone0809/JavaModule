import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/31 21:37
 * @version: 1.0$
 */

public class LN12_Foreach {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList =new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        //迭代器遍历
        System.out.println("iterator____________________________");
        Iterator<Integer> it =arrayList.iterator();
        while(it.hasNext()){
            Integer num = it.next();
            System.out.println(num);
        }
        //foreach
        System.out.println("foreach_______________________________");
        for(Integer num: arrayList){
            System.out.println(num);
        }

    }

}
