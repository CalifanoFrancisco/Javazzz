import java.util.Scanner;

public class Fecha {
    private int año,mes,dia;
    
    public Fecha(int año,int mes,int dia){
        this.año = año;
        this.mes = mes;
        this.dia = dia;
    }
    public void MostrarFecha() {
        System.out.println(this.dia + "-" + this.mes + "-" + this.año);
    }

    public boolean esAñoBisiesto() {
        return this.año%4 == 0;
    }

    public Fecha diaSiguiente() {
        int dia = this.dia;
        int mes = this.mes;
        int año = this.año;

        dia++;

        if(diasEnUnMes(this.mes) < this.dia+1){
            mes += 1;
            dia  = 1;
        }
        if(this.mes>12){
            dia = 1;
            mes = 1;
            año ++;
        }
        return new Fecha(año,mes,dia);
    }

    private int diasEnUnMes(int mes){
        int e = 0;
        switch(mes){
            case 1:   e = 31; break;
            case 2:   if(esAñoBisiesto()){ e = 29; }else{ e = 28; } break;
            case 3:   e = 31; break;
            case 4:   e = 30; break;
            case 5:   e = 31; break;
            case 6:   e = 30; break;
            case 7:   e = 31; break;
            case 8:   e = 31; break;
            case 9:   e = 30; break;
            case 10:  e = 31; break;
            case 11:  e = 30; break;
            case 12:  e = 31; break;
            default:  e = -1; break;
        }
        return e;
    }

    private static int input(){
        return new Scanner(System.in).nextInt();
    }
    private static void println(String i){  System.out.println(i);}
    public static void main(String [] args){

        int dia = 0,mes = 0,año = 0;

        println("Ingrese el año: ");    año = input();
        println("Ingrese el mes: ");    mes = input();
        println("Ingrese el dia: ");    dia = input();

        Fecha fecha = new Fecha(año,mes,dia);

        for(int i=0;i<10;i++){
            fecha.diaSiguiente();
            fecha = fecha.diaSiguiente();
            fecha.MostrarFecha();

        }


    }


}
