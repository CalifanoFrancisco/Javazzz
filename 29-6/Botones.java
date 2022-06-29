import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Botones extends Area{
    private ArrayList<JButton> botones;

    public Botones(){
        this.botones = new ArrayList<>();
    }

    public void addButton(String text){
        this.botones.add(new JButton(text));
    }
    public void addButton(JButton i){
        this.botones.add(i);
    }
    public void setAllSize(int x, int y){
        for (int i = 0; i < botones.size(); i++) {
            this.botones.get(i).setSize(x,y);
        }
    }
    public JButton getButton(int i){
        return this.botones.get(i);
    }

    public ArrayList<JButton> getBotones(){
        return this.botones; 
    }
    public void addToJFrame(JFrame ventana){
        for (int j = 0; j < botones.size(); j++) {
            ventana.add(botones.get(j));
        }
    }
}
