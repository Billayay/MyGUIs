import javax.swing.JOptionPane;
import java.awt.FlowLayout;

public class Menu
{

    public static void main(String[] args)
    {
        firstGui();
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
