import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ezJavaCode EZ = new ezJavaCode();
        HashSet  <Integer> conjunto1  = new HashSet<>();
        HashSet  <Integer> conjunto2  = new HashSet<>();
        ArrayList<Integer> userArray1 = new ArrayList<>();
        ArrayList<Integer> userArray2 = new ArrayList<>();
        
        userArray1 = EZ.rellenarArrayList(1);
        userArray2 = EZ.rellenarArrayList(2);

        EZ.sayArrayList(userArray1, 1);
        EZ.sayArrayList(userArray2, 2);

        conjunto1 = EZ.ArrayToHashSet(userArray1);
        conjunto2 = EZ.ArrayToHashSet(userArray2);

        EZ.sayHashSet(conjunto1, 1);
        EZ.sayHashSet(conjunto2, 2);

        if(EZ.same(conjunto1,conjunto2)){
            EZ.output("Son iguales");
        }else{
            EZ.output("Son diferentes");
        }
       
    }
}