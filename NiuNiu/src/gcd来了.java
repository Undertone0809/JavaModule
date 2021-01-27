/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/24 21:08
 * @version: 1.0$
 */
import java.awt.event.ActionListener;
import java.awt.Window;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.applet.Applet;
import java.beans.beancontext.BeanContextChildSupport;
import java.lang.System;
import java.util.Random;
import java.util.concurrent.AbstractExecutorService;
import java.util.logging.XMLFormatter;
import java.util.concurrent.BlockingQueue;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.CharArrayReader;
import java.math.RoundingMode;
import java.security.AccessControlContext;
import java.time.Clock;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class gcd来了 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            long m =s.nextLong();
            long n =s.nextLong();
            System.out.println(gcd(m,n)+" "+lcm(m,n));
        }
    }
    public static long gcd(long a ,long b ){
        return b == 0 ? a:gcd(b,a%b);
    }
    public static long lcm(long a,long b){
        return a  / gcd(a,b) * b;//b一定要放在最后
    }
}
