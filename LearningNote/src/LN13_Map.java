import java.util.*;

/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/31 22:38
 * @version: 1.0$
 */

public class LN13_Map {
    public static void main(String[] args) {
        //钻石表达式
        Map<Integer,String> map =new HashMap<>();
        String s ="Jane";
        for (int i = 0; i < 10; i++) {
            map.put(i,s);
        }
        //遍历Map
        //method1: 取出key，遍历key，map(K key)来输出
        Set<Integer> intSet =map.keySet();
        //用iterator迭代intSet中的key
        Iterator<Integer> it1 =intSet.iterator();
        while(it1.hasNext()){
            Integer intNum = it1.next();
            System.out.println("Key:" +intNum +"   Value:" + map.get(intNum));
        }

        //method2 : foreach
        for(Integer num :intSet){
            System.out.println("Key:"+num + "   Value:" + map.get(num));
        }


    }
}
