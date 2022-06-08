import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Registro {
    private String direccion,comando,descripcion;
    private LocalDateTime hora;
    private Usuario usuario;
    private Float monto;

    public Registro(Usuario usuario,String direccion,float monto,String comando){
        this.hora = LocalDateTime.now();
        this.usuario = usuario;
        this.direccion = direccion;
        this.monto = monto;
        this.comando = comando;
    }
    
    public String getDireccion(){   return this.direccion;  }
    public String getComando(){     return this.comando;    }
    public LocalDateTime getTime(){ return this.hora;       }
    public Usuario getUsuario(){    return this.usuario;    }
    public Float getMonto(){        return this.monto;      }


}
