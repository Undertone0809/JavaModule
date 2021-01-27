/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/27 22:30
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
public class 二分法 {



    /**
     *
     * @param arr：传入一个数组
     * @param key：需要查找的下标
     * @return
     */
    public static int search(int[] arr, int key){
        int start=0;
        int end=arr.length-1;
        while (start<=end)
        {
            int mid = (end+start)/2;
            if (key<arr[mid])
            {
                end=mid-1;
            }else if (key>arr[mid]){
                start=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
