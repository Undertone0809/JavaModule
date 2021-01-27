/**
 * 灾后的救援需要很多的人员，现在又刚刚到达一批志愿者，他们一共有n（10<=n<=1000）人，根据指挥部的指示，他们将被分为抢险、医疗以及通信等3个小分队，并且规定，抢险小分队需要占总人数的一半（如果有小数的话，则舍去），医疗小分队需要占剩余人数的2/3（如果有小数的话，则舍去），剩余的则组成通信小分队。比如一共有55人，那么抢险小分队为55/2=27人，减去抢险小分队为27人剩下28人，则医疗小分队为28*2/3 = 18人，通信小分队为55-27-18=10人。
 *
 * 为了保证救援工作的顺利进行，指挥部决定为每个小分队指派若干当地的向导，原则是为每十个志愿者指派一个向导（如有不足10人的情况，也指派一个），现在请问：需要为这批志愿者指派多少个向导呢？
 *
 *
 * Input
 * 输入数据首先包含一个正整数C，表示有C组测试用例，然后是C行数据，每行包含一个正整数n(10<=n<=1000)，表示志愿者的总人数。
 *
 *
 * Output
 * 对于每组测试数据，请输出需要的向导数目，每个输出占一行。
 *
 *
 * Sample Input
 * 2
 * 14
 * 55
 *
 *
 * Sample Output
 * 3
 * 6
 */



import java.util.*;
public class No2186 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int a,x,y,z,ki =0;
            int n= s.nextInt();
            for(int i =0;i < n;i++){
               a = s.nextInt();
                //抢救=a/2
                x = a/2;
                //System.out.println("x:"+x);
                //医疗=（a -抢救）*2/3
                y = (a - x) *2 /3;
                //System.out.println("y:"+y);
                //通信=a-医疗-抢救
                z = a - x - y;
                //System.out.println("z:"+z);
                //向导原则：(通信%10)+1
                if(x % 10 ==0){
                    ki = x/10;
                }else{
                    ki = (x/10)+1;
                }
                if(z % 10 ==0){
                    ki += z/10;
                }else{
                    ki += (z/10)+1;
                }
                if(y % 10 ==0){
                    ki += y/10;
                }else{
                    ki += (y/10)+1;
                }
                System.out.println(ki);
            }
        }
    }
}
