import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ：Zeeland
 * @date ：Created in 2021/2/4 12:14
 * @version: 1.0$
 */
public class 质数判断 {
    public static boolean isPrime(int x){
        if(x < 2)return false;
        if(x ==2)return true;
        for (int i = 2; i*i <= x; i++) {
            if(x % i == 0) return false;
        }
        return true;
    }



    //找到下一个质数
    public static int nextZhiShu(int num){
        for(int i=num+1;;i++){
            if(isPrime(i)) return i;
        }
    }

    //埃拉托斯特尼筛法
    /**
     * 埃拉托斯特尼筛法是一个快速获取小于数X的所有素数集合的算法。
     * 首先我们要明确，假设一个合数x能表示为两个数的乘积，他必定有一个小于等于sqrt(x)的因子，这可以用归谬证明法证明。如果两个因子都大于sqrt(x)，那么乘积大于x,这和假设矛盾。
     * 所以，判断一个数x是否是合数，只要依次除以2至sqrt(x)间的素数，判断是否整除即可。
     *
     * 埃拉托斯特尼筛法基于以下原理，给定一个素数n>1,kn是一个合数(k>1)，例如n=3,那么6,9,12,15…都是合数。
     *
     * 以100为例，我们先创建一个100个数字的数组。
     * 先使用最小的素数2，将所有2的倍数(除2本身)标记为合数。
     * 接下来2+1的数是3，此时检查3是不是素数，检查标记，发现没有被标记为合数(因为不是2的倍数)，所以再将所有3的倍数标记为合数。
     * 下一个数是4，发现他已经被标记为合数，所以他可以表示小于4的素数的乘积2*2，所以4的倍数必定含有因子2，所以所有4的倍数已经全部被标记过，直接跳过4。
     * 下一个数是5，没有被标记为合数，把所有小于100的5的倍数标记为合数
     * ………这样一直计算到sqrt(100)，即10。
     * 那么为什么不标记大于10的数例如11呢？因为所有的倍数已经被标记过了，例如22，33，44，55…分别有因子2，3，2，5，大于10的倍数，例如11*11已经超过max了，参见最上面的推论
     * 注意这里有一个优化点，很多书籍上或者教程上都没有说出来，只要标记大于本身的倍数就行了，例如5，只要标记5*5,5*6,5*7…为合数，因为5*2,5*3,5*4…已经被之前出现的数的倍数标记过了
     */


    //返回一个质数数组
    public static List<Integer> findPrimes(int max) {

        List<Integer> list = new ArrayList<>();
        //为了保持索引值与数值一致，看上去更清晰，先加一个0
        list.add(0);
        for (int i = 1; i <= max; i++) {
            list.add(i);
        }
        //1不是素数，去掉
        list.set(1, 0);

        int s = (int) Math.sqrt(max);
        //遍历小于sqrt(max)的数
        for (int i = 2; i <= s; i++) {
            //先判断是不是素数
            if (list.get(i) != 0) {
                //这里直接忽略了小于i的倍数，因为之前肯定已经出现过了。(这个优化很多别的地方都没有看到)
                int a = i * i;
                while (a <= max) {
                    list.set(a, 0);
                    a += i;
                }
            } 
        }

        return list.stream().filter(i -> i != 0).collect(Collectors.toList());
    }
}
