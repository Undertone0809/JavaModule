/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/21 20:08
 * @version: 1.0$
 */
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTTest12 {
    Frame frame =new Frame("Text");



    void init(){
        //组装视图
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });


        frame.pack();
        frame.setBackground(Color.PINK);
        frame.setLocation(600,300);
        frame.setVisible(true);
    }



    public static void main(String[] args) {
        new AWTTest12().init();
    }
}
