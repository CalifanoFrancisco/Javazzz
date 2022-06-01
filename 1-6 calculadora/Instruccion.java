public class Instruccion {
    
    private Instruccion comando;
    
    public Instruccion(String comando){
        switch(comando){
            case "MUL":     this.comando = new Mul(); break;
            case "ADD":     this.comando = new Add(); break;
            case "SUB":     this.comando = new Sub();   break;
            default: System.out.println("Invalid command"); break;
        }
    }
    public Instruccion(String comando, String variable){
        switch(comando){
            case "READ":    this.comando = new Read();  break;
            case "WRITE":   this.comando = new Write(); break;
            case "PUSH":    this.comando = new Push();  break;
            default: System.out.println("Invalid command"); break;
        }
    }

    
    /*public Float  getI(){
        return Float.parseFloat(this.i);
    }*/
}
