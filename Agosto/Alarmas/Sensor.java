package SistemaDeAlarmas;

import java.time.LocalDate;

public abstract class Sensor {

      private boolean conectado;
      private Integer valor;
      private Integer valorUmbral;
      private LocalDate fechaDeAdquisicion;

      public Sensor() {
            this.conectado = false;
            this.valor = 10;
            this.valorUmbral = 12;
            this.fechaDeAdquisicion = LocalDate.now();
      }

      public Sensor(boolean conectado,Integer valor,Integer valorUmbral,LocalDate fechaDeAdquisicion) {
            this.conectado = conectado;
            this.valor = valor;
            this.valorUmbral = valorUmbral;
            this.fechaDeAdquisicion = fechaDeAdquisicion;
      }

      public void setConectado(boolean i){ this.conectado = i; }
      public void setValor(Integer i){ this.valor = i; }
      public void setValorUmbral(Integer i){ this.valorUmbral = i; }
      public void setFechaDeAdquisicion(LocalDate i){ this.fechaDeAdquisicion = i; }

      public boolean getConectado(){ return this.conectado; }
      public Integer getValor(){ return this.valor; }
      public Integer getValorUmbral(){ return this.valorUmbral; }
      public LocalDate getFechaDeAdquisicion(){ return this.fechaDeAdquisicion; }

      abstract void alertar();
      
      public boolean alerta(){
            return (this.getConectado() && this.getValor() >= this.getValorUmbral());
        }
}
