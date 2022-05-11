
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Banco {
  private String nombre;
  private ArrayList<Cliente> clientes;


  public Banco(){
    this.nombre = "Galicia";
    clientes = new ArrayList<>();
  }

  public String getnombre(){ return this.nombre;}

  public void setnombre(String nombre){ this.nombre = nombre; }

  public HashSet<Integer> cbusDeClientesVisitantes(){
    HashSet<Integer> aux = new HashSet<Integer>();

    for (int i = 0; i < clientes.size(); i++) {
      aux.add(clientes.get(i).getcbu());
    }

    return aux;
  }

  public void imprimirElementosHashSet(HashSet<Integer> aux){
    System.out.println(aux);
  }

  public HashMap<Integer,Integer> cantidadDeVisitasPorCliente(){
    HashMap<Integer,Integer> aux = new HashMap<Integer,Integer>();
    
    for (int i = 0; i < clientes.size(); i++) {
      int visitas = 0;
      for (int j = 0; j < clientes.size(); j++) {
        if(clientes.get(i).getcbu() == clientes.get(j).getcbu()){
          visitas++;
        }
        aux.put(clientes.get(i).getcbu(),visitas);
      }

    }

    return aux;
  }
  }

