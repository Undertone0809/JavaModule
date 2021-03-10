/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/9 21:48
 * @version: 1.0$
 */
package 集合;

import java.util.LinkedList;

/**
 * 因为LinkedList的底层为双向链表，但同时继承了List，因此具有很多方便使用的特性供使用
 * 该程序介绍一下LinkedList双向链表的实现以及一些扩展的用法
 */
public class 双向链表 {
    public static int count=1;
    public static void main(String[] args) {

        LinkedList<Integer> list =new LinkedList<>();
        //链表初始化，先赋初始值
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        /**
         * 查询头部元素
         * 1.peek()
         *
         * 返回结果：
         * 0
         * 1.当前list中的元素为:
         * 0 1 2 3 4 5 6 7 8 9
         * --------------------------------------------
         * 2.element()
         *
         * 返回结果：
         * 2.当前list中的元素为:
         * 0 1 2 3 4 5 6 7 8 9
         * --------------------------------------------
         * 3.getFirst()
         *
         * 返回结果：
         * 0
         * 3.当前list中的元素为:
         * 0 1 2 3 4 5 6 7 8 9
         * --------------------------------------------
         *
         */
        System.out.println(list.peek());
        printList(list);

        System.out.println(list.element());
        printList(list);

        System.out.println(list.getFirst());
        printList(list);

        /**
         * 删除头部元素
         * 4.remove()（无参）删除头部元素，返回头部被删除的元素
         *
         * 返回结果
         * 0
         * 4.当前list中的元素为:
         * 1 2 3 4 5 6 7 8 9
         * --------------------------------------------
         * 5.removeFirst()删除头部元素,返回头部被删除的元素
         *
         * 返回结果:
         * 1
         * 5.当前list中的元素为:
         * 2 3 4 5 6 7 8 9
         * --------------------------------------------
         *
         */
        System.out.println(list.remove());
        printList(list);

        System.out.println(list.removeFirst());
        printList(list);

        /**
         * 查询尾部元素
         *
         * 6.getLast()
         *
         * 返回结果：
         * 9
         * 6.当前list中的元素为:
         * 2 3 4 5 6 7 8 9
         * --------------------------------------------
         * 7.peekFirst()
         *
         * 返回结果:
         * 9
         * 7.当前list中的元素为:
         * 2 3 4 5 6 7 8 9
         * --------------------------------------------
         */
        System.out.println(list.getLast());
        printList(list);

        System.out.println(list.peekLast());
        printList(list);

        /**
         * 添加尾部元素
         * 8.add()
         *
         * 返回结果：
         * 8.当前list中的元素为:
         * 2 3 4 5 6 7 8 9 100
         * --------------------------------------------
         * 9.offer()
         *
         * 返回结果：
         * 9.当前list中的元素为:
         * 2 3 4 5 6 7 8 9 100 200
         * --------------------------------------------
         */
        list.add(100);
        printList(list);

        list.offer(200);
        printList(list);



    }
    public static void printList(LinkedList<Integer> list){
        System.out.println(count+".当前list中的元素为:");
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
        count++;
        System.out.println();
        System.out.println("--------------------------------------------");
    }

}
