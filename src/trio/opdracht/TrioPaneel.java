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
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Cas
 */
class TrioPaneel extends JPanel {
    private JPanel paneelCenter, paneelZuid, paneelWest;
    private JLabel centerLabel, zuidLabel;
    private ComboBox serie;
    private JButton overzicht1, overzicht2, overzicht3, overzicht4;
    public TrioPaneel() {
        setLayout (new BorderLayout());
        setBackground(Color.GREEN);
        
        paneelCenter = new JPanel();
        paneelZuid = new JPanel();
        paneelWest = new JPanel();

        
        paneelCenter.setLayout(new GridLayout(1,4));
        paneelZuid.setLayout(new BoxLayout(paneelZuid, BoxLayout.X_AXIS));
        paneelWest.setLayout(new BoxLayout(paneelWest, BoxLayout.Y_AXIS));
        
        
        
        overzicht1 = new JButton(" Overzicht 1");
        overzicht2 = new JButton(" Overzicht 2");
        overzicht3 = new JButton(" Overzicht 3");
        overzicht4 = new JButton(" Overzicht 4");
        
        centerLabel = new JLabel (" Extra test voor Center paneel");
        zuidLabel =  new JLabel (" Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim.")
        
        add(paneelWest, BorderLayout.WEST);
        add(paneelCenter, BorderLayout.CENTER);
        add(paneelZuid, BorderLayout.SOUTH);
        
        
        paneelCenter.add(centerLabel);
        paneelZuid.add(zuidLabel);
        
        paneelWest.add(overzicht1);
        paneelWest.add(overzicht2);
        paneelWest.add(overzicht3);
        paneelWest.add(overzicht4);
   }
    
}
