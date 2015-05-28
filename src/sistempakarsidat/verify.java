/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistempakarsidat;
 import java.awt.*;
 import java.util.*;
 import java.awt.event.*;
 import javax.swing.*;
/**
 *
 * @author Ardhipc
 */
public class verify extends JFrame{
    public verify() {
         JTextField tf1 = new JTextField ("Type \"pass\" here");
         getContentPane().add (tf1, BorderLayout.NORTH);
         tf1.setInputVerifier(new PassVerifier());

         JTextField tf2 = new JTextField ("TextField2");
         getContentPane().add (tf2, BorderLayout.SOUTH);

         WindowListener l = new WindowAdapter() {
             public void windowClosing(WindowEvent e) {
                 System.exit(0);
             }
         };
         addWindowListener(l);
     }

     class PassVerifier extends InputVerifier {
         public boolean verify(JComponent input) {
             JTextField tf = (JTextField) input;
             return "pass".equals(tf.getText());
         }
     }

     
}
