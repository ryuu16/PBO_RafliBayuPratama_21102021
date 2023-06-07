package com.Rafli.PBO.Pertemuan7;

import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Registration extends JFrame {
    private JTextField TxtName;
    private JTextField TxtNIM;
    private JComboBox comboBox1;
    private JTextField TxtTelp;
    private JRadioButton lakiLakiRadioButton;
    private JRadioButton perempuanRadioButton;
    private JTextArea TxtAreaAlamat;
    private JButton saveButton;
    private JButton clearButton;
    private JPanel mainPanel;

    public Registration() {
        super ("Formulir Registrasi");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(800,600);
    }

    public static void main(String[] args) {
        JFrame mainFrame = new Registration();
        mainFrame.setVisible(true);
    }

}
