package GUI;

import Objetos.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ventanaMenuPrincipal extends JFrame {

    public ArrayList<Carrera> listaCarreras= new ArrayList<>();
    public ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

    public ventanaMenuPrincipal() {
        //CrearVenta
        this.setTitle("Intranet");
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setSize(400, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("images/download.jpg");
        this.setIconImage(image.getImage());

        JLabel label = new JLabel("Intranet sUfro");
        Font font = new Font("Calibri", 3, 20);
        label.setFont(font);
        this.getContentPane().add(label);
        label.setBounds(130, 40, 200, 20);

        //button1
        ActionListener actionbutton1 = e -> {
            this.dispose();
            ventanaRegistroCarrera ventanaRegistroCarrera = new ventanaRegistroCarrera(this.listaCarreras) ;
        };
        JButton button1 = new JButton();
        button1.setBounds(90, 140, 200,50 );
        button1.addActionListener(actionbutton1);
        this.add(button1);
        button1.setText("Registrar carrera");

        //button2
        ActionListener actionbutton2 = e -> {
            this.dispose();
            ventanaRegistroEstudiantes ventanaRegistroEstudiantes = new ventanaRegistroEstudiantes(this.listaEstudiantes, this.listaCarreras);
        };
        JButton button2 = new JButton();
        button2.setBounds(90, 210, 200,50 );
        button2.addActionListener(actionbutton2);
        this.add(button2);
        button2.setText("Registrar estudiante");

        //button3
        ActionListener actionbutton3 = e -> {
            this.dispose();
            ventanaBusqueda ventanaBusqueda = new ventanaBusqueda();
        };
        JButton button3 = new JButton();
        button3.setBounds(90, 280, 200,50 );
        button3.addActionListener(actionbutton3);
        this.add(button3);
        button3.setText("Buscar estudiante");

        //buttonSalir
        ActionListener salirButton = e -> System.exit(0);;
        JButton buttonSalir = new JButton();
        buttonSalir.setBounds(160, 450, 70,30 );
        buttonSalir.addActionListener(salirButton);
        this.add(buttonSalir);
        buttonSalir.setText("Salir");

    }
}

