package Garbarino;

import java.util.ArrayList;

public class Main {
    /* Crear una colección de mínimo 7 electrodomésticos distintos.
     Ejecutar el método precio final por cada electrodoméstico y mostrarlo por pantalla
     Mostrar por pantalla la suma de cada categoría de electrodomésticos
     Mostrar una lista con los 3 colores más usados para los electrodomésticos. */

    public static void main(String[] args) {
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();

        electrodomesticos.add(new Microondas());
        electrodomesticos.add(new Lavarropas());
        electrodomesticos.add(new Televisor());
        electrodomesticos.add(new Horno());
        electrodomesticos.add(new Tostadora());
        electrodomesticos.add(new Licuadora());
        electrodomesticos.add(new Heladera());
        
        float out = 0.f;
        Coso coso = new Coso();
        for(Electrodomestico i:electrodomesticos){
            /*2*/System.out.println(i._precioFinal());
            /*3*/out += i._precioFinal();
            /*4*/switch(i.getColor()){
                case BLANCO: coso.Blanco++; break;
                case NEGRO:  coso.Negro++;  break;
                case ROJO:   coso.Rojo++;   break;
                case AZUL:   coso.Azul++;   break; 
                case GRIS:   coso.Gris++;   break;
            }
        }
        System.out.println("Suma de todos los precios" + out);
        System.out.println("Colores mas usados: ");
        for(int i=0;i<3;i++){
            System.out.println(coso.max());
            coso.delNum(coso.max());
        }

    }

}
class Coso{
    public int Blanco=0,Rojo=0,Azul=0,Negro=0,Gris=0;
    public String max(){
        String out  = " ";
        if(Blanco>Rojo && Blanco>Azul && Blanco>Negro && Blanco>Gris){ out = "Blanco";  }
        if(Rojo>Blanco && Rojo>Azul   && Rojo>Negro   && Rojo>Gris){ out = "Rojo";  }
        if(Azul>Rojo   && Azul>Blanco && Azul>Negro   && Azul>Gris){ out = "Azul";  }
        if(Negro>Rojo  && Negro>Azul  && Negro>Blanco && Negro>Gris){ out = "Negro";  }
        if(Gris>Rojo   && Gris>Azul   && Gris>Negro   && Gris>Blanco){ out = "Gris";  }
        return out;
    }
    public void delNum(String x){
        switch(x){
            case "Blanco": this.Blanco = 0; break;
            case "Rojo":   this.Rojo   = 0; break;
            case "Azul":   this.Azul   = 0; break;
            case "Gris":   this.Gris   = 0; break;
            case "Negro":  this.Negro  = 0; break;
        }
    }
}
