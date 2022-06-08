public class CajaPersona extends Caja{
    private Cajero cajero;
    public CajaPersona(int i,Cajero cajero){
        super(i);
        this.cajero=cajero;
    }
    public CajaPersona(){
        super();
        this.cajero = new Cajero();
    }
    public Cajero getCajero(){  return this.cajero; }
}
