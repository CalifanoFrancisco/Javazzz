package Venta_de_computadoras;

public class Tarjeta extends MetodoDePago{
    private double num;
    private Banco banco;
    public Tarjeta(){
        super();
        this.num = 0;
        this.banco = new Banco();
    }
    public double getNum(){    return this.num;    }
    public Banco getBanco(){    return this.banco;  }
}
