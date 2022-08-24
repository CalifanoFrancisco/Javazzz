package Venta_de_computadoras;

public class InputDevice extends Device {

    private Conector conector;

    public InputDevice() {
        super();
        this.conector = new Conector();
    }

    public InputDevice(Conector conector) {
        super();
        this.conector = conector;
    }

    public void setConector(Conector i){ this.conector = i; }

    public Conector getConector(){ return this.conector; }

}
