package SistemaCine;

public class Espectador extends Persona{
    private float dinero;
    private Asiento asiento;
    public Espectador(){
        super();
        this.dinero = 100;
        this.asiento = null;
    }
    public float   getDinero() {    return this.dinero;     }
    public Asiento getAsiento(){    return this.asiento;    }

    public void  setDinero (float i){   this.dinero = i;    }
    public void  setAsiento(Asiento i){ this.asiento = i;   }
    
}
