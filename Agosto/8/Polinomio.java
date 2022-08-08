import java.util.HashSet;
import java.lang.Math;

public class Polinomio {
    private int a,b,c;
    
    public Polinomio(int a,int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public HashSet<Double> resolvente(){
        HashSet<Double> out = new HashSet<>();
        
        out.add((-b+Math.sqrt(b*b-4*a*c))/2*a);
        out.add((-b-Math.sqrt(b*b-4*a*c))/2*a);

        return out;
    }

    public void sayResolvente(){
        int num = 1;
        for (Double i : this.resolvente()) {
            System.out.println("X"+num+": "+ i);
            num++;
        }
    }
}
