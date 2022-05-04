
//import java.util.Scanner;
import java.util.ArrayList;

public class TarjetaEquis {
  private float saldo;
  private float saldoNegativoMaximo;
  private int   numeroId;
  private ArrayList<Viaje> viajes;


  public TarjetaEquis(){
    this.saldo = 0;
    this.saldoNegativoMaximo = 20;
    this.numeroId = 0;
    viajes = new ArrayList<>();
  }

  public TarjetaEquis(float saldo,float saldoNegativoMaximo,int numeroId){
    this.saldo = saldo;
    this.saldoNegativoMaximo = saldoNegativoMaximo;
    this.numeroId = numeroId;
    viajes = new ArrayList<>();
  }

  public float getsaldo(){ return this.saldo;}
  public float getsaldoNegativoMaximo(){ return this.saldoNegativoMaximo;}
  public int   getnumeroId(){ return this.numeroId;}


  public void setsaldo(float saldo){ this.saldo = saldo; }
  public void setsaldoNegativoMaximo(float saldoNegativoMaximo){ this.saldoNegativoMaximo = saldoNegativoMaximo; }
  public void setnumeroId(int numeroId){ this.numeroId = numeroId; }


  /*La clase TarjetaEquis tendrá como métodos:

    "cargarSube(float monto)"
    "realizarViaje(Viaje viaje)"
    "ultimoMontoAbonado()"
*/

  public void cargarSube(float monto){      this.saldo+=monto;      }
  public void realizarViaje(Viaje viaje){   this.viajes.add(viaje); }
  public Float ultimoMontoAbonado(){   
    return this.viajes.get(this.viajes.size()).getprecio();
  }

  }

