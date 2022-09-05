package Exceptions;

public class Main {

    public static void sayNombre(String s) throws Exception{
        System.out.println("El nombre es "+s.length());
    }
    public static void sayNombre2(String x) throws Gachuxeption{
        try {
            if(x == null){
                throw new Gachuxeption("EL valor es null :/");
            }else{
                System.out.println("El nombre es"+x.length());
            }
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args){
        
        String nombre = null;

        System.out.println("1");
        try {
            System.out.println("El nombre es: " + nombre.length());
        } catch (Exception e) {
            System.out.println("El valor es "+e.getMessage());
        }
        System.out.println("2");
        try {
            if (nombre == null){ throw new IllegalArgumentException("No se puede medir un valor null"); }
        } catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
        System.out.println("3");
        try {
            sayNombre(nombre);
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
        System.out.println("4");

        try {
            sayNombre2(nombre);
        } catch (Gachuxeption e){
            System.err.println(e.getMessage());
        }

    }

}
  


