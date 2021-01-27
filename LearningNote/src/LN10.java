import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/31 16:29
 * @version: List02$
 */

public class LN10 {
    public static void main(String[] args) {
        //创建三个对象
        Cat01 cat =new Cat01();
        Animal01 animal01 =new Animal01();
        Bird01 bird =new Bird01();

        //定义一个ArrayList集合
        ArrayList<Animal01> arr =new ArrayList<>();
        arr.add(cat);
        //读取迭代器
        Iterator<Animal01> it = arr.iterator();

        while(it.hasNext()){
            Object obj = it.next();
            if(obj instanceof Animal01){
                Animal01 a1=(Animal01)obj;
                a1.move();
            }
        }

        while(it.hasNext()){
            Animal01 a1 =it.next();
        }
    }
}

class Animal01{
    public  Animal01(){
        System.out.println("Animal can move");
    }
    public void move(){
        System.out.println("Animal can move");
    }
}


interface AnimalInterface{

}
class Cat01 extends Animal01 implements AnimalInterface {
    public Cat01() {
        System.out.println("cat can run");
    }

    //特有方法
    public void Cat01Method(){
        System.out.println("Cat can run");
    }
}
class Bird01 extends Animal01{
    public Bird01() {
        System.out.println("Bird can fly");
    }

    //特有方法
    public  void Bird01Method(){
        System.out.println("Bird can fly");
    }
}

