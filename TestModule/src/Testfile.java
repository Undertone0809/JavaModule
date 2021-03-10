import com.sun.source.tree.Tree;

import java.util.*;

public class Testfile{
    public static void main(String[] args) {
        LinkedList<Integer> list =new LinkedList<>();
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n=s.nextInt();
            System.out.println(list.size());
        }
    }
}