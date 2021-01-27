/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/27 14:23
 * @version: 1.0$
 */

public class LN07_Exception {
    public static void main(String[] args) {
        try {
            method();
        }catch (ClassNotFoundException e){
            System.out.println("main方法中出现了ClassNotFoundException");
        }
        try {
            method1();
        } catch (A a) {
            a.printStackTrace();
        }
        //System.out.println("_________________________________");
        //MyException m1 = new MyException("用户名不能为空");
        //m1.printStackTrace();
        System.out.println("_______________________________________");
        int i =1;
        //要求抛出异常
        if(i != 0){
            MyException e= new MyException("i不等于0");
            e.printStackTrace();
        }


    }


    public static void method() throws ClassNotFoundException{
        System.out.println("执行了method");
    }

    public static void method1() throws A{
        System.out.println("执行了method1");
    }

}
//定义一个异常A
class A extends Exception{
    //抛出异常的一种方式
    /*public void push(Object obj) throws A {
        if(true){
            A e =new A();
            throw e;
        }
    */

    public void push(Object obj)throws A {
        throw new A("here is a exception");

    }
    public A(String s){
        super(s);
    }
    public A(){

    }
}
