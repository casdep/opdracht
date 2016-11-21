/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trio.opdracht;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javafx.scene.control.ComboBox;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Cas
 */
class TrioPaneel extends JPanel {
    private JPanel paneelCenter, paneelZuid, paneelWest;
    private ComboBox serie;
    private JButton overzicht1, overzicht2, overzicht3, overzicht4;
    public TrioPaneel() {
        paneelCenter = new JPanel();
        paneelZuid = new JPanel();
        paneelWest = new JPanel();
        
        setBackground(Color.RED);
        
        paneelCenter.setLayout(new GridLayout(1,4));
        paneelZuid.setLayout(new BoxLayout(paneelZuid, BoxLayout.X_AXIS));
        paneelWest.setLayout(new BoxLayout(paneelWest, BoxLayout.Y_AXIS));
        
        
        
        overzicht1 = new JButton(" Overzicht 1");
        overzicht2 = new JButton(" Overzicht 2");
        overzicht3 = new JButton(" Overzicht 3");
        overzicht4 = new JButton(" Overzicht 4");
        
        add(paneelCenter, BorderLayout.CENTER);
        add(paneelZuid, BorderLayout.SOUTH);
        add(paneelWest, BorderLayout.WEST);
        
        
        
        paneelWest.add(overzicht1);
        paneelWest.add(overzicht2);
        paneelWest.add(overzicht2);
        paneelWest.add(overzicht2);
   }
    
}
