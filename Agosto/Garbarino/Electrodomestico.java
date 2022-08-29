package Garbarino;

public class Electrodomestico {

    private float precioBase;
    private float peso;
    private Color color;
    private Consumo consumo;

    public Electrodomestico() {
          this.color = Color.BLANCO;
          this.precioBase = 5000;
          this.peso = 5;
          this.consumo = Consumo.A;
    }

    public Electrodomestico(float precio, float peso){
        this.precioBase = precio;
        this.peso = peso;
        this.consumo = Consumo.A;
        this.color = Color.BLANCO;
    }

    public Electrodomestico(Color color,float precioBase,float peso,Consumo consumo) {
          this.color = color;
          this.precioBase = precioBase;
          this.peso = peso;
          this.consumo = consumo;
    }

    public void setColor(Color i){ this.color = i; }
    public void setPrecioBase(float i){ this.precioBase = i; }
    public void setPeso(float i){ this.peso = i; }
    public void setConsumo(Consumo i){ this.consumo = i; }

    public Color getColor(){ return this.color; }
    public float getPrecioBase(){ return this.precioBase; }
    public float getPeso(){ return this.peso; }
    public Consumo getConsumo(){ return this.consumo; }

    public void comprobarColor(){
        if( this.color != Color.BLANCO &&
            this.color != Color.AZUL &&
            this.color != Color.ROJO &&
            this.color != Color.GRIS &&
            this.color != Color.NEGRO
        ){
            this.color = Color.BLANCO;
        }
    }
    
    public void comprobarConsumoEnergetico(){
        if( this.consumo != Consumo.A &&
            this.consumo != Consumo.B &&
            this.consumo != Consumo.C &&
            this.consumo != Consumo.D &&
            this.consumo != Consumo.E &&
            this.consumo != Consumo.F
        ){
            this.consumo = Consumo.A;
        }
    }

    public float _precioFinal(){

        float precioFinal = this.precioBase;

        switch(this.consumo){
            case A: precioFinal += 1000; break;
            case B: precioFinal += 800; break;
            case C: precioFinal += 600; break;
            case D: precioFinal += 400; break;
            case E: precioFinal += 350; break;
            case F: precioFinal += 150; break;
            default: System.out.println("wat"); break;
        }
        if(this.peso > 0.f  && this.peso < 19.f){ precioFinal += 1000;  }
        if(this.peso > 20.f && this.peso < 49.f){ precioFinal += 5000;  }
        if(this.peso > 50.f && this.peso < 79.f){ precioFinal += 8000;  }
        if(this.peso > 80.f                    ){ precioFinal += 10000; }

        return precioFinal;
    }
}
