public class RegistroCita {
    private Medico medico;
    private Paciente paciente;

    public RegistroCita(Medico medico, Paciente paciente) {
        this.medico = medico;
        this.paciente = paciente;
    }
    public  RegistroCita() {
        this.medico = new Medico();
        this.paciente = new Paciente();
    }
}
