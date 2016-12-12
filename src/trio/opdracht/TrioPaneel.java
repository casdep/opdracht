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
class TrioPaneel extends JPanel {
    private JPanel panelCenter, panelSouth, panelWest;
    private JLabel centerLabel, informatieLabel, labelSouth;
    private ComboBox comboboxSerie;
    private JButton overviewOneButton, overviewTwoButton, overviewThreeButton, overviewFourButton;
    private ActionListener overviewOneHandler, overviewTwoHandler, overviewThreeHandler, overviewFourHandler;
    public TrioPaneel() {
        setLayout (new BorderLayout());
        
        panelCenter = new JPanel();
        panelSouth = new JPanel();
        panelWest = new JPanel();

        
        panelCenter.setLayout(new GridLayout(2,1));
        panelSouth.setLayout(new BoxLayout(panelSouth, BoxLayout.X_AXIS));
        panelWest.setLayout(new BoxLayout(panelWest, BoxLayout.Y_AXIS));
        
        overviewOneHandler = new overviewOneHandler();
        overviewTwoHandler = new overviewTwoHandler();
        overviewThreeHandler = new overviewThreeHandler();
        overviewFourHandler = new overviewFourHandler();
        
        overviewOneButton = new JButton("Overview 1");
            overviewOneButton.addActionListener(overviewOneHandler);
        overviewTwoButton = new JButton("Overview 2");
            overviewTwoButton.addActionListener ( overviewTwoHandler);
        overviewThreeButton = new JButton("Overview 3");
            overviewThreeButton.addActionListener ( overviewThreeHandler);
        overviewFourButton = new JButton("Overview 4");
            overviewFourButton.addActionListener ( overviewFourHandler);
        
        centerLabel = new JLabel ("Selecteer serie");
        informatieLabel = new JLabel ("Gemiddeld % bekenen per aflevering");
        
        labelSouth =  new JLabel ("Netflix statistix, ifnromatica 20One6, 2ThreeIVTOneC2, Cas de Pender, Max Koning, Kevin van der Kaa");
        
        add(panelWest, BorderLayout.WEST);
        add(panelCenter, BorderLayout.CENTER);
        add(panelSouth, BorderLayout.SOUTH);
        
        
        panelCenter.add(centerLabel);
        
        panelCenter.add(informatieLabel);
        
        panelSouth.add(labelSouth);
        
        panelWest.add(overviewOneButton);
        panelWest.add(overviewTwoButton);
        panelWest.add(overviewThreeButton);
        panelWest.add(overviewFourButton);
   }
class overviewOneHandler implements ActionListener{
public void actionPerformed( ActionEvent e ){
new OverviewTwo();
       }
    }        
class overviewTwoHandler implements ActionListener{
public void actionPerformed( ActionEvent e ){
new OverviewTwo();
       }
    } 
class overviewThreeHandler implements ActionListener{
public void actionPerformed( ActionEvent e ){
new OverviewTwo();
       }
    } 
class overviewFourHandler implements ActionListener{
public void actionPerformed( ActionEvent e ){
new OverviewTwo();
       }
    } 
}
