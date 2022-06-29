import javax.swing.*;
import java.awt.*;


public class Screen extends JFrame{
    int room1 = 0;
    int room2 = 0;
    int weeks;
    int boat = 0;
    JPanel p, p1;
    JLabel l, l1;
    JTextField t, t1;
    JButton b;
    JCheckBox b1, b2, b3;
    JButton circulo,cuadrado,esfera,cubo,triangulo;
    Botones botones;

    public Screen(){
        //Declarar botones
        this.botones = new Botones();
        botones.addButton("Circulo");
        botones.addButton("Cuadrado");
        botones.addButton("Cubo");
        botones.addButton("Esfera");
        botones.addButton("Triangulo");
        botones.setAllSize(100, 50);
        this.botones.addToJFrame(this);
        //Declarar pantalla
        this.setTitle("Area de figuras");
        this.setSize(800, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //
        //this.buildPanel();
        this.add(p);
        this.setVisible(true);
    }
    private void buildPanel(){
        l = new JLabel("Select a room type");
        l1 = new JLabel("How many weeks will you be staying?");
        b = new JButton("Confirm");
        b1 = new JCheckBox("1 bedroom ($600 per week)");
        b2 = new JCheckBox("2 Bedroom ($850 per week)");
        b3 = new JCheckBox("Rowboat rental ($60 per week)");

        p = new JPanel();
        p1 = new JPanel();

        this.add(p);
        p.add(l);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(l1);
        p.add(b);
        this.add(p1);

        /*b.addActionListener(new buttonlistener());
        b1.addItemListener(new cbListener());
        b2.addItemListener(new cbListener());
        b3.addItemListener(new cbListener());*/
        setVisible(true);

    }
    /*class buttonlistener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String i = t.getText();
            int val = Integer.parseInt(i);
            val = (room1 + room2 + boat) * weeks;
            JOptionPane.showMessageDialog(null, "Total is " + val);
        }
    }*/
    

}
