package Exceptions;

import java.util.ArrayList;
import java.util.Scanner;

/*- Dado el ejercicio de sistema de alarmas que tiene un edificio, habrá que permitirle 
al usuario que pueda elegir de cuál de todos los dispositivos quiere obtener más información.
Para esto habrá que pedirle al usuario que ingrese un número desde el 0 hasta la cantidad
de alarmas que estén registradas. Acorde al número que elija es el dispositivo que se 
mostrará. 
Deberán tener en cuenta en la implementación si el usuario no ingresa un número
entero o ingresa un número mayor a la cantidad de dispositivos que hay instalados en el
edificio. No se deberá cortar la ejecución del programa por alguno de estos errores. */


public class AlarmaManager {
    public static int userInput(){ 
        Scanner in = new Scanner(System.in); 
        return in.nextInt();
    }
    public static void main(String[] args) {

        ArrayList<Sensor> sensores = new ArrayList<>();
        sensores.add(new SensorDePresion());

        try {
            int aux = userInput();
            if (aux < 0) {
                throw new Exception("No puede ser menor que 0"); 
            } else if (aux > sensores.size()){
                throw new Exception("No puede ser mayor que la cantidad de sensores");
            }
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
        System.out.println("anda");

    }
}
