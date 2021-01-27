/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/15 18:42
 * @version: 1.0$
 */
import java.util.Scanner;
public class K1003 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            for(int i =0;i<n;i++){
                String str =s.next();
                int num =s.nextInt();
                //String转换成int
                String []arr=str.split("-");
                int mon =Integer.valueOf(arr[0]);
                int day =Integer.valueOf(arr[1]);
                method(mon,day,num);
            }
        }
    }
    //input mon day
    //output mon day
    public static int method(int mon,int day,int num){
        day += num;
        //1 3 5 7 8 10 12
        //2 28days
        //4 6 9 11
        if(mon==2){
            if(day > 28){
                day -= 28;
                mon +=1;
                return method(mon,day,0);
            }
        }else if(mon ==1 ||mon ==3||mon==5||mon==7||mon==8||mon==10||mon==12){
            if(day > 31){
                day -= 31;
                mon += 1;
                return method(mon,day,0);
            }
        }else if(mon==4||mon==6||mon==9||mon==11){
            if(day > 30){
                day -=30;
                mon +=1;
                return method(mon,day,0);
            }
        }
        if(mon < 10 && day < 10){
            System.out.println("2077-0"+mon+"-0"+day);
        }else if(mon < 10){
            System.out.println("2077-0"+mon+"-"+day);
        }else if(day < 10){
            System.out.println("2077-"+mon+"-0"+day);
        }else{
            System.out.println("2077-"+mon+"-"+day);
        }

        return mon;
    }
}
