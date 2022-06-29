import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String[] args) {

        JFrame ventana = new JFrame();
        ventana.setLayout(null);      
        ventana.setSize(500,400);
        //ventana.setLayout(new BoderLayout()); //NO EXISTE BorderLayout() ??? cringe

        JLabel texto = new JLabel();
        texto.setText("materia de mierda");
        texto.setSize(300,25);
        texto.setLocation(25,25);

        JTextField campoDeTexto = new JTextField();
        campoDeTexto.setSize(500,25);
        campoDeTexto.setLocation(25,60);

        JButton boton = new JButton("Calculear");
        boton.setSize(100,100);
        boton.setLocation(100,100);

        ventana.add(campoDeTexto);
        ventana.add(texto);
        ventana.add(boton);

        ventana.setVisible(true);
    }
}
