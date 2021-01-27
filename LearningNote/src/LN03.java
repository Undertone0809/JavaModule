/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/25 23:36
 * @version: 1.0$
 */

/**
 * 一、该文件中存在的类：
 *
 * 1.Abstract class : class1
 * class1 中存在三个抽象方法
 * class1 中存在一个有参构造和一个无参构造
 *
 * 2.class : class2 class3
 * class2 中重写了class1中的三个抽象方法，将抽象方法转换为了实例方法，否则在class中依旧是三个抽象方法
 * class3 中只重写了class1中的method1抽象方法
 *
 * 二、调用该程序的main方法，可以看到：创建一个子类对象，父类的无参构造是否会被引用
 * 输出台的控制结果：
 * 抽象类class1的无参构造被调用
 * class2中的无参构造被调用
 *
 * 实验结果表明：1.无论是用多态创建对象，还是直接创建子类对象，都会同时调用的父类的构造方法
 *             2.抽象类中可以创建构造方法
 */
public class LN03 {
    public static void main(String[] args) {
        class2  c1  =new class2();
        class1  c2  =new class2();

    }


}
abstract class class1{
    public class1(){
        System.out.println("抽象类class1的无参构造被调用");
    }
    public class1(String s){

    }
    //抽象方法可以有变量
    String s ;
    //抽象方法
    public abstract void method1();
    public abstract void method2();
    public abstract void method3();

}

class class2 extends class1{
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }
    public class2(){
        System.out.println("class2中的无参构造被调用");
    }
}
abstract class class3 extends class1{
    @Override
    public void method1(){

    }
    public class3(){
        System.out.println("class3的无参构造被调用");
    }
}

