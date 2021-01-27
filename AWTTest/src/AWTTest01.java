/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/19 15:38
 * @version: 1.0$
 */

import java.awt.*;
public class AWTTest01 {
    public static void main(String[] args) {
        //创建一个窗口对象
        Frame frame =new Frame("测试panel");
        //指定窗口的位置和大小
        frame.setLocation(100,100);
        frame.setSize(500,500);
        //可以直接使用setBounds方法
        //设置窗口对象可见
        frame.setVisible(true);
        //创建一个panel
        Panel panel =new Panel();
        //往panel中添加组件
        panel.add(new TextField("这是一个文本测试"));
        panel.add(new Button("测试按钮"));
        frame.add(panel);
    }
}
