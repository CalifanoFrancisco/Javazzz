import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class ezJavaCode{
    ezJavaCode(){

    }

    public String StringInput(){
        Scanner input_ = new Scanner(System.in);
		String input = input_.nextLine();
        return input;
    }

    public int IntInput(){
        Scanner input_ = new Scanner(System.in);
        int input = input_.nextInt();
        return input;
    }

    public Float FloatInput(){
        Scanner input_ = new Scanner(System.in);
        Float input = input_.nextFloat();
        return input;
    }

    public void output(String palabra){     System.out.println(palabra);    }
    public void output(int num){            System.out.println(num);        }

    public ArrayList<Integer> rellenarArrayList(int num){
        ArrayList<Integer> aux = new ArrayList<>();

        System.out.println("Arraylist "+num);
        for (int i = 0; i<10; i++) {
            System.out.println("Inserte numero: ");
            aux.add(IntInput()) ;
        }
        return aux;
    }

    public void sayArrayList(ArrayList<Integer> aux,int num){
        System.out.println("ArrayList N°"+num);
        for (int i = 0; i < aux.size(); i++) {
            output(aux.get(i));
        }
        output("");
    }

    public HashSet<Integer> ArrayToHashSet(ArrayList<Integer> array){
        HashSet<Integer> aux = new HashSet<>();

        for (int i = 0; i < array.size(); i++) {
            aux.add(array.get(i));
        }

        return aux;
    }

    public void sayHashSet(HashSet<Integer> aux,int num){
        output("HashSet N°"+num);
        for(Integer numero : aux){
            output(numero);
        }
    }

    public boolean same(HashSet<Integer> HS1,HashSet<Integer> HS2){
        if(HS1.equals(HS2)){
            return true;
        }
        return false;
    }

}