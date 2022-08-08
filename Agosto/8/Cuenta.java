public class Cuenta {
    private String nombreCliente;
    private int    numeroCliente;
    private int    numeroCuenta;
    private float  saldoDisponible;
    private float  tipoInteres;

    public Cuenta(){
        this.nombreCliente = "Ricardo Fort (El Cumandante)";
        this.numeroCliente = 10;
        this.numeroCuenta  = 0;
        this.saldoDisponible = 0;
        this.tipoInteres = 10;
    }

    public String getNombre(){          return this.nombreCliente;      }
    public float  getSaldoDisponible(){ return this.saldoDisponible;    }
    public float  getTipoInteres(){     return this.tipoInteres;        }
    public int    getNumeroCliente(){   return this.numeroCliente;      }
    public int    getNumeroCuenta(){    return this.numeroCuenta;       }

    public void setNombreCLiente  (String i){   this.nombreCliente   = i;    }
    public void setNumeroCliente  (int i)   {   this.numeroCliente   = i;    }
    public void setNumeroCuenta   (int i)   {   this.numeroCuenta    = i;    }
    public void setSaldoDisponible(float i) {   this.saldoDisponible = i;    }
    public void setTipoInteres    (float i) {   this.tipoInteres     = i;    }

    public boolean ingresarDinero(float dinero){
        this.saldoDisponible += dinero;
        return true;
    }

    public boolean retirarDinero(float dinero){
        this.saldoDisponible -= dinero;
        if(dinero < this.saldoDisponible){
            System.out.println("No se puede retirar esa cantidad");
            return false;
        }
        this.saldoDisponible -= dinero;
        return true;
    }


}
