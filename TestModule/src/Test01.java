import java.util.LinkedList;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), q = sc.nextInt();
        //创建一个list，list中的元素为integer
        LinkedList<Integer> list = new LinkedList<>();
        //将元素放入list数组中
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());//linkedlist只能操作list的最后一个数字
        //进入单次操作
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            //判断x的数值
            if (x == 1) {
                list.remove(sc.nextInt() - 1);
            } else if (x == 2) {
                list.add(sc.nextInt() - 1, sc.nextInt());
            } else {
                int y = sc.nextInt() - 1;
                int count = 1;
                for (int j = y; j < list.size() - 1; j++) {
                    if (list.get(j) == list.get(j + 1)) count++;
                    else break;
                }
                list.set(y, list.get(y) * count);
                count--;
                while (count-- > 0) list.remove(y + 1);
            }
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
