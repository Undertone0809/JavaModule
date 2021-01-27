/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/31 21:24
 * @version: 1.0$
 */

public class LN11_FanXing {
    public static void main(String[] args) {
        LN11B b =new LN11B();
        LN11A a =new LN11A();
        LN11B<String> c =new LN11B<String>();
        String s2= b.get("something");
        System.out.println(s2);
        String s1 =c.get();
        System.out.println(s1);
    }
}
class LN11A{

}
class LN11B <t>{
    public t get(){
        return null;
    }
    public String get(String s){
        return s;
    }
}
