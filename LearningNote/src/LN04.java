import jdk.swing.interop.SwingInterOpUtils;

/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/26 22:06
 * @version: 1.0$
 */

/**
 * 该程序为了检验常量的调用，结果如下：
 *  1.如果在类中定义static的静态变量时(static final String s)，调用的时候既可以用引用调用也可以用类来调用
 *  2.如果在类中定义实例常量时(final String s)，调用的时候只能用引用来调用
 */

public class LN04 {
    public static void main(String[] args) {
        Chinese c1 =new Chinese();
        System.out.println(c1.COUNTRY);
        System.out.println(c1.COUNTRYS);
        System.out.println(Chinese.COUNTRY);
        String s = "chis ";
        System.out.println(s);
    }
}

abstract class Human{
    //国家属性
    static final String COUNTRY="";

    //说话方法
    public abstract void speak();

}

class Chinese extends Human{
    //成员变量被引用会变成紫色，局部变量被引用不会变紫色
    //常量（既可以用引用来调用也可以用类来调用）
    static final String COUNTRY ="Chinese";
    //只能用引用来调用
    final String COUNTRYS = "COUNTRY";

    @Override
    public void speak(){
        System.out.println("会说中文");
    }
}
class American extends Human{
    @Override
    public void speak() {
        System.out.println("会说英语");
    }
}




