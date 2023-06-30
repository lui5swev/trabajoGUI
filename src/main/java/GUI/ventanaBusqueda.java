package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ventanaBusqueda extends JFrame{
    public ventanaBusqueda(){
        this.setTitle("Intranet");
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setSize(400, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("images/download.jpg");
        this.setIconImage(image.getImage());

        JLabel label = new JLabel("Busqueda de Estudiante");
        Font font = new Font("Calibri", 3, 20);
        label.setFont(font);
        this.getContentPane().add(label);
        label.setBounds(90, 40, 200, 20);

        JLabel labelNombre = new JLabel("Nombre:");
        this.getContentPane().add(labelNombre);
        labelNombre.setBounds(20, 100, 200, 20);
        JTextField inputNombre = new JTextField();
        this.getContentPane().add(inputNombre);
        inputNombre.setBounds(170, 100, 180, 20);


        JLabel labelCarrera = new JLabel("Carrera:");
        this.getContentPane().add(labelCarrera);
        labelCarrera.setBounds(20, 150, 200, 20);

        String[] carreras = {"ICI","ICM","ICF"};

        JComboBox<String> comboBox = new JComboBox<>(carreras);
        ActionListener comboBoxAction = e -> {
            System.out.println(comboBox.getSelectedItem());
        };
        comboBox.addActionListener(comboBoxAction);
        comboBox.setBounds(170,150,180,20);
        comboBox.setEditable(true);
        comboBox.setVisible(true);
        this.getContentPane().add(comboBox);


        ActionListener actionbuttonRegresar = e -> {
            this.dispose();
            ventanaMenuPrincipal ventanaMenuPrincipal = new ventanaMenuPrincipal();
        };
        JButton buttonRegresar = new JButton();
        buttonRegresar.setBounds(230, 500, 100,20 );
        buttonRegresar.addActionListener(actionbuttonRegresar);
        this.add(buttonRegresar);
        buttonRegresar.setText("Regresar");

        ActionListener actionbuttoBuscar = e -> System.out.println("button buscar");
        JButton buttonBuscar = new JButton();
        buttonBuscar.setBounds(70, 500, 100,20 );
        buttonBuscar.addActionListener(actionbuttoBuscar);
        this.add(buttonBuscar);
        buttonBuscar.setText("Buscar");
    }
}
