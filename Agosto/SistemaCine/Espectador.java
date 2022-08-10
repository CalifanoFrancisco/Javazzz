package SistemaCine;

public class Espectador extends Persona{
    
    private Asiento asiento;
    private float dinero;
    private int id;

    public Espectador(){
        super();
        this.dinero = 100;
        this.asiento = null;
        this.id = 0;
    }

    public Espectador(int id){
        super();
        this.dinero  = 100;
        this.asiento = null;
        this.id      = id;
    }

    public float    getDinero()  {  return this.dinero;     }
    public Asiento  getAsiento() {  return this.asiento;    }
    public int      getId()      {  return this.id;         }

    public void setDinero  (float    i){    this.dinero   = i;  }
    public void setAsiento (Asiento  i){    this.asiento  = i;  }
    public void setId      (int      i){    this.id       = i;  }
    
}
