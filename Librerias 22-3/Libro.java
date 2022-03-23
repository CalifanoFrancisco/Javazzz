package src;

public class Libro {

    private int    id;
    private String nombre;
    private float  precio;
    private String editorial;

    public Libro(){
        this.id        = -1;
        this.nombre    = "NULL";
        this.precio    = -1;
        this.editorial = "Gerli";
    }

    public Libro(/*int id,*/String name,float price,String editorial){

        //String libreriasConDescuento[]={"ElAteneo","Interzona","Sur","Alianza"};

        this.id=0;
        this.nombre=name;
        this.editorial=editorial;
        this.precio=price;

        /*for(int i=0;i<4;i++){
            if(this.editorial==libreriasConDescuento[i]){
                this.precio=this.precio/2;
            }
        }*/

    }

    public void setId       (int    id)       { this.id=id;                 }
    public void setNombre   (String nombre)   { this.nombre=nombre;         }
    public void setPrice    (float  precio)   { this.precio=precio;         }
    public void setEditorial(String editorial){ this.editorial=editorial;   }

    public int    getId()       {   return this.id;         }
    public String getNombre()   {   return this.nombre;     }
    public float  getPrecio()   {   return this.precio;     }
    public String getEditorial(){   return this.editorial;  }

    public void setPriceWDiscount(int newPrice,int descuento){
        this.precio=newPrice-(descuento*newPrice)/100;
    }

    public void sayData(){
        //System.out.println("----------------------------------------------");
        System.out.println("Libro");
        System.out.println("ID: "        + this.id);
        System.out.println("Nombre: "    + this.nombre);
        System.out.println("Editorial: " + this.editorial);
        System.out.println("Precio: "    + this.precio);
        System.out.println("----------------------------------------------");
    }

    public void descuentoNavidad(){
        if(this.id % 2 == 0){
            this.precio=this.precio-(25*this.precio)/100;
        }else{
            this.precio=this.precio-(35*this.precio)/100;
        }
    }

}
