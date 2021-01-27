import java.util.Scanner;
public class No2007_03 {
	public static void main(String []args) {
		Scanner s =new Scanner(System.in);
		while(s.hasNext()) {
			int n = s.nextInt();
			int m = s.nextInt();
			if(n > m) {
				int mid = n;
				n = m ;
				m = mid;
			}
			long esum =0;
			long osum =0;
			//直接在一个循环内分出奇数和偶数
			for(long i =n;i <= m;i++) {
				if(i % 2 ==0) {
					long temp = i;
					temp = temp * temp ;
					esum += temp;
				}else {
					long temp = i;
					temp = temp * temp * temp;
					osum += temp;
				}
			}
			System.out.println(esum + " "+ osum);
		}
	}
}
