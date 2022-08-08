import java.util.HashSet;

public class Sistema {
    private HashSet<Cuenta> cuentas;

    public Sistema(){
        this.cuentas = new HashSet<>();
    }

    public HashSet<Cuenta> getCuentas(){ return this.cuentas; }

    public boolean transferir(Cuenta a,Cuenta b,float dinero){
        if (a.getSaldoDisponible() < dinero) {
            System.out.println("Saldo insuficiente");
            return false;
        }
        
        a.retirarDinero (dinero);
        b.ingresarDinero(dinero-((b.getTipoInteres()*100)/dinero));

        return true;
    }
}
