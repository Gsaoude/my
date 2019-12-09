
import java.awt.Frame;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.WindowConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 650-079385
 */
public class Hangman
{
    String name = "";
    
    public String name()
    {
        int n = -1;
        String name = "";
        JOptionPane inpOption = new JOptionPane();
        while(n < 0)
        {
            String message = inpOption.showInputDialog(new JFrame(), "Please enter your name: ", "Your Name", JOptionPane.DEFAULT_OPTION); 
            if (message.trim().length() > 0)
            {
                n++;
                name = message;
            }
        }
        return name;
    }
}