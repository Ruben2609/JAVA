package Ventanasemergentes;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class CalculadoraBase extends JFrame implements ActionListener{

    private JTextField textField;

    private JPanel contentPane;

    public CalculadoraBase() {
        setTitle("calculadora");
        setSize(300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());


        textField = new JTextField();
        textField.setEditable(false);
        add(textField, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,4));

        String[] botones ={
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for(String boton : botones) {
            JButton button = new JButton(boton);
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        String valorBoton = ((JButton) e.getSource()).getText();
        textField.setText(textField.getText() + valorBoton);
        float num1;
        float num2;
        
        
           
    }
    


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculadoraBase calculadora = new CalculadoraBase();
            calculadora.setVisible(true);
        });
    }

}
