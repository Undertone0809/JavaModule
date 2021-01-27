import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/1 15:26
 * @version: 1.0$
 */

public class LN13_Map_01 {
    public static void main(String[] args) {
        Map<Integer,String> map =new HashMap<>(10);
        String jane ="Jane";
        for (int i = 0; i < 10; i++) {
            map.put(i,jane);
        }
        //method3:get map.entrySet
        //使用foreach表达
        //先把Map转换为Set
        //其中该set底层数据类型是Map.Entry<Intger,String>
        //这种数据类型是在创建Map的同时创建出来的
        Set<Map.Entry<Integer,String>>  mapSet = map.entrySet();
        for(Map.Entry<Integer,String>  something : mapSet ){
            System.out.println("Key:"+something.getKey()+"   Value:"+something.getValue());
        }
        System.out.println("_____________________________________");
        //method4:map.entry<V,K> 's Iterator to iterate
        Iterator<Map.Entry<Integer,String>> it = mapSet.iterator();
        while(it.hasNext()){
            Map.Entry<Integer,String> node = it.next();
            System.out.println("Key:"+node.getKey()+"   Value:"+node.getValue());
        }

    }
}

