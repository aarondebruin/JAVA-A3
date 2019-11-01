package moi;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class muis extends JFrame {

    private JLabel item1;

    public muis() {
        super("Test");
        setLayout(new FlowLayout());

        item1 = new JLabel("Dit is een test");
        item1 = setToolTipText("Hover test");
        add(item1);
    }
}
