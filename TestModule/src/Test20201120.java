import java.util.Scanner;

public class Test20201120 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        char a ='a';
        char b ='b';
        char c ='a';
        String k ="k";
        System.out.println((byte)a == (byte)b);
        System.out.println((byte)a == (byte)c);
        System.out.println(a == c);
        //结论，char数组不需要直接转换成byte进行比较

        //测试nextline方法
        String str1 =s.next();
        System.out.println("执行了1");
        String str2 =s.nextLine();
        System.out.println("执行了2");
        System.out.println(str2);
        String str3 =s.nextLine();
        System.out.println("执行了3");
        //结论：next检测到空白符后停止语句，并将next语句后面的内容承接给nextline方法
        //即next方法中肯定没有空格
        //nextline中可能存在空格

    }
}
