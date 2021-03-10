/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/6 15:01
 * @version: 1.0$
 */
package 天梯赛预选赛;
import java.util.ArrayList;
import java.util.Scanner;
public class No7_6 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n = s.nextInt();
            ArrayList<String> arr =new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String str= s.next();
                arr.add(judgePass(str));
            }
            for(int i=0;i<arr.size();i++){
                System.out.println(arr.get(i));
            }
        }
    }

    /**
     * 要求：
     * 1.不少于6个字符
     * 2.只有英文数组或者.
     * 3.必须既有英文又有数字
     * 4.不超过80个字符
     * 5.只要A输出了则直接结束程序
     */
    public static String judgePass(String str){
        boolean allDui = true;

        /* 判断长度*/
        if(str.length()<6){
            return("Your password is tai duan le.");
        }else{
                char []arr =str.toCharArray();
                boolean youZiMu = false;
                boolean youShuZi = false;

                //遍历完所有都没有字母或者数字
                for (int i = 0; i < arr.length; i++) {
                    //判断字母
                    if((arr[i]>=65&&arr[i]<=90)||(arr[i]>=97&&arr[i]<=122)) youZiMu = true;

                    //判断数字
                    if((arr[i]>=48 && arr[i] <=57)) youShuZi = true;

                }
                if(!youZiMu){
                    return("Your password needs zi mu.");
                }else if(!youShuZi){
                    return("Your password needs shu zi.");
                }else if(!isHeFa(str)){
                    return("Your password is tai luan le.");
                }else if(allDui){
                     return("Your password is wan mei.");
                }
        }
        return "";
    }
    //判断是否含有非法字符串
    public static boolean isHeFa(String str){
        char []arr =str.toCharArray();
        //循环，如果存在以外的数字，直接return false;
        for(int i=0;i<str.length();i++){
            //有字母或者有数字
            if((arr[i]>=65&&arr[i]<=90)||(arr[i]>=97&&arr[i]<=122)||(arr[i]>=48 && arr[i] <=57)||arr[i]==46){

            }else{
                //存在一个就false
                return false;
            }
        }
        return true;
    }
}
