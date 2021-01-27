/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/1 16:10
 * @version: 1.0$
 */

import java.util.HashSet;
import java.util.Set;

/**
 * this programming aimed to create a interface to imitate Map construction
 */

public class LN13_MapInterface_01 {
}

/**
 *
 * @param <K> K means key
 * @param <V> V means Value
 */
interface LN13_MyMap<K,V>{
    //获取长度
    int size();

    //添加一个键值对
    V put(K key,V value);

    //将key转换为一个set
    //return a set
    HashSet<K> keySet();

    //将key和value转换为一个set
    //returna a set
    //the set contains two types of data
}

interface LN13_DoubleSet<K,V>{

    K getKey();

    V getValue();

    boolean equals();
}

/**
 *  create a HashMap to override the interface method
 */
class LN13_MyHashMap implements LN13_MyMap{

    int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object put(Object key, Object value) {
        return null;
    }

    @Override
    public HashSet keySet() {
        return null;
    }
}

interface LN13_MyData01<V,K>{

}

class LN13_MyData02<A,B>{

}

class abd{
    public Set<LN13_MyData01> method1(Set<LN13_MyData01> set){
        return set;

    }
    public Set<LN13_MyData02> method2(Set<LN13_MyData02> set){
        return set;
    }

}