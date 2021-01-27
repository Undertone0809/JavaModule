/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/19 21:17
 * @version: 1.0$
 */

import java.awt.*;
public class AWTTest03 {
    public static void main(String[] args) {
        Frame frame =new Frame("FlowLayoutTest");
        //通过setLayout方法设置容器的布局管理器
        //三个参数分别为对齐方式、水平间距、垂直间距（单位：像素）
        frame.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

        for (int i = 0; i < 100; i++) {
            frame.add(new Button("Button"+i));
        }
        frame.setBounds(100,100,500,500);
        frame.setVisible(true);
    }
}
