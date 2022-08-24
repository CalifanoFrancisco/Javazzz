package Venta_de_computadoras;

public class Componente {
    /*Todos los componentes que se le pueden agregar al ordenador tienen información sobre el nombre
del fabricante, el modelo, el precio de venta que va variando acorde a la inflación del país y el stock. 
 */
    private String info,modelo;
    private float precio;
    private int stock;
    private Empresa fabricante;
    public Componente(){
        this.info = "";
        this.fabricante = new Empresa();
        this.modelo = "2";
        this.stock = 0;
    }
    public void modificarPrecioPorInflacion(int porcentaje){
        this.precio = (porcentaje*this.precio)/100;
    }
    public Empresa getEmpresa(){return this.fabricante;}
    public float getPrecio(){   return this.precio;    }
    public int getStock(){  return this.stock;  }
    public String getInfo(){return this.info;   }
    public String getModelo(){  return this.modelo; }
    public void setStock(int i){ this.stock=i;  }
}
