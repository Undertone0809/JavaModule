/**
 * @version 2.0
 * @author Zeeland
 * @time 2021-01-14 18:33:13
 */
/**
 * 一种思路：从1到10两个数组中所有出现的次数，次数相减输出，但是会遇上顺序问题
 */
import java.util.Scanner;
import java.util.*;
public class No2034_02 {
	public static void main(String [] args) {
		Scanner s =new Scanner(System.in);
		while(s.hasNext()) {
			int n = s.nextInt();
			int m = s.nextInt();
			if(m == n && m ==0) break;
			//创建两个数组，并赋值
			int []aarr =new int[n];
			int []barr =new int[m];
			//创建差值数组
			ArrayList<Integer> arr =new ArrayList<>();
			for(int  i =0;i < n;i++) {
				aarr[i] = s.nextInt();
			}					
			for(int  i =0;i < m;i++) {
				barr[i] = s.nextInt();
				
			}
			//对比，如果出现多余的元素则加入一个ArrayList数组中
			for(int i =0;i<n;i++) {
				boolean isHas = false;
				for(int j =0;j < m;j++) {
					//如果找到了共同的元素，则结束本次i循环，进入下一i循环
					//如果没有找到共同的元素，则加入数组中
					if(aarr[i] == barr[j]) {
						isHas =true;
						break;
					}
				}
				if(!isHas) {
					arr.add(aarr[i]);
				}
			}
			//最后如果ArrayList数组为空，则输出null
			if(arr.isEmpty()) {
				System.out.print("NULL");
			}else {
				Collections.sort(arr);
				//使用迭代器遍历ArrayList
				for(Integer i : arr) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
			
		}
	}

}
