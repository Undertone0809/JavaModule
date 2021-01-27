/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/19 21:29
 * @version: 1.0$
 */
import java.awt.*;
public class AWTTest04 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setBounds(100,100,500,500);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout(100,100));
        Panel panel = new Panel();
        panel.add(new TextField("this is a test"));
        panel.add(new Button("true"));
        frame.add(panel,BorderLayout.CENTER);
        frame.add(new Button("EAST"),BorderLayout.EAST);
        frame.add(new Button("WEST"),BorderLayout.WEST);
        frame.add(new Button("SOUTH"),BorderLayout.SOUTH);
        frame.add(new Button("NORTH"),BorderLayout.NORTH);
        frame.setBackground(Color.PINK);
    }
}