package GUI;

import javax.swing.*;

public class ventanaResultadosBusqueda extends JFrame {
    public ventanaResultadosBusqueda(){
        this.setTitle("Intranet");
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setSize(600, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("images/download.jpg");
        this.setIconImage(image.getImage());



    }

}
