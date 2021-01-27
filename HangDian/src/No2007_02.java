import java.util.Scanner;
public class No2007_02 {
	public static void main(String []args) {
		Scanner s  = new Scanner(System.in);
		while(s.hasNext()) {
			//给定一段连续的整数区间
			//对于每组输入数据，输出一行，应包括两个整数x和y，分别表示该段连续的整数中所有偶数的平方和以及所有奇数的立方和。
			int n = s.nextInt();
			int m = s.nextInt();
			if(n > m) {
				int temp = n;
				n = m;
				m = temp;
			}
			//输出偶数的平方和
			//注意：数据类型使用long
			long esum = 0;
			for(long i = n ;i <= m ;i++) {
				//筛选偶数
				//将其求平方和
				if(i % 2 == 0) {
					long temp =i; 
					i =i * i;
					//放入槽
					esum += i;
					i = temp;
				
				}
			}
			//输出奇数的立方和
			long osum =0;
			for(long i=n;i <= m;i++) {
				if(i % 2 !=0) {
					long temp = i;
					i = i * i * i;
					osum += i;
					i = temp;
				}
				
			}
			System.out.println(esum+ " "+ osum);
		}
	}
}
