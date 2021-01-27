/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/21 19:26
 * @version: 1.0$
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTTest10 {
    Frame frame = new Frame("测试事件处理机制");

    //创建一个按钮
    Button b1 =new Button("确定");
    Button b2 =new Button("Test");

    //创建一个单行文本域
    TextField text =new TextField("点击确定");




    void init(){
        //组装视图
        //监听器
        MyListener myListener =new MyListener();



        //注册监听
        b1.addActionListener(myListener);

        //创建Panel组装Button
        Panel p1 =new Panel();
        p1.add(b1);
        p1.add(b2);
        frame.add(p1);
        frame.add(text,BorderLayout.NORTH);
        frame.pack();
        frame.setLocation(600,300);
        frame.setVisible(true);
    }

    //创建监听器
    //定义内部类
    private class MyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            text.setText("HelloWorld");
            System.out.println("确定按钮被点击了");
            new AWTTest07().init();
        }
    }


    public static void main(String[] args) {
        new AWTTest10().init();
    }
}
