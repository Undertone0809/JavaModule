/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/20 23:17
 * @version: 1.0$
 */
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
public class     AWTTest07 {
    Frame frame =new Frame("这里测试基本组件");
    //多行文本域
    //五行，20列的长度
    TextArea ta =new TextArea(5,20);

    //下拉选择框
    Choice colorChooser =new Choice();

    //单选组
    CheckboxGroup cbg =new CheckboxGroup();
    Checkbox male  =new Checkbox("男",cbg,true);
    Checkbox female =new Checkbox("女",cbg,true);
    //选择框
    Checkbox isMarried =new Checkbox("是否已婚");

    //单行文本域
    TextField tf =new TextField(20);
    Button ok =new Button("确认");

    List colorlist =new List(6,true);


    public void init(){
        //组装界面
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
        frame.setLocation(600,300);
        //组装底部
        Box bBox =Box.createHorizontalBox();
        bBox.add(tf);
        bBox.add(ok);
        frame.add(bBox,BorderLayout.SOUTH);
        //匿名内部类
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

        //为list添加内容
        colorlist.add("red");
        colorlist.add("green");
        colorlist.add("blue");
        colorChooser.add("red");
        colorChooser.add("green");
        colorChooser.add("blue");


        //组装上部
        Box aBox =Box.createHorizontalBox();
        //上左
        Box Box1 =Box.createVerticalBox();
        Box1.add(ta);
        Box Box12 =Box.createHorizontalBox();
        Box12.add(colorChooser);
        Box12.add(male);
        Box12.add(female);
        Box12.add(isMarried);
        Box1.add(Box12);
        aBox.add(Box1);
        aBox.add(colorlist);

        frame.add(aBox);
        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new AWTTest07().init();
    }

}
