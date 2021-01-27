/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/27 14:15
 * @version: 1.0$
 */

public class LN06_Integer {
    public static void main(String[] args) {
        Integer x = 100;
        Integer y = 100;
        System.out.println(x.equals(y));
        System.out.println("____________________________________");
        //装箱
        MyInteger m1 =new MyInteger(100);


    }
}

//创建一个MyInteger对象，将数字包装成一个对象
class MyInteger {
    int value ;
    public MyInteger() {

    }
    public MyInteger(int value){
        this.value = value;
    }

}