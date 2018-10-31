import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Menu extends JFrame
{

    
    private JLabel item;
    private JTextField text1;
    private JTextField text2;
    private JTextField text3;
    private JPasswordField pass;
    

    public Menu()
    {
        super("My First Gui");
        
        //setting a layout
        setLayout(new FlowLayout());
        item = new JLabel("First Gui");
        item.setToolTipText(getName());
        add(item);
    }

}
