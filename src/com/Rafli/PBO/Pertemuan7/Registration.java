package com.Rafli.PBO.Pertemuan7;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration extends JFrame {
    private JTextField TxtName;
    private JTextField TxtNIM;
    private JComboBox CBProdi;
    private JTextField TxtTelp;
    private JRadioButton lakiLakiRadioButton;
    private JRadioButton perempuanRadioButton;
    private JTextArea TxtAreaAlamat;
    private JButton saveButton;
    private JButton clearButton;
    private JPanel mainPanel;
    private ButtonGroup JK;

    public Registration() {
        super ("Formulir Registrasi");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(800,600);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TxtName.setText(" ");
                TxtNIM.setText(" ");
                TxtTelp.setText(" ");
                TxtAreaAlamat.setText(" ");
                CBProdi.setSelectedIndex(0);
//                lakiLakiRadioButton.setSelected(false);
//                perempuanRadioButton.setSelected(false);
                JK.clearSelection();
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = TxtName.getText();
                String NIM = TxtNIM.getText();
                String prodi = (String) CBProdi.getSelectedItem();
                String telp = TxtTelp.getText();
                String alamat = TxtAreaAlamat.getText();
                String JK;
                if (lakiLakiRadioButton.isSelected()) {
                    JK = "Laki-Laki";
                } else if(perempuanRadioButton.isSelected()) {
                    JK = "Perempuan";
                } else {
                    JK = "Tidak Diketahui";
                }
                //menampilkan msgbox
                JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            }
        });
    }

    public static void main(String[] args) {
        JFrame mainFrame = new Registration();
        mainFrame.setVisible(true);
    }

}
