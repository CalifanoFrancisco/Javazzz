package ONG;

public class Administrativo extends Voluntario {
    private Computadora computadora;
    private String nombreDeUsuario,contrasenia;
    public Administrativo(){
        super();
        this.computadora = new Computadora();   
    }

    public boolean setContrasenia(String x){
        String symbolChars = "/*-+!#$%&()=?¡|°!{}-.,:;";
        String mayusChars  = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        boolean symbol = false,mayus = false;

        if(x.length() < 8){ return false; }

        for(int i = 0; i < x.length(); i++){
            for(int e = 0; e < symbolChars.length(); e++) {
                if(x.charAt(i)==symbolChars.charAt(e)){
                    symbol = true;
                }
            }
        }
        for(int i = 0; i < x.length(); i++){
            for(int e = 0; e < mayusChars.length(); e++) {
                if(x.charAt(i)==mayusChars.charAt(e)){
                    mayus = true;
                }
            }
        }
        if(mayus == true && symbol == true){ return true; }

        return false;
    }

    public Computadora getComputadora(){ return this.computadora; }
    public String getNombreUsuario(){ return this.nombreDeUsuario; }
    public String getCOntrasenia(){ return this.contrasenia;}

    @Override
    public void accion(){
        System.out.println(nombreDeUsuario);
    }
}
