
//import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Sistema {
  private ArrayList<Pasajero> pasajerosPresentes;
  private ArrayList<Pasajero> historialDePasajeros;
  private int linea;


  public Sistema(){
    pasajerosPresentes   = new ArrayList<>();
    historialDePasajeros = new ArrayList<>();
    this.linea = 1;
  }

  public Sistema(int linea){
    pasajerosPresentes   = new ArrayList<>();
    historialDePasajeros = new ArrayList<>();
    this.linea = linea;
  }
  public int getlinea(){ return this.linea;}

  public void setlinea(int linea){ this.linea = linea; }
/*
    "subePasajero(Pasajero pasajero)", método que no retorna nada; imprime "¡Bienvenido!" en caso de que el usuario haya podido pagar su boleto exitosamente e imprime "Saldo Insuficiente" en caso contrario.
    "seBajaPasajero(Pasajero pasajero)", método que no retorna nada
    "pasajerosQueSeHanSubidoAlgunaVez()", retorna una instancia de clase HashSet
    "pasajerosConUltimoMontoAbonado()", retorna una instancia de la clase HashMap
    "ultimoMontoAbonadoPorPasajero(float numeroId)", retorna el monto del pasajero que tiene la tarjeta con numeroId Utilizar el método "pasajerosConUltimoMontoAbonado()"
    "seSuperaElSaldoNegativo()", método que retorna true en caso de superar el saldo negativo y false en caso contrario
*/

    public void subePasajero(Pasajero pasajero){
      float min = pasajero.getTarjeta().getsaldoNegativoMaximo();
      float saldo = pasajero.getTarjeta().getsaldo();
      if(saldo>=min){
        System.out.println("Bienvenido");
        pasajerosPresentes.add(pasajero);
      }else{
        System.out.println("No hay saldo suficiente");
      }
    }
  
    public void seBajaPasajero(Pasajero pasajero){
      pasajerosPresentes.remove(pasajero);
      historialDePasajeros.add(pasajero);
    }

    public ArrayList<Pasajero> pasajerosQueSeHanSubidoAlgunaVez(){
      return historialDePasajeros;
    }

    public HashMap<Pasajero,Float> pasajerosConUltimoMontoAbonado(){
      HashMap<Pasajero,Float> aux = new HashMap<Pasajero,Float>();
      for (int i = 0; i < historialDePasajeros.size(); i++) {
        Pasajero e = historialDePasajeros.get(i);
        float monto = e.getTarjeta().getViaje(e.getTarjeta().getViajes().size()).getprecio();
        aux.put(e, monto);
      }
      return aux;
    }
  
}

