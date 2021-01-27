/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/21 15:23
 * @version: 1.0$
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTTest08 {
    Frame frame =new Frame("对话框测试窗口");

    //创建对话框
    Dialog d1 =new Dialog(frame,"模式对话框",true);
    Dialog d2 =new Dialog(frame,"非模式对话框",false);

    //创建两个按钮
    Button b1 =new Button("模式对话框");
    Button b2 =new Button("非模式对话框");

    //给按钮添加点击后的行为


    void init(){
        //组装页面
        frame.setLocation(600,300);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d1.setVisible(true);
            }
        });

        //往d1中添加内容
        Label l1=new Label("没毛病");
        d1.setBounds(30,30,600,300);
        d1.add(l1,BorderLayout.EAST);


        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AWTTest07().init();
            }
        });

        frame.add(b1,BorderLayout.NORTH);
        frame.add(b2);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new AWTTest08().init();
    }
}
