
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Libreria {

    private String nombre;
    private ArrayList<Libro> libros;
    private HashSet  <Cliente> clientes;

    private HashMap<Cliente,Float>   ventas;
    //              cliente,total

    private HashMap<String ,Integer> descuentos;
    //             libreria,descuento
    Libreria(){
        this.nombre="zzz";
        libros     = new ArrayList<Libro>();
        clientes   = new HashSet<Cliente>();

        descuentos = new HashMap<String,Integer>();
        ventas     = new HashMap<Cliente,Float>();
    }

    Libreria(String nombre){
        this.nombre = nombre;
        libros = new ArrayList<Libro>();
        clientes=new HashSet<Cliente>();

        descuentos = new HashMap<String,Integer>();
        ventas     = new HashMap<Cliente,Float>();
    }

    public ArrayList<String> nombresEditorialesEjemplo(){
        ArrayList<String> nombres = new ArrayList<String>();

        nombres.add("Kapelusz");
        nombres.add("Sudamericana");
        nombres.add("Atlántida");
        nombres.add("ElAteneo");
        nombres.add("Interzona");
        nombres.add("Sur");
        nombres.add("Alianza");
        
        return nombres;
    }

    public void addEditorial(String nombre,int descuento){
        descuentos.put(nombre,descuento);
    }

    /* rear un método que imprima los libros comprados del cliente, sus
    | respectivas unidades y el importe total de la compra.*/ 
     
    public void sayCosas(Cliente cliente_){
        for (Cliente cliente : clientes){
            if(cliente==cliente_){
                System.out.println("Nombre: " +cliente.getNombre()+" ID: "+cliente.getId());

                HashMap<Libro,Integer> map = cliente.getLibrosComprados();

                for (Libro libros : map.keySet()) {
                    System.out.println("Nombre libro: "+libros.getNombre()+"| Cantidad: "+map.get(libros));
                }

                System.out.println("Total: "+ventas.get(cliente));


            }
	    }    
    }
}   
