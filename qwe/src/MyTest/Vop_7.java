package MyTest;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static MyTest.Frame.eight;
import static MyTest.Frame.getBall;
import static MyTest.Frame.getFrame;


public class Vop_7 extends AbstractQuestion_2 {
    public Vop_7() {
        super(7, "На рисунке изображен :", "Диапроектор", "графопроектор", "эпископ", "мультимедиа-проектор");

        remove(icon);
        icon = createIcon(new ImageIcon("C:\\Users\\fredy\\Desktop\\Курсовая ТСО\\14.gif"));
        add(icon);
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (!option.isSelected() && !option2.isSelected() && !option3.isSelected() && !option4.isSelected()) {
                    JOptionPane.showMessageDialog(Vop_7.this, "Сделайте выбор");} else {

                    if (option2.isSelected()) {

                        getBall(3);
                    }


                    getFrame(eight);


                }
            }

        });

    }
}
