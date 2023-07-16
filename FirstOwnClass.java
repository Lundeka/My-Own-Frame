//backhend
package za.ac.tut.ui;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class FirstOwnClass extends JFrame{

    public FirstOwnClass() throws HeadlessException {
   
    setTitle("Aaliyah Nxumalo");
    setSize(200, 250);
    setDefaultLookAndFeelDecorated(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setResizable(true);
    setForeground(Color.RED);
    setVisible(true);
    
    }
}
