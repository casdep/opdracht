/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trio.opdracht;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javafx.scene.control.ComboBox;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Cas
 */
class TrioPanel extends JFrame implements ListSelectionListener {
    Vector<String> menuList = new Vector<>();
    JList<String> menu = new JList<>(menuList);
    
    JPanel content = new JPanel(new CardLayout());
    
    private JPanel panelCenter, panelSouth, panelWest;
    private JLabel centerLabel, informatieLabel, labelSouth, labelSouth2;
    private javax.swing.JComboBox<String> comboBox;
    private JButton overviewOneButton, overviewTwoButton, overviewThreeButton, overviewFourButton;        
        
        TrioPanel(){
        //put menu on left, content in middle
        add(menu, BorderLayout.WEST);
        add(content, BorderLayout.CENTER);
        menu.addListSelectionListener(this);

        //add multiple cards
        addMenu(new Menu1("First Item", "First Item Text"));
        addMenu(new Menu2("Third Item", "Second Item Text"));


        //set content to first item
        ((CardLayout) content.getLayout()).show(content, "First Item");
    }

    private void addMenu(Menu c){
        menuList.add(c.name);
        content.add(c, c.name);
    }
    
    public void valueChanged(ListSelectionEvent e) {
        if(e.getValueIsAdjusting()) return;

        //set card layout from JList menu
        ((CardLayout) content.getLayout()).show(content, menu.getSelectedValue());
    }
        
        panelCenter = new JPanel();
        panelSouth = new JPanel();
        panelWest = new JPanel();

        
        panelCenter.setLayout(new GridLayout(2,1));
        panelSouth.setLayout(new BoxLayout(panelSouth, BoxLayout.X_AXIS));
        panelWest.setLayout(new BoxLayout(panelWest, BoxLayout.Y_AXIS));
        
        overviewOneButton = new JButton("Overview 1");
        overviewTwoButton = new JButton("Overview 2");
        overviewThreeButton = new JButton("Overview 3");
        overviewFourButton = new JButton("Overview 4");
        
        centerLabel = new JLabel ("Selecteer serie");
        informatieLabel = new JLabel ("Gemiddeld % bekenen per aflevering");
        
        labelSouth =  new JLabel ("Netflix statistix, ifnromatica 2016, 23IVT1C2");
        labelSouth2 =  new JLabel ("Cas de Pender, Max Koning, Kevin van der Kaa");
        
        
        add(panelWest, BorderLayout.WEST);
        add(panelCenter, BorderLayout.CENTER);
        add(panelSouth, BorderLayout.SOUTH);
        
        
        panelCenter.add(centerLabel);
        panelCenter.add(informatieLabel);
        
        panelSouth.add(labelSouth);
        panelSouth.add(labelSouth2);
        
        panelSouth.add(labelSouth);
        panelSouth.add(Box.createHorizontalGlue());
        panelSouth.add(labelSouth2);
        
        panelWest.add(overviewOneButton);
        panelWest.add(overviewTwoButton);
        panelWest.add(overviewThreeButton);
        panelWest.add(overviewFourButton);
   }
}
**/