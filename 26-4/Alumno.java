import java.util.HashMap;
//import java.util.HashSet;
import java.util.ArrayList;

public class Alumno extends Persona{

    private int    curso;
    private HashMap<String,ArrayList<Float>> notasPorMateria;   
  
    Alumno(){
      super();
      this.curso = 0;
      notasPorMateria = new HashMap<String,ArrayList<Float>>();
    }
  
    Alumno(String nombre, int edad, int dni, int telefono, String direccion,int curso){
      super(nombre,edad,dni,telefono,direccion);
      this.curso = curso;
      notasPorMateria = new HashMap<String,ArrayList<Float>>();
    }
  
    public int  getcurso()         { return this.curso;     }
    public void setcurso(int curso){ this.curso = curso;    }

    public void agregarNota(String materia,Float nota){
        notasPorMateria.get(materia).add(nota);
    }

    public Float menorNota(String materia){
        Float  notaBaja = 10000.f;
        Float  aux;

        for(int i=0;i<notasPorMateria.get(materia).size();i++){
            aux = notasPorMateria.get(materia).get(i);
            if(aux<notaBaja){
                notaBaja=aux;
            }
        }
        System.out.println(materia + " baja: " + notaBaja);
        return notaBaja;

        /*for (String materia : notasPorMateria.keySet()) {
            for(int i=0;i<notasPorMateria.get(materia).size();i++){
                aux
            }
            notasPorMateria.get(materia).size();
        }*/
    }
  
    public Float mayorNota(String materia){
        Float maximo = 0.f,aux;
        for (int i = 0; i < notasPorMateria.get(materia).size(); i++) {
            aux = notasPorMateria.get(materia).get(i);
            if(aux>maximo){
                maximo=aux;
            }
        }
        System.out.println(materia + " maximo: "+maximo);
        return maximo;
    }

    public Float promedioNotas(String materia){
        Float promedio=0.f,suma=0.f;
        int divisor = notasPorMateria.get(materia).size();

        for (int i = 0; i < notasPorMateria.get(materia).size(); i++) {
            suma+=notasPorMateria.get(materia).get(i);
        }
        promedio=suma/divisor;
        System.out.println("Promedio: "+promedio);
        return promedio;
    }
    
    public void agregarMateria(String materia){
        ArrayList<Float> aux = new ArrayList<Float>();
        aux.add(0.f);
        notasPorMateria.put(materia,aux);
    }
    
    public void sayAllNotas(String materia){
        for (int i = 0; i < notasPorMateria.get(materia).size(); i++) {
            System.out.println(materia+": "+notasPorMateria.get(materia).get(i));
        }
    }

}