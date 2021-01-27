/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/20 21:58
 * @version: 1.0$
 */
import javax.swing.*;
import java.awt.*;
public class AWTTest06 {
    public static void main(String[] args) {
        Frame frame = new Frame("Title");
        frame.setLocation(600,300);
        //frame.setResizable(false);
        frame.setVisible(true);
        //CODE AREA
        //使用Box容器来操作
        Box box1=Box.createHorizontalBox();//水平
        Box box2=Box.createVerticalBox();//垂直
        for (int i = 0; i < 2; i++) {
            box1.add(new Button(i+""));
            if(i ==0){
                box1.add(Box.createHorizontalGlue());//分隔左右部分，随着拉伸而变换大小
                box1.add(Box.createHorizontalStrut(30));//添加间距
            }
        }
        for (int i = 0; i < 2; i++) {
            box2.add(new Button(i+""));
            box2.add(Box.createVerticalGlue());//分隔垂直部分，随着拉伸而变换大小
            box2.add(Box.createVerticalStrut(30));//添加垂直间距
        }
        frame.add(box1,BorderLayout.NORTH);
        frame.add(box2);
        frame.pack();
    }
}
