
import java.util.Scanner;

import javax.print.DocFlavor.READER;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Banco {
  private String nombre;
  private ArrayList<Cliente> clientes;
  private HashMap<Cliente,Usuario> clientes_;
  private ArrayList<Registro> registro;
  private String direccion;

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
      }
      aux.put(clientes.get(i).getcbu(),visitas);

    }
    System.out.println(aux);
    return aux;
  }
  
  public void imprimirElementosHashMap(HashMap<Integer,Integer> aux){
    for (Integer i : aux.keySet()) {
      System.out.println("Clave: "+aux.keySet()+" | Valor: "+aux.values());
    }
  }

  public boolean isInClientes(Cliente cliente){
    for (int i = 0; i < clientes.size(); i++) {
      if(cliente == clientes.get(i)){
        return true;
      }
    }
    return false;
  }

  public Ticket addDineroCliente(Cliente cliente,Caja caja,Float i){
    if(this.isInClientes(cliente)){
      cliente.addDinero(i);
      Registro aux = new Registro(cliente.getUsuario(),this.direccion, i, "dinero depositado");
      registro.add(aux);
      return new Ticket(this, aux,caja, cliente.getDinero());
    }
    return new Ticket();
  }

  public Ticket subDineroCliente(Cliente cliente,Caja caja,Float i){
    if(this.isInClientes(cliente)){
      cliente.subDinero(i);
      Registro aux = new Registro(cliente.getUsuario(),this.direccion, i, "dinero retirado");
      registro.add(aux);
      return new Ticket(this,aux,caja,cliente.getDinero());
    }
    return new Ticket();
  }

  public Ticket crearCuenta(Cliente cliente,Caja caja,String userName,String clave){
    if(!this.isInClientes(cliente)){
      clientes_.put(cliente,new Usuario(userName, clave));
      clientes.add(cliente);
      Registro aux = new Registro(cliente.getUsuario(), this.direccion, 0, "crear cuenta");
      registro.add(aux);
      return new Ticket(this,aux,caja,cliente.getDinero());
    }
    return new Ticket();
  }


}

