/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/21 19:55
 * @version: 1.0$
 */
import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTTest11 {
    Frame frame =new Frame("事件监听器测试");
    Panel p1 =new Panel();
    Choice c1 =new Choice();
    TextField t1 =new TextField("TestField");


    void init(){
        //组装视图
        c1.add("A");
        c1.add("B");
        c1.add("C");
        p1.add(c1);
        p1.add(t1);

        //方法2
        //添加文本监听器
        t1.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(TextEvent e) {
                System.out.println("方法二执行了");
                System.out.println(t1.getText());
            }
        });
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
        frame.add(p1);
        frame.pack();
        frame.setBackground(Color.PINK);
        frame.setLocation(600,300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new AWTTest11().init();
    }
}
