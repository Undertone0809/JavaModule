/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/27 16:40
 * @version: 1.0$
 */

public class LN07_Exception02 {
    public static void main(String[] args) {
        int i =0;
        if(i != 1){
            MyException e =new MyException();
            e.printMyException("i不等于1");
        }
    }
}
//定义一个异常
class MyException extends Exception{
    public MyException(){

    }
    //将错误信息通过有参构造传到父类中
    public MyException(String message){
        super(message);
    }
//创建一个直接输入异常输出异常的方法
    public void printMyException(String message){
        MyException e =new MyException(message);
        e.printStackTrace();
    }

}

