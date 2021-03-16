import java.util.Scanner;
import java.util.Stack;

/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/10 17:38
 * @version: 1.0$
 */

public class P1449 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            String str =s.next();
            char []arr =str.toCharArray();
            Stack<String> stack =new Stack<>();
            Integer mid;
            for (int i = 0; i < arr.length; i++) {
                switch (arr[i]){
                    case '.':
                        break;
                    case '-':
                        mid =-Integer.parseInt(stack.pop())+Integer.parseInt(stack.pop());
                        //String转换为int
                        stack.add(mid+"");
                    case '+':

                        mid =Integer.parseInt(stack.pop())+Integer.parseInt(stack.pop());
                        //String转换为int
                        stack.add(mid+"");
                    case '*':
                        mid =Integer.parseInt(stack.pop())*Integer.parseInt(stack.pop());
                        //String转换为int
                        stack.add(mid+"");
                    case '/':
                        mid =1/(Integer.parseInt(stack.pop())/Integer.parseInt(stack.pop()));
                        //String转换为int
                        stack.add(mid+"");
                    case '@':
                        break;
                    default://数字
                        stack.add(arr[i]+"");
                }
            }
            System.out.println(stack.peek());

        }
    }
}
