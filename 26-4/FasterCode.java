import java.util.Scanner;

public class FasterCode {
    FasterCode(){}

    public void println(int e)    {     System.out.println(e);  }
    public void println(String e) {     System.out.println(e);  }
    public void println(Float e)  {     System.out.println(e);  }
    public void println(Boolean e){     System.out.println(e);  }

    public void print(int e)    {       System.out.println(e); }
    public void print(String e) {       System.out.println(e); }
    public void print(Float e)  {       System.out.println(e); }
    public void print(Boolean e){       System.out.println(e); }

    public int    inputInt(){
        Scanner aux = new Scanner(System.in);
		int output = aux.nextInt();
        return output;
    }

    public String inputString(){
        Scanner aux = new Scanner(System.in);
		String output = aux.nextLine();
        return output;
    }
    
    public Float  inputFloat(){
        Scanner aux = new Scanner(System.in);
		Float output = aux.nextFloat();
        return output;
    }

  

}
