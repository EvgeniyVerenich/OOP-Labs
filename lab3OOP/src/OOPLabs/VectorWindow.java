package OOPLabs;

import javax.swing.*;

public class VectorWindow extends JFrame {

    public VectorWindow(){
        setTitle("Vector");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocation(400,400);
        JButton plus = new JButton("+");
        add(plus);
        setVisible(true);
    }

}
