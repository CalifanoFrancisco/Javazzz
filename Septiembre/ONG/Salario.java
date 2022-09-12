package ONG;

import java.time.LocalDate;

public class Salario {
    private float sueldo;
    private Banco banco;
    private LocalDate fechaCobro,fechaDeAltaEnLaEmpresa;

    public Salario(){
        this.sueldo = 0;
        this.banco = Banco.SANTANDER;
        this.fechaCobro = LocalDate.now();
        this.fechaDeAltaEnLaEmpresa = LocalDate.now();
    }
    public float getSueldo(){ return this.sueldo; }
    public LocalDate getFechaCobro(){return this.fechaCobro; }
    public LocalDate getFechaDeAltaEnLaEmpresa(){return this.fechaDeAltaEnLaEmpresa; }
    public Banco getBanco(){return this.banco;}

}
