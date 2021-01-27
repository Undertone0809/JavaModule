import javax.tools.SimpleJavaFileObject;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/25 12:38
 * @version: 1.0$
 */

public class LN02 {
    int i  =100;
    public static void main(String[] args) {
        System.out.println(new LN02().i);
        Date date =new Date();//调用无参构造
        System.out.println("date:" + date);//Date的无参构造
        Date d1 =new Date(123);
        date.getTime();
        date.after(d1);
        System.out.println(date);
        System.out.println(d1);
        Bird bird1 =new Bird();
        bird1.Jiao();
        SimpleDateFormat format =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(format.format(System.currentTimeMillis()));
        System.out.println("----------------------------------------------------");
        Time tim11 =new Time();
        System.out.println(tim11);
        System.out.println("--------------------------------------------------");
        Bird bird2 =new Bird("bird");
        bird2.method();//如果向上转型则无法调用method方法，只能调用父类继承的方法
    }
}
class Animal{
    String name;
    //无参构造
    public Animal(){
        System.out.println("调用了animal的无参构造");
    }
    public Animal(String name){
        super();
        this.name = name;
    }


    //Animal的叫方法
    public void Jiao(){
        System.out.println("Animal会叫");
    }
}
class Bird extends Animal{
    String name;
    public Bird(){
        System.out.println("调用了bird的无参构造");
    }
    public Bird(String name){
        super();
        this.name = name;
    }
    @Override
    public void Jiao(){
        System.out.println("鸟儿在飞翔");
    }

    //定义一个方法输出name
    //父中有子中有，如果想在子类中访问父类
    //则需要super调用
    public void method(){
        System.out.println("Animal的名字为："+super.name);
        System.out.println("Bird的名字为："+this.name);
        System.out.println(name);
    }

}
class Time extends Date{
    public Time(){
        System.out.println("调用了Time的无参构造");
    }
}