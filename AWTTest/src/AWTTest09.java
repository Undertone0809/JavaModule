/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/21 18:50
 * @version: 1.0$
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTTest09 {
    Frame frame =new Frame("FileDialogTest");
    //创建两个FileDialog对象
    FileDialog f1= new FileDialog(frame,"选择要打开的文件",FileDialog.LOAD);
    FileDialog f2= new FileDialog(frame,"选择要保存的文件",FileDialog.SAVE);

    //创建Button
    Button b1 =new Button("打开文件");
    Button b2 =new Button("保存文件");

    void init(){
        //添加行为
        //匿名内部类
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.setVisible(true);
                //获取选择的路径及文件
                String dic =f1.getDirectory();
                String file=f1.getFile();
                System.out.println("保存的文件路径为"+dic);
                System.out.println("保存的文件名称为"+file);
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f2.setVisible(true);
                //获取选择的路径及文件
                String dic =f2.getDirectory();
                String file=f2.getFile();
                System.out.println("保存的文件路径为"+dic);
                System.out.println("保存的文件名称为"+file);
            }
        });
        frame.add(b1,BorderLayout.NORTH);
        frame.add(b2,BorderLayout.SOUTH);
        frame.pack();
        frame.setLocation(600,300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new AWTTest09().init();
    }
}
