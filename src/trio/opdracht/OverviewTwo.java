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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.control.ComboBox;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Cas
 */
class OverviewTwo extends JPanel {
    private JPanel panelCenter, panelSouth, panelWest;
    private JLabel centerLabel, informatieLabel, labelSouth;
    private ComboBox comboboxSerie;
    private JButton overview1Knop, overview2Knop, overview3Knop, overview4Knop;
    private ActionListener overview1Handler, overview2Handler, overview3Handler, overview4Handler;
    public OverviewTwo() {
        setLayout (new BorderLayout());
        
        panelCenter = new JPanel();
        panelSouth = new JPanel();
        panelWest = new JPanel();

        
        panelCenter.setLayout(new GridLayout(2,1));
        panelSouth.setLayout(new BoxLayout(panelSouth, BoxLayout.X_AXIS));
        panelWest.setLayout(new BoxLayout(panelWest, BoxLayout.Y_AXIS));
        
        overview2Handler = new overview2Handler();
        
        overview1Knop = new JButton("Overview 1");
        overview2Knop = new JButton("Overview 2");
            overview2Knop.addActionListener ( overview1Handler);
        overview3Knop = new JButton("Overview 3");
        overview4Knop = new JButton("Overview 4");
        
        centerLabel = new JLabel ("Selecteer serie");
        informatieLabel = new JLabel ("IWQERUIWEYRUIOQWYEURIY WEURY UWIQYERUIYOQWUEYRUOQWER");
        
        labelSouth =  new JLabel ("Netflix statistix, ifnromatica 2016, 23IVT1C2, Cas de Pender, Max Koning, Kevin van der Kaa");
        
        add(panelWest, BorderLayout.WEST);
        add(panelCenter, BorderLayout.CENTER);
        add(panelSouth, BorderLayout.SOUTH);
        
        
        panelCenter.add(centerLabel);
        
        panelCenter.add(informatieLabel);
        
        panelSouth.add(labelSouth);
        
        panelWest.add(overview1Knop);
        panelWest.add(overview2Knop);
        panelWest.add(overview3Knop);
        panelWest.add(overview4Knop);
    }
class overview2Handler implements ActionListener{
public void actionPerformed( ActionEvent e ){
new OverviewTwo();
        }   
    }
}