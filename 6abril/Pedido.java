package src;

//import java.util.Scanner;
//import java.util.ArrayList;
import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.time.LocalTime;

public class Pedido {

  private LocalDate fecha_creacion;
  private LocalTime hora_entrega;
  private String    nombre_plato;
  private boolean   entregado;
  private int       id;
  //private Plato     plato;

  public Pedido(){
    this.entregado = false;

    this.fecha_creacion = LocalDate.now();
    this.hora_entrega   = LocalTime.now();

    //plato = new Plato();
    this.nombre_plato ="no";
    this.id=0;
  }

  public Pedido(String nombre_plato,boolean entregado){
    this.entregado = entregado;

    this.fecha_creacion = LocalDate.now();
    this.hora_entrega   = LocalTime.now();

    //plato = new Plato(nombre_plato,precio);
    this.nombre_plato = nombre_plato;
    this.id=0;
  }

  public LocalDate getfecha_creacion(){ return this.fecha_creacion; }
  public LocalTime gethora_entrega()  { return this.hora_entrega;   }
  public String    getnombre_plato()  { return this.nombre_plato;   }
  public boolean   getentregado()     { return this.entregado;      }
  public int       getId()            { return this.id;             }


  public void setfecha_creacion(LocalDate fecha_creacion){ this.fecha_creacion = fecha_creacion;  }
  public void sethora_entrega  (LocalTime hora_entrega)  { this.hora_entrega   = hora_entrega;    }
  public void setnombre_plato  (String    nombre_plato)  { this.nombre_plato   = nombre_plato;    }
  public void setentregado     (boolean   entregado)     { this.entregado      = entregado;       }   
  public void setId            (int id)                  { this.id             = id;              }

  public void entregar(){ this.entregado=true;  }

}

