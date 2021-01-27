import java.util.*;

public class Test001 {
    public static void main(String[] args) {
        String[]str={"abc","bcd","efg","aaa","aab"};
        Arrays.sort(str);
        for (int i=0;i <str.length;i++){
            System.out.println(str[i]);
        }
    }
}
