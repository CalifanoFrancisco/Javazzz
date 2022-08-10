package SistemaCine;

import java.util.HashSet;
import java.util.Random;


public class Cine {

    private static int random(int max,int min){ return new Random().nextInt(max+min)+min; }

    private HashSet<Asiento>            asientos;
    private HashSet<Espectador>         espectadores;
    private Pelicula                    pelicula;

    public void addEspectador(Espectador i){    this.espectadores.add(i);   }
    public void addAsiento   (Asiento    i){    this.asientos.add(i);       }

    public void asignarAsientos(int columnas,int filas,float precioEntrada){

        int columnasDeAsientos = 27;    //A - Z
        int filasDeAsientos    = 99;    //0 - 99

        columnasDeAsientos = columnas;
        filasDeAsientos    = filas;


        for (Espectador espectador : espectadores) {
            boolean e = true;
            while(e){
                int filaRandom    = random(filasDeAsientos, 1);
                int columnaRandom = random(columnasDeAsientos, 1);
                for(Asiento asiento : this.asientos){
                    if (asiento.getColumnaInt() == columnaRandom && asiento.getFila() == filaRandom ){
                        if (
                            !asiento.isOcupado()                                    &&
                            espectador.getDinero() >= precioEntrada                 &&
                            espectador.getEdad()   >= this.pelicula.getEdadMinima()
                        ) {
                            espectador.setDinero(espectador.getDinero() - precioEntrada);
                            espectador.setAsiento(asiento);
                            asiento.ocupar();
                            e = false;
                        } else {
                            e = true;
                        }
                    
                    }
                }
            }
        }
    }

    /*
    public static void main(String[] args) {
        Cine cine = new Cine();        
        for(int i=0;i<100;i++){ cine.addEspectador(new Espectador(i));  }
        for(int i=0;i<100;i++){ cine.addAsiento   (new Asiento(i));     }

        cine.asignarAsientos(1,100,200);


    }*/
}
