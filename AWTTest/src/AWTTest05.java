/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/20 21:07
 * @version: 1.0$
 */
import java.awt.*;
public class AWTTest05 {
    public static void main(String[] args) {
        Frame frame = new Frame("计算器");
        frame.setLocation(600,300);
        Panel panel1 = new Panel();
        panel1.add(new TextField("请输入数字",30));
        frame.add(panel1,BorderLayout.NORTH);
       // frame.setBounds(100,100,500,500);
        frame.setVisible(true);
        Panel panel2 = new Panel();
        panel2.setLayout(new GridLayout(3,5,4,4));
        for (int i = 0; i < 10; i++) {
          panel2.add(new Button(String.valueOf(i)));
        }
        panel2.add(new Button("+"));
        panel2.add(new Button("-"));
        panel2.add(new Button("*"));
        panel2.add(new Button("/"));
        panel2.add(new Button("="));
        frame.add(panel2);
        frame.setResizable(false);
        frame.pack();
    }
}
