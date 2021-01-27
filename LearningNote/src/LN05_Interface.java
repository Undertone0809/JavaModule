/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/26 22:18
 * @version: 1.0$
 */

public class LN05_Interface {
    public static void main(String[] args) {
        Chinese01 c1 =new Chinese01();
        c1.method();
        System.out.println("----------------------------------------------");
        //面向接口编程，多态
        MyMath m1 =new Mathe();
        System.out.println("————————————————————————————————————————————————————");
        Mathe mm =new Mathe();
        //调用接口的实现类
        mm.mySum(new MyMathImpl(),100,100);
    }
}
//数学接口
interface MyMath{
    //加法的方法
    int sum(int a ,int b);
    //public abstract为了简便可以忽略,但是在抽象类中就不可以这样
    int sub(int a,int b);
}
class MyMathImpl implements MyMath{
    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }
}

class Mathe implements MyMath{
    @Override
    public int sum(int a, int b) {
        System.out.println("");
        return 0;
    }

    @Override
    public int sub(int a, int b) {
        return 0;
    }

    public void mySum(MyMath m,int a,int b){
        int retValue = m.sum(a,b);
        System.out.println("retValue:"+retValue);
    }

}

interface Jiao{
   String NAMEMETHOD = "说话";
    void method();
}

class Chinese01 implements Jiao{
    @Override
    public void method() {
        System.out.println("说中文");
    }
}


