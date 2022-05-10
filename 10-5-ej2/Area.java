import static java.lang.Math.PI;
import static java.lang.Math.*;
public class Area {
    

    public Area(){}

    public double Circle(float radius){
        return Math.PI*radius*radius;
    }

    public double Sphere(float radius){
        return 4*Math.PI*radius*radius;
    }

    public double Square(float lado){
        return lado*lado;
    }

    public double Cube(float lado){
        return 6*lado*lado;
    }

    public double Triangle(float base,float altura){
        return base*altura/2;
    }
}
