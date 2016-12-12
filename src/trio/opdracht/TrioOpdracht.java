package trio.opdracht;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Cas
 */
public class TrioOpdracht extends JFrame{
    public static void main(String[] args) {
        JFrame frame = new TrioOpdracht();
        frame.setSize (750,600);
        frame.setLocation(200,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Trio opdacht, Netflix Statistix");
        frame.setContentPane( new TrioPaneel());
        frame.setVisible(true);
    }
}