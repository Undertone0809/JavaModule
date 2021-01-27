import java.util.*;

public class 生而为人_我很抱歉 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            //N首歌曲，表示N次循环
            //M为长度，表示循环M次
            int n = s.nextInt();
            int m = s.nextInt();
            char chararr[]=new char[m];
            boolean result =true;
            byte arr[]=new byte[m];
            int Aarr[]=new int[n];
            int Barr[]=new int[n];
            for (int i = 0;i < n;i++){
                //输入字符串
                String sth = s.next();
                //将字符串变成字符数组
                chararr =sth.toCharArray();
                for (int j = 0;j < m ; j++){
                    //将该数组中的数全部转变成ASCII
                    arr[j]=(byte)chararr[j];
                    //并且将Barr数组中所有数字求和
                    Aarr[i]+=arr[j];
                    Barr[i]+=arr[j];
                    //方法一：比较Aarr的大小排序（左小右大）,调用compare方法
                    //方法二：比较是否可以与Barr一一对应
                    //System.out.println(arr[j]);
                    //System.out.println(Barr[i]);


                }

                //调用ACompare方法输出比较之后的结果
             /*   if(!ACompare(Aarr,m)){
                    //如果存在false
                    //输出NO
                    result = false;
                }*/
            }
            Arrays.sort(Barr);
            for (int i= 0;i < n;i++) {
                //System.out.println("Aarr["+i+"]的值是"+Aarr[i]);
                //System.out.println("Barr["+i+"]的值是"+Barr[i]);
                if (Barr[i] != Aarr[i]) {
                    result = false;
                }
            }
            if(result){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

            /*            for (int i =0;i < Aarr.length;i++){
             *               Aarr[i]=0;
             *              arr[i]=0;
             *          }
             */
        }
/**
 * 定义字面量的时候可以将其定义在while内部
 * 这样子整个主方法结束之后就不用再写代码对重新将该字面量初始化了
 */
    }
/*

    //定义一个方法比较数组左右两边的大小
    //存在左边比右边大则输出false
    //反之为true
    public static boolean ACompare(int []Aarr,int m) {
        //数组遍历，对每一次相邻的数字进行比较
        for (int i = 0; i < m; i++) {
            //开启验证的判定
            if (Aarr[i + 1] != 0) {
                //如果左边比右边大，则输出false
                if (Aarr[i + 1] < Aarr[i]) {
                    return false;

                }
            }
        }
        return true;
    }
*/
}