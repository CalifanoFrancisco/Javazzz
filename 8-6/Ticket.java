public class Ticket{
    /*eberá permitir generar un ticket/comprobante de la operación 
    realizada indicando los datos del banco (nombre, dirección, CUIT, 
    número de sucursal, número de caja (la caja podrá ser automática o 
    atendida por una persona), los datos de la operación y el saldo restante. */
    private Registro operacion;
    private Banco banco;
    private Float saldo_restante;
    private Caja caja;
    private Cajero cajero;

    public Ticket(Banco banco,Registro registro,Caja caja,Float saldo_restante){
        this.banco = banco;
        this.operacion = registro;
        this.saldo_restante = saldo_restante;
        this.caja = caja;
        if(caja.isPersona()){
            this.cajero = caja.getCajero();
        }
    }
    public Ticket(){}
}