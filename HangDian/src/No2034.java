import java.util.Arrays;
import java.util.Scanner;
public class No2034 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            int m =s.nextInt();
            if(n == 0 && m ==0){
                break;
            }
            int []arr1=new int[n];
            int []arr2=new int[m];
            for(int i =0;i < n+m;i++){
                if(i < n){
                    arr1[i] =s.nextInt();
                }else{
                    arr2[i-n] =s.nextInt();
                }
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            int mid[]=new int[n+m];//创建中间数组
            Arrays.fill(mid,0);//填充中间数组
            int count =0;//创建mid的计时器count
             //把交集以外的元素放入一个新的数组中
             //然后遍历数组
             //先遍历arr1的元素与遍历arr2进行比较
             //如果遍历了整个数组都没有找到对应的元素
             //则count++，加入新的数组中
             for(int i=0;i< arr1.length;i++){
                 boolean isHas=false;
                 for(int j =0;j< arr2.length;j++){
                     if(arr1[i] ==arr2[j]){
                         isHas=true;
                         break;
                     }
                  }
                 //如果没有出现相同的元素
                 //则将该元素放入mid数组中
                 if(!isHas){
                     mid[count] = arr1[i];
                     count++;
                 }
             }
             Arrays.sort(mid);
            //输出mid数组中的内容
            int count2 =0;
            for(int i = 0;i < mid.length;i++) {
                if(mid[i] != 0){
                    count2++;
                }
            }
            if(count2 == 0){//中介数组是空的
                System.out.println("NULL");
            }else{
                for(int i = 0;i < mid.length;i++) {
                    if(mid[i]!=0){
                        if(i == mid.length-1){
                            System.out.println(mid[mid.length-1]+" ");
                        }else{
                            System.out.print(mid[i]+" ");
                        }
                    }
                }
                }
            }
    }
}
