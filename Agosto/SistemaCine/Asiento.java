package SistemaCine;

public class Asiento {
    private String  columna;
    private int     fila;
    private boolean ocupado;

    public Asiento(){
        this.columna = "A";
        this.fila    =  0;
        this.ocupado = false;
    }
    public Asiento(int fila){
        this.columna = "A";
        this.fila    =  0;
        this.ocupado = false;
    }

    public void setFila   (int     i){  this.fila    = i;   }
    public void setColumna(String  i){  this.columna = i;   }
    public void setOcupado(boolean i){  this.ocupado = i;   }

    public int     getFila()    {   return this.fila;       }
    public String  getColumna() {   return this.columna;    }
    public int getColumnaInt(){ return letraToNumber(); }
    public boolean isOcupado()  {   return this.ocupado;    }

    public void ocupar(){   this.ocupado = true;            }

    private int letraToNumber(){
        int out = 0;
        switch(this.columna){
            case "A": out = 1; break;
            case "B": out = 2; break;
            case "C": out = 3; break;
            case "D": out = 4; break;
            case "E": out = 5; break;
            case "F": out = 6; break;
            case "G": out = 7; break;
            case "H": out = 8; break;
            case "I": out = 9; break;
            case "J": out = 10; break;
            case "K": out = 11; break;
            case "L": out = 12; break;
            case "M": out = 13; break;
            case "N": out = 14; break;
            case "Ñ": out = 15; break;
            case "O": out = 16; break;
            case "P": out = 17; break;
            case "Q": out = 18; break;
            case "R": out = 19; break;
            case "S": out = 20; break;
            case "T": out = 21; break;
            case "U": out = 22; break;
            case "V": out = 23; break;
            case "W": out = 24; break;
            case "X": out = 25; break;
            case "Y": out = 26; break;
            case "Z": out = 27; break;
            default:  out = -1; break;
        }
        return out;
    }

    /*public Asiento getAsiento(int fila,int columna){
        if(this.fila == fila && letraToNumber() == columna){
            return this;
        }
        return null;
    }*/


}
