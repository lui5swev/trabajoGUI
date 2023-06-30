package GUI;

import Objetos.Carrera;
import Objetos.Estudiante;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ventanaRegistroEstudiantes extends JFrame{
    private JTextField inputNombre;
    private JTextField inputRut;
    private JTextField inputMatricula;
    public ventanaRegistroEstudiantes(ArrayList<Estudiante> listaEstudiantes, ArrayList<Carrera> carrera) {
        this.setTitle("Intranet");
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setSize(400, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("images/download.jpg");
        this.setIconImage(image.getImage());

        JLabel label = new JLabel("Registro Estudiante");
        Font font = new Font("Calibri", 3, 20);
        label.setFont(font);
        this.getContentPane().add(label);
        label.setBounds(110, 40, 200, 20);

        JLabel labelNombre = new JLabel("Nombre:");
        this.getContentPane().add(labelNombre);
        labelNombre.setBounds(20, 100, 200, 20);
        this.inputNombre = new JTextField();
        this.getContentPane().add(inputNombre);
        inputNombre.setBounds(170, 100, 180, 20);

        JLabel labelRut = new JLabel("Rut:");
        this.getContentPane().add(labelRut);
        labelRut.setBounds(20, 150, 200, 20);
        this.inputRut = new JTextField();
        this.getContentPane().add(inputRut);
        inputRut.setBounds(170,150,180,20);

        JLabel labelMatricula = new JLabel("Numero de Matricula:");
        this.getContentPane().add(labelMatricula);
        labelMatricula.setBounds(20, 200, 200, 20);
        this.inputMatricula = new JTextField();
        this.getContentPane().add(inputMatricula);
        inputMatricula.setBounds(170,200,180,20);

        JLabel labelCarrera = new JLabel("Carrera:");
        this.getContentPane().add(labelCarrera);
        labelCarrera.setBounds(20, 250, 100, 20);

        String[] codigos = new String[carrera.size()];

        for (int i = 0; i < carrera.size(); i++) {
            codigos[i] = carrera.get(i).getCodigo();
        }

        JComboBox<String> comboBox = new JComboBox<>(codigos);

        comboBox.setBounds(170, 250, 180, 20);
        comboBox.setEditable(true);
        comboBox.setVisible(true);
        this.getContentPane().add(comboBox);

        ActionListener actionbuttonCancelar = e -> {
            this.dispose();
            ventanaMenuPrincipal ventanaMenuPrincipal = new ventanaMenuPrincipal();
        };
        JButton buttonCancelar = new JButton();
        buttonCancelar.setBounds(230, 500, 100,20 );
        buttonCancelar.addActionListener(actionbuttonCancelar);
        this.add(buttonCancelar);
        buttonCancelar.setText("Cancelar");

        ActionListener actionbuttonRegistrar = e -> {
            registrar(this.inputNombre.getText(), this.inputRut.getText(), this.inputMatricula.getText(), (String) comboBox.getSelectedItem(), listaEstudiantes);
            ventanaPopUp popup = new ventanaPopUp("Estudiante Registrado!");
        };
        JButton buttonRegistrar = new JButton();
        buttonRegistrar.setBounds(70, 500, 100,20 );
        buttonRegistrar.addActionListener(actionbuttonRegistrar);
        this.add(buttonRegistrar);
        buttonRegistrar.setText("Registrar");


    }

    private void registrar(String inputNombre, String inputRut, String inputMatricula, String selectedItem, ArrayList<Estudiante> listaEstudiantes) {
        if (!inputNombre.equals("") && !inputRut.equals("") && !inputMatricula.equals("")){
            Estudiante estudianteNuevo = new Estudiante(inputNombre, inputRut, inputMatricula, selectedItem);
            listaEstudiantes.add(estudianteNuevo);

        }
        else {
            new ventanaPopUp("Campo Faltante");
        }


    }
}
