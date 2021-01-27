/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/22 12:43
 * @version: 1.0$
 */
import java.awt.*;
import java.awt.event.*;

public class AWTTest14 {
    Frame frame =new Frame("PopupMenuTest");
    PopupMenu p1 =new PopupMenu();
    MenuItem m1 =new MenuItem("AList");
    MenuItem m2 =new MenuItem("BList");
    MenuItem m3 =new MenuItem("CList");
    TextArea t1 =new TextArea(6,30);
    Panel panel =new Panel();

    void init(){
        //组装
        panel.add(p1);
        p1.add(m1);
        p1.add(m2);
        p1.add(m3);
        m1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.append(e.getActionCommand());
            }
        });
        m2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.append(e.getActionCommand());
            }
        });
        m3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.append(e.getActionCommand());
                new AWTTest13().init();
            }
        });
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                //显示PopupMenu
                p1.show(panel,e.getX(), e.getY());
            }
        });
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                System.out.println("mouseReleased 被执行了");
                }
        });
        //添加关闭界面（匿名内部类）
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

        frame.add(panel,BorderLayout.NORTH);
        frame.add(t1,BorderLayout.SOUTH);
        frame.setLocation(600,300);
        frame.pack();
        frame.setBackground(Color.PINK);
        frame.setVisible(true);
    }

    private class Mylistener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public static void main(String[] args) {
        new AWTTest14().init();
    }
}
