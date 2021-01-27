/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/24 22:13
 * @version: 1.0$
 */
public class LN01 {
    public static void main(String[] args) {
        Student s1 =new Student();
        Student s2 =new Student("ok");
        Student s3  =new Student(10.0);

    }
}
class Student{
    private int no;
    private String name;
    private String address;
    //byte short int long float double boolean char
    public Student(double num){
        System.out.println("输出了Student的float方法");
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(){
        System.out.println("调用了无参构造");
    }

    public Student(String s){
        System.out.println("调用的Student的String方法");
        this.address = s;
    }

    public static void main(String[] args) {
        System.out.println("student的main方法执行了");
    }
}
