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

    public void output(String palabra){
        System.out.println(palabra);
    }

    public void output(int num){
        System.out.println(num);
    }
}