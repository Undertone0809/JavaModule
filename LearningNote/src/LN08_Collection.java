import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/27 19:05
 * @version: 1.0$
 */
public class LN08_Collection {
    public static void main(String[] args) {
        ArrayList arr =new ArrayList();
        arr.add(1);
        Random random =new Random();
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }
        Iterator it =arr.iterator();//拿迭代器
        /*if(it.hasNext()){
            Object obj =it.next();//取出这个元素
        }*/
        //也可以写为
        while(it.hasNext()){
            //可以直接输出数字的原因是因为Integer重写了toString方法
            //if(it.next() instanceof Integer){
            //    System.out.println("这是一个Integer类型的数据");
            //}
            System.out.println(it.next());
        }


    }
}
