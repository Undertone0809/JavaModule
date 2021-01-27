/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/19 21:01
 * @version: 1.0$
 */
import java.awt.*;
public class AWTTest02 {
    public static void main(String[] args) {
        Frame frame =new Frame("ScrollPaneTestWindow");
        ScrollPane sp =new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);//总是显示
        sp.add(new TextField("This is a Test Window"));
        sp.add(new Button("True"));
        frame.add(sp);
        frame.setBounds(100,100,500,500);
        frame.setVisible(true);
    }
}
