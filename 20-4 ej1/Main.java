import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ezJavaCode EZ = new ezJavaCode();
        HashSet<Integer> conjunto    = new HashSet<>();
        ArrayList<Integer> userArray = new ArrayList<>();

        for (int i = 0; i<10; i++) {
            EZ.output("Inserte numero");
            userArray.add(EZ.IntInput()) ;
        }

        for (int i = 0; i < userArray.size(); i++) {
            System.out.print(userArray.get(i));
        }
        System.out.println();

        for (int i = 0; i < userArray.size(); i++) {
            conjunto.add(userArray.get(i));
        }
        System.out.println("----------------------------");
        for(Integer numero : conjunto){
            System.out.println(numero);
        }
    }
}