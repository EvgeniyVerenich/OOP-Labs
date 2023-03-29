package OOPLabs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Window extends JFrame {

    private Vector vector, vector1;
    private int lambda;

    public Window(){
        JFrame frame = new JFrame();

        JButton buttonPlus = new JButton("+");
        JButton buttonMinus = new JButton("-");
        JButton buttonMultiply = new JButton("*");
        JButton buttonDivision = new JButton("/");
        JButton buttonLambdaMultiply = new JButton("*lambda");
        JButton buttonLambdaDivision = new JButton("/lambda");
        JButton answerButton = new JButton("save");
        JButton getIndexButton = new JButton("Index");

        JTextField field = new JTextField();
        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField();


        JLabel label = new JLabel();
        label.setBounds(200, 190,100,40);

        field.setBounds(100, 100, 400, 40);
        field1.setBounds(100, 150,400,40);
        field2.setBounds(300,200,100,40);

        buttonPlus.setBounds(0, 300, 100, 40);
        buttonMinus.setBounds(100, 300, 100, 40);
        buttonMultiply.setBounds(200, 300, 100, 40);
        buttonDivision.setBounds(300, 300, 100, 40);
        buttonLambdaMultiply.setBounds(400, 300, 100, 40);
        buttonLambdaDivision.setBounds(500, 300, 100, 40);
        answerButton.setBounds(100, 190, 100, 40);
        getIndexButton.setBounds(600, 300, 100, 40);

        answerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] stringsField = field.getText().split(",");
                String[] stringsField1 = field1.getText().split(",");

                int[] arrayField = new int[stringsField.length];
                int[] arrayField1 = new int[stringsField1.length];

                try {
                    for (int i = 0; i < stringsField.length; i++) {
                        arrayField[i] = Integer.parseInt(stringsField[i]);
                        arrayField1[i] = Integer.parseInt(stringsField1[i]);
                    }

                    vector = new Vector(arrayField);
                    vector1 = new Vector(arrayField1);
                    lambda = Integer.parseInt(stringsField[0]);
                }catch (Exception exception){
                    field.setText(null);
                    field1.setText(null);
                }
            }
        });

        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(Arrays.toString(vector.sum(vector1)));
            }
        });

        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(Arrays.toString(vector.difference(vector1)));
            }
        });

        buttonMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(Arrays.toString(vector.multiply(vector1)));
            }
        });

        buttonDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(Arrays.toString(vector.division(vector1)));
            }
        });

        buttonLambdaMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(Arrays.toString(vector.lambdaMultiply(Integer.parseInt(field2.getText()))));
            }
        });

        buttonLambdaDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                label.setText(Arrays.toString(vector.lambdaDivision(Integer.parseInt(field2.getText()))));
            }
        });

        getIndexButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(String.valueOf(vector.getIndex(Integer.parseInt(field2.getText()))));
            }
        });



        frame.add(field2);
        frame.add(buttonPlus);
        frame.add(buttonMinus);
        frame.add(buttonMultiply);
        frame.add(buttonDivision);
        frame.add(buttonLambdaMultiply);
        frame.add(buttonLambdaDivision);
        frame.add(answerButton);
        frame.add(getIndexButton);
        frame.add(field);
        frame.add(field1);
        frame.add(label);
        frame.setSize(750, 600);
        frame.setLayout(null);
        frame.setVisible(true);

    }

}
