import com.sun.source.util.Trees;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/3 13:07
 * @version: 1.0$
 */

public class Test20210103 {
    public static void main(String[] args) {
        TreeSet<Test20210103_Vip> arr =new TreeSet<>();
        arr.add(new Test20210103_Vip("a",30));
        arr.add(new Test20210103_Vip("e",64));
        arr.add(new Test20210103_Vip("b",23));
        arr.add(new Test20210103_Vip("d",54));
        arr.add(new Test20210103_Vip("c",43));
        for (Test20210103_Vip vip : arr){
            System.out.println(vip);
        }


    }
}
class Test20210103_Vip implements Comparable<Test20210103_Vip>{
    String name;
    int age;
    int id;
    String sex;
    //排序方法
    //按照年龄降序排序
    //年龄相同则按照姓名排序

    @Override
    public String toString() {
        return "Test20210103_Vip{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Test20210103_Vip o) {
        if(this.age != o.age){
            return this.age - o.age;
        }else{
            //按照年龄排序
            return this.name.compareTo(o.name);
        }
    }

    public Test20210103_Vip(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
