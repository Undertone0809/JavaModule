/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/21 20:25
 * @version: 1.0$
 */
import jdk.dynalink.NamedOperation;

import javax.management.MalformedObjectNameException;
import java.awt.*;
import java.awt.event.*;

public class AWTTest13 {
    //成员变量
    Frame frame =new Frame("MenuTest");
    TextArea t1 =new TextArea(6,40);
    //创建菜单条
    MenuBar m1 =new MenuBar();

    //创建菜单组件
    Menu fileMenu =new Menu("文件");
    Menu editMenu =new Menu("编辑");
    Menu formatMenu =new Menu("格式");
    Menu SomeElse =new Menu("其他");

    //菜单项组件
    //1
    MenuItem auto =new MenuItem("自动换行");
    MenuItem paste=new MenuItem("粘贴");

    //3
    MenuItem Project1=new MenuItem("项目1");
    MenuItem Project2=new MenuItem("项目2");

    //在内部创建了一个快捷键
    //通过c+s+Q可以快速完成该操作
    //2
    MenuItem comment =new MenuItem("注释",new MenuShortcut(KeyEvent.VK_Q,true));
    MenuItem cancelMenu =new MenuItem("取消注释");
    void init(){
        //组装视图
        m1.add(fileMenu);
        m1.add(editMenu);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

        comment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.append("你点击了"+e.getActionCommand());
            }
        });
        paste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.append("你点击了"+e.getActionCommand());
            }
        });
        Project1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AWTTest07().init();
            }
        });
        Project2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AWTTest11().init();
            }
        });
        formatMenu.add(comment);
        formatMenu.add(cancelMenu);
        editMenu.add(auto);
        editMenu.add(paste);
        //formatMenu同时作为一个菜单
        editMenu.add(formatMenu);
        m1.add(editMenu);
        m1.add(fileMenu);
        m1.add(SomeElse);
        SomeElse.add(Project1);
        SomeElse.add(Project2);

        //传入菜单采用特殊的方法
        frame.setMenuBar(m1);
        frame.add(t1);
        frame.pack();
        frame.setBackground(Color.PINK);
        frame.setLocation(600,300);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new AWTTest13().init();
    }
}
