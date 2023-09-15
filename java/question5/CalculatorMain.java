/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question5;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author ashfa
 */
public class CalculatorMain extends JFrame implements ActionListener{
    private JTextField txt_field;
    private JButton[] num_button;
    private JButton[] optr_buttons;
    private JButton add_button, sub_button, mul_button, div_button;
    private JButton eq_button, clr_button, deci_button;
    private JPanel panel;
    
    private double n1,n2,result;
    private char operator;
    
    public CalculatorMain(){
        setTitle("Calculator");
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        txt_field = new JTextField();
        txt_field.setBounds(30, 40, 340, 30);
        txt_field.setFont(new Font("Arial", Font.PLAIN, 20));
        
        num_button = new JButton[10];
        for (int i = 0; i < 10; i++) {
            num_button[i] = new JButton(String.valueOf(i));
            num_button[i].setFont(new Font("Arial", Font.BOLD, 20));
            num_button[i].addActionListener(this);
    }
    optr_buttons= new JButton[4];
    add_button = new JButton("+");
        sub_button = new JButton("-");
        mul_button = new JButton("*");
        div_button = new JButton("/");
        optr_buttons[0] = add_button;
        optr_buttons[1] = sub_button;
        optr_buttons[2] = mul_button;
        optr_buttons[3] = div_button;
        
        eq_button = new JButton("=");
        deci_button = new JButton(".");
        clr_button = new JButton("C");
        
        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 10, 10));

        panel.add(txt_field);
        panel.add(clr_button);
        panel.add(deci_button);

        for (int i = 1; i <= 9; i++) {
            panel.add(num_button[i]);
        }

        panel.add(add_button);
        panel.add(num_button[0]);
        panel.add(eq_button);

        for (JButton optr_button : optr_buttons) {
            optr_button.setFont(new Font("Arial", Font.BOLD, 20));
            panel.add(optr_button);
        }

        panel.add(mul_button);
        panel.add(div_button);

        add(panel);
        setVisible(true);

        clr_button.addActionListener(this);
        eq_button.addActionListener(this);
        deci_button.addActionListener(this);

        for (JButton optr_button : optr_buttons) {
            optr_button.addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        for (int i = 0; i < 10; i++) {
            if (source == num_button[i]) {
                txt_field.setText(txt_field.getText() + i);
                return;
            }
        }

        if (source == deci_button) {
            if (!txt_field.getText().contains(".")) {
                txt_field.setText(txt_field.getText() + ".");
            }
            return;
        }

        if (source == clr_button) {
            txt_field.setText("");
            return;
        }

        if (source == add_button) {
            n1 = Double.parseDouble(txt_field.getText());
            operator = '+';
            txt_field.setText("");
        }
        if (source == sub_button) {
            n1 = Double.parseDouble(txt_field.getText());
            operator = '-';
            txt_field.setText("");
        }
        if (source == mul_button) {
            n1 = Double.parseDouble(txt_field.getText());
            operator = '*';
            txt_field.setText("");
        }
        if (source == div_button) {
            n1 = Double.parseDouble(txt_field.getText());
            operator = '/';
            txt_field.setText("");
        }

        if (source == eq_button) {
            n2 = Double.parseDouble(txt_field.getText());

            switch (operator) {
                case '+':
                    result = n1 + n2;
                    break;
                case '-':
                    result = n1 - n2;
                    break;
                case '*':
                    result = n1 * n2;
                    break;
                case '/':
                    result = n1 / n2;
                    break;
            }

            txt_field.setText(String.valueOf(result));
        }
    }

    public static void main(String[] args) {
        new CalculatorMain();
    }
}

   
    
