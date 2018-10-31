import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Menu extends JFrame
{

    private JLabel item;

    public Menu()
    {
        super("My First Gui");
        setLayout(new FlowLayout());
        item = new JLabel("First Gui");
        item.setToolTipText(getName());
        add(item);
    }

}
