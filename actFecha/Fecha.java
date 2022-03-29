package src;

public class Fecha {

    private int dia,mes,anio;
    
    public Fecha(){
        this.dia = 0;
        this.mes = 0;
        this.anio = 0;
    }
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public void setMes(int mes){    this.mes=mes;   }
    public void setDia(int dia){    this.dia=dia;   }
    public void setAnio(int anio){  this.anio=anio; }

    public int getMes(){    return this.mes;    }
    public int getDia(){    return this.dia;    }
    public int getAnio(){   return this.anio;   }

    public void reiniciar(int mes,int dia,int anio){
        this.mes=mes;
        this.anio=anio;
        this.dia=dia;
    }

    public void adelantar(int dia,int mes,int anio){
        this.dia  += dia;
        this.mes  += mes;
        this.anio += anio;
    }

    public void normalizar(){
        int max=0;
        switch(this.mes){
            case 1:     max=31; break;
            case 2:     max=28; break;
            case 3:     max=31; break;
            case 4:     max=30; break;
            case 5:     max=31; break;
            case 6:     max=30; break;
            case 7:     max=31; break;
            case 8:     max=31; break;
            case 9:     max=30; break;
            case 10:    max=31; break;
            case 11:    max=30; break;
            case 12:    max=31; break;
            default:    max=0;  break;
        }
        if(this.dia>max){
            this.dia-=max;
            this.mes++;
        }
        if(this.mes>12){
            this.mes-=12;
            this.anio++;
        }
    }

    public void sayTime(){
        System.out.println(
            this.dia + "/" +
            this.mes + "/" +
            this.anio
        );
    }

    public int dias(int mes){
        if(mes>12 || mes<1){
            int max;
            switch(this.mes){
                case 1:     max=31; break;
                case 2:     max=28; break;
                case 3:     max=31; break;
                case 4:     max=30; break;
                case 5:     max=31; break;
                case 6:     max=30; break;
                case 7:     max=31; break;
                case 8:     max=31; break;
                case 9:     max=30; break;
                case 10:    max=31; break;
                case 11:    max=30; break;
                case 12:    max=31; break;
                default:    max=0;  break;
            }
            return max;
        }else{  
            System.out.println("Valor invalido");
            return 0;
        }
    }
}
