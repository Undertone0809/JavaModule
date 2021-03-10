import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/9 21:15
 * @version: 1.0$
 */

public class P5250 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n=s.nextInt();
            LinkedList<Integer> list =new LinkedList<>();
            for (int i = 0; i < n; i++) {
                switch (s.nextInt()){
                    case 1:
                        int mid =s.nextInt();
                        if(list.size()==0||mid >list.peekLast()){
                            list.add(mid);
                        }else{
                            list.addFirst(mid);
                        }
                    case 2:
                        break;
                }
            }
        }
    }
}
