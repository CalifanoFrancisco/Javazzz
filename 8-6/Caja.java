public class Caja {
    private int n_sucursal;
    private boolean persona,automatica;
    private Cajero cajero;

    public Caja(int n_sucursal,String tipo_caja){
        this.n_sucursal=n_sucursal;
        switch(tipo_caja){
            case "caja":        
                this.persona=true;     
                this.cajero = new Cajero();    
                this.automatica=false;
            break;
            case "automatica":  
                this.automatica=true;   
                this.persona = false;
            break;
        }
    }
    public boolean isPersona(){
        return this.persona;
    }
    public boolean isAutomatico(){
        return this.automatica;
    }
    public Cajero getCajero(){  return this.cajero; }
}
