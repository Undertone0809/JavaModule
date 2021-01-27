/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/2 19:03
 * @version: 1.0$
 */
import java.util.TreeSet;
public class LN14_Comparable {
    public static void main(String[] args) {
        TreeSet<LN14_Vip> set =new TreeSet<>();
        set.add(new LN14_Vip("D",14));
        set.add(new LN14_Vip("E",15));
        set.add(new LN14_Vip("F",12));
        set.add(new LN14_Vip("B",11));
        set.add(new LN14_Vip("G",17));
        set.add(new LN14_Vip("H",15));
        set.add(new LN14_Vip("A",10));
        set.add(new LN14_Vip("C",19));
        for(LN14_Vip vip:set){
            System.out.println(vip);
        }
    }
}
class LN14_Vip implements Comparable<LN14_Vip>{
    String name;
    int age;
    public LN14_Vip(){}

    public LN14_Vip(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public LN14_Vip(int age) {
        this.age = age;
    }

    public LN14_Vip(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "LN14_Vip{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    @Override
    public int compareTo(LN14_Vip vip) {
        if(this.age == vip.age){
            //年龄相同时按照名字排序
            //年龄排序直接调用String的compareTo方法
            return this.name.compareTo(vip.name);
        }else{
            return this.age - vip.age;
        }

    }
}










