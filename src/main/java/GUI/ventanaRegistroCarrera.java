package GUI;

import Objetos.Carrera;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ventanaRegistroCarrera extends JFrame{

    private JTextField inputNombreCarrera;
    private JTextField inputCodigoCarrera;
    private JTextField inputCantidadSemestres;


    public ventanaRegistroCarrera(ArrayList<Carrera> listaCarreras) {
        this.setTitle("Intranet");
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setSize(400, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("images/download.jpg");
        this.setIconImage(image.getImage());

        JLabel label = new JLabel("Registro Carrera Universitaria");
        Font font = new Font("Calibri", 3, 20);
        label.setFont(font);
        this.getContentPane().add(label);
        label.setBounds(70, 40, 250, 20);

        JLabel nombreCarrera = new JLabel("Nombre Carrera:");
        this.getContentPane().add(nombreCarrera);
        nombreCarrera.setBounds(20, 100, 200, 20);
        this.inputNombreCarrera = new JTextField();
        this.getContentPane().add(this.inputNombreCarrera);
        this.inputNombreCarrera.setBounds(170, 100, 180, 20);

        JLabel codigoCarrera = new JLabel("Codigo Carrera:");
        this.getContentPane().add(codigoCarrera);
        codigoCarrera.setBounds(20, 150, 200, 20);
        this.inputCodigoCarrera = new JTextField();
        this.getContentPane().add(inputCodigoCarrera);
        inputCodigoCarrera.setBounds(170,150,180,20);

        JLabel cantidadSemestres = new JLabel("N° de Semestres:");
        this.getContentPane().add(cantidadSemestres);
        cantidadSemestres.setBounds(20, 200, 200, 20);
        this.inputCantidadSemestres = new JTextField();
        this.getContentPane().add(this.inputCantidadSemestres);
        this.inputCantidadSemestres.setBounds(170,200,180,20);

        ActionListener actionbuttonVolver = e -> {
            this.dispose();
            ventanaMenuPrincipal ventanaMenuPrincipal = new ventanaMenuPrincipal();
        };
        JButton buttonVolver = new JButton();
        buttonVolver.setBounds(230, 500, 100,20 );
        buttonVolver.addActionListener(actionbuttonVolver);
        this.add(buttonVolver);
        buttonVolver.setText("Volver");

        ActionListener actionbuttonRegistrar = e -> {
            registrar(this.inputNombreCarrera.getText(), this.inputCodigoCarrera.getText(), this.inputCantidadSemestres.getText(), listaCarreras);
            ventanaPopUp popup = new ventanaPopUp("Carrera Registrada!");
        };
        JButton buttonRegistrar = new JButton();
        buttonRegistrar.setBounds(70, 500, 100,20 );
        buttonRegistrar.addActionListener(actionbuttonRegistrar);
        this.add(buttonRegistrar);
        buttonRegistrar.setText("Registrar");


    }
    private void registrar(String nombreCarrera, String codigoCarrera, String numeroSemestres, ArrayList<Carrera> listaCarreras) {
        if (!nombreCarrera.equals("") && !codigoCarrera.equals("") && !numeroSemestres.equals("")){
            Carrera carreraNueva = new Carrera(nombreCarrera,codigoCarrera,numeroSemestres);
            listaCarreras.add(carreraNueva);


        }
        else {
            new ventanaPopUp("Campo Faltante");
        }
    }

}
