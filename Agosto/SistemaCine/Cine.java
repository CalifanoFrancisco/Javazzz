package SistemaCine;

import java.util.HashSet;
import java.util.Random;

public class Cine {

    private static int random(int max,int min){
        return new Random().nextInt(max+min)+min;
    }

    private HashSet<Asiento>            asientos;
    private HashSet<Espectador>         espectadores;
    private Pelicula                    pelicula;

    public void asignarAsientos(){

        int columnasDeAsientos = 27;
        int filasDeAsientos    = 99;

        for (Espectador espectador : espectadores) {
            boolean e = true;
            while(e){
                int filaRandom    = random(filasDeAsientos, 1);
                int columnaRandom = random(columnasDeAsientos, 1);
                for(Asiento asiento:asientos){
                    if (asiento.getColumnaInt() == columnaRandom && asiento.getFila() == filaRandom ){
                        if (!asiento.isOcupado()) {
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

}
