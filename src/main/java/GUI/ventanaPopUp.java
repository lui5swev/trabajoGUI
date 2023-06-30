package GUI;

import javax.swing.*;

public class ventanaPopUp extends JFrame {
    public ventanaPopUp(String texto){
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setSize(300, 110);
        this.setVisible(true);
        ImageIcon image = new ImageIcon("images/download.jpg");
        this.setIconImage(image.getImage());

        JLabel textoPantalla = new JLabel(texto);
        this.getContentPane().add(textoPantalla);
        textoPantalla.setBounds(90, 20, 200, 20);

    }
}
