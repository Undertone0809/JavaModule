import java.util.Scanner;
public class No1008_2 {
	public static void main(String []args) {
		Scanner s =new Scanner(System.in);
		while(s.hasNext()) {
			int n =s.nextInt();
			if(n ==0) break;
			int second = 0;//计时器
			int floor =0;//楼层初始化
			for(int i =0;i < n;i++) {
				int nf =s.nextInt();
				//输入一个数
				//和上一个数字比较
				//如果比上一个数字大则上楼
				if(nf > floor) {
					//上到指定楼层所需要的时间
					second += (nf - floor) * 6;
				}else {
					//如果比上一个数字小则下楼	
					//下楼所需要的时间
					second += (floor - nf) * 4;
				}
				//到站停留5秒
				second += 5;
				//楼层初始化
				floor = nf;
				//结束该循环	
			}
			//输出总时间
			System.out.println(second);
		}
	}

	//上一楼6秒
	//下一楼4秒
	//到站停留5秒
	public static void Shanglou(int a ) {
		System.out.println("调用了上楼方法");
		
	}
}
