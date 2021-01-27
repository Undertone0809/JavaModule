/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/14 14:21
 * @version: 1.0$
 */

import java.io.*;

public class No1176 {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int[][] data = new int[100010][12];
        int mid;
        while(true)
        {
            mid = Integer.parseInt(stdin.readLine());
            if(mid==0){
                return;
            }
            for(int i=0; i<100010; ++i)//二维数组初始化
            {
                for(int j=0; j<12; ++j)
                {
                    data[i][j] = 0;
                }
            }
            int maxTime = 0;
            for(int t=0; t<mid; ++t) {
                String[] temp = stdin.readLine().split(" ");
                int a = Integer.parseInt(temp[0]);
                int b = Integer.parseInt(temp[1]);
                data[b][a]++;
                if(b>maxTime) maxTime = b;
            }
            for(int i=maxTime-1; i>=0; --i)
            {
                for(int j=0; j<=10; ++j)
                {
                    if(j==0) data[i][j] += max(data[i+1][j], data[i+1][j+1]);
                    else if(j==10) data[i][j] += max(data[i+1][j-1], data[i+1][j]);
                    else data[i][j] += max(data[i+1][j-1], data[i+1][j], data[i+1][j+1]);
                }
            }
            System.out.println(data[0][5]);
        }
    }
    public static int max(int a, int b) {
        return a>b? a : b;
    }

    public static int max(int a, int b, int c) {
        int mid = b;
        if(a>mid) mid = a;
        if(c>mid) mid = c;
        return mid;
    }

}
