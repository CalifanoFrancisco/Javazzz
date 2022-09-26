import java.util.ArrayList;
import java.util.HashSet;

public class SistemaDeRegistro implements RegistroCitaMedica, ListadoPorEspecialidad, ListarDatos{
    private ArrayList<Persona> personas;
    private HashSet<RegistroCita> registroCitas;

    @Override
    public void registrarCitaMedica(Paciente paciente, Medico medico) {
        this.registroCitas.add(new RegistroCita(medico,paciente));
    }

    @Override
    public void listado() {
        for (Especialidad i: Especialidad.values()) {
            for (int p = 0; p < personas.size(); p++) {
                Medico aux = (Medico) personas.get(p);
                if (aux.getEspecialidad() == i) {
                    aux.registrar();
                }
            }
        }
    }

    @Override
    public void listar(int codigoMedico) {
        //En la consigna nunca se pide añadir codigo medico a Medico
        for (Persona i: personas) {
            if (((Medico) i).getNumeroDeConsultorio() == codigoMedico) {
                i.registrar();
                for (Persona e: personas) {
                    if (((Paciente) e).getNumeroClinica() == codigoMedico) {
                        e.registrar();
                    }
                }
            }
        }
    }
}
