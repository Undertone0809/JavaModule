/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/31 8:58
 * @version: 1.0$
 */
import java.util.Scanner;
public class P1002 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int bx =s.nextInt();
            int by =s.nextInt();
            int cx =s.nextInt();
            int cy =s.nextInt();
            int [][] f =new int[bx+1][by+1];
//            //initialization
//            boolean a= cx-1 >0;
//            boolean b= cx-2 >0;
//            boolean c= cy-1 >0;
//            boolean d= cy-2 >0;
//            boolean e= cx+1 <bx;
//            boolean g= cx+2 <bx;
//            boolean h= cy+1 <by;
//            boolean k= cy+2 <by;
            for(int i=0;i<bx+1;i++){
                for(int j=0;j<by+1;j++){
                    f[0][0] =1;
                    if(i ==0 &&j==0){}else
                    //如果在边缘，且point点在边缘
                    if(i ==0 && j!=0){
                        f[0][j] = 1;
                        f[0][j] = f[0][j-1];
                        if(cx+1 ==i&&j==cy+2) f[cx+1][cy+2] =0;
                        if(cx+2 ==i&&j==cy+1) f[cx+2][cy+1] =0;
                        if(i==cx-1&&j==cy-2) f[cx-1][cy-2] =0;
                        if(i==cx-2&&j==cy-1) f[cx-2][cy-1] =0;
                        if(i==cx-1&&j==cy+2) f[cx-1][cy+2] =0;
                        if(i==cx-2&&j==cy+1) f[cx-2][cy+1] =0;
                        if(i==cx+1&&j==cy-2) f[cx+1][cy-2] =0;
                        if(i==cx+2&&j==cy-1) f[cx+2][cy-1] =0;
                        if(i ==cx&&j==cy) f[cx][cy] =0;
                    }else if(j==0 && i!=0){
                        f[i][0] =1;
                        f[i][0]=f[i-1][0];
                        if(cx+1 ==i&&j==cy+2) f[cx+1][cy+2] =0;
                        if(cx+2 ==i&&j==cy+1) f[cx+2][cy+1] =0;
                        if(i==cx-1&&j==cy-2) f[cx-1][cy-2] =0;
                        if(i==cx-2&&j==cy-1) f[cx-2][cy-1] =0;
                        if(i==cx-1&&j==cy+2) f[cx-1][cy+2] =0;
                        if(i==cx-2&&j==cy+1) f[cx-2][cy+1] =0;
                        if(i==cx+1&&j==cy-2) f[cx+1][cy-2] =0;
                        if(i==cx+2&&j==cy-1) f[cx+2][cy-1] =0;
                        if(i ==cx&&j==cy) f[cx][cy] =0;
                    }else{
                        //如果不在边缘
                        f[i][j] = f[i-1][j] + f[i][j-1];
                        //所有数字不能处在两端点
                        if(i !=bx && j != by){
                            if(cx+1 ==i&&j==cy+2) f[cx+1][cy+2] =0;
                            if(cx+2 ==i&&j==cy+1) f[cx+2][cy+1] =0;
                            if(i==cx-1&&j==cy-2) f[cx-1][cy-2] =0;
                            if(i==cx-2&&j==cy-1) f[cx-2][cy-1] =0;
                            if(i==cx-1&&j==cy+2) f[cx-1][cy+2] =0;
                            if(i==cx-2&&j==cy+1) f[cx-2][cy+1] =0;
                            if(i==cx+1&&j==cy-2) f[cx+1][cy-2] =0;
                            if(i==cx+2&&j==cy-1) f[cx+2][cy-1] =0;
                            if(i ==cx&&j==cy) f[cx][cy] =0;
                        }
                    }
                }
            }
            System.out.println(f[bx][by]);
        }
    }
}