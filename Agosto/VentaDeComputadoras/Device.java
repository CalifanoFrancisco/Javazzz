package Venta_de_computadoras;

import java.util.ArrayList;
import java.util.HashSet;

public class Device {

      private HashSet<Puerto> puertosValidos;
      private float precio;
      private ArrayList<Componente> componentes;

      public Device() {
            this.puertosValidos = new HashSet<>();
            this.precio = 100.f;
      }

      public Device(HashSet<Puerto> puertosValidos,float precio) {
            this.puertosValidos = puertosValidos;
            this.precio = precio;
      }

      public void setPuertosValidos(HashSet<Puerto> i){ this.puertosValidos = i; }

      public HashSet<Puerto> getPuertosValidos(){ return this.puertosValidos; }
      public float getPrecio(){ 
            float out = this.precio;
            for(Componente i:componentes){ out+=i.getPrecio();    }
            return out;
      }

}
