import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Launcher
{


    public static void main(String[] args)
    {
        Menu menu = new Menu();
        
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setSize(840, 100);
        menu.setVisible(true);
        
       // firstGui();
    }

    private static void firstGui()
    {
        String fn = JOptionPane.showInputDialog("Enter First Number");
        String fs = JOptionPane.showInputDialog("Enter Second Number");

        int num1 = Integer.parseInt(fn);
        int num2 = Integer.parseInt(fs);
        int sum = num1 + num2;

        JOptionPane.showMessageDialog(null, "The answer is " + sum, "Simple Adder", JOptionPane.PLAIN_MESSAGE);

    }
    
}
