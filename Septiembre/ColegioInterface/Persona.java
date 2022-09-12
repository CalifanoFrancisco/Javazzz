
public class Persona {

      private String nombre;
      private int edad;
      private int dni;
      private String apellido;

      public Persona() {
            this.nombre = "ernesto";
            this.edad = 0;
            this.dni = 0;
            this.apellido = "pumai";
      }

      public Persona(String nombre,int edad,int dni,String apellido) {
            this.nombre = nombre;
            this.edad = edad;
            this.dni = dni;
            this.apellido = apellido;
      }

      public void setNombre(String i){ this.nombre = i; }
      public void setEdad(int i){ this.edad = i; }
      public void setDni(int i){ this.dni = i; }
      public void setApellido(String i){ this.apellido = i; }

      public String getNombre(){ return this.nombre; }
      public int getEdad(){ return this.edad; }
      public int getDni(){ return this.dni; }
      public String getApellido(){ return this.apellido; }

}
