public class Persona {
    
    private String nombre,direccion;
    private int edad,dni,telefono;

    public Persona(){
        this.nombre    = "vos";
        this.edad      = 12;
        this.direccion = "Gerli";
        this.dni       = 12345678;
        this.telefono  = 1500000000;
    }
    

    public Persona(String nombre, String direccion,int dni,int telefono,int edad){
        this.nombre    = nombre;
        this.direccion = direccion;
        this.dni       = dni;
        this.telefono  = telefono;
        this.edad      = edad;
    }
    
    public int    getEdad()     {   return this.edad;       }
    public int    getTelefono() {   return this.telefono;   }
    public int    getDni()      {   return this.dni;        }
    public String getNombre()   {   return this.nombre;     }
    public String getDireccion(){   return this.direccion;  }

    public void setEdad(int edad)            {   this.edad      = edad;       }
    public void setTelefono(int telefono)    {   this.telefono  = telefono;   }
    public void setDni(int dni)              {   this.dni       = dni;        }
    public void setNombre(String nombre)     {   this.nombre    = nombre;     }
    public void setDireccion(String direcion){   this.direccion = direcion;   }

    public boolean esMayorDeEdad    (int edad){
        if(edad>=18){    
            System.out.println("Mayor de edad");     
            return true;    
        }else{
            System.out.println("Menor de edad");   
            return false;   }
    }

    public boolean sonLaMismaPersona(String a,String b){
        if(a==b){
            System.out.println("Son la misma persona");
            return true;
        }else{
            System.out.println("No son la misma persona");
            return false;
        }
    }
    
    public boolean tienenLaMismaEdad(int a,int b){
        if(a==b){
            System.out.println("Tienen la misma edad");        
            return true;
        }else{
            System.out.println("No tienen la misma edad");
            return false;     
        }
    }
    
} 
