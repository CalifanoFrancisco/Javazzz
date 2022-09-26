import java.time.LocalDate;
import java.util.ArrayList;

public class Paciente extends Persona{
    private Integer numeroClinica;
    private Sexo sexo;
    private char grupoSanguinio;
    private ArrayList<Medicamento> alergias;

    public Paciente(String nombre, String apellido, String direccion, String ciudadProcedencia, int edad, int dni, LocalDate fechaNacimiento, Integer numeroClinica, Sexo sexo, char grupoSanguinio, ArrayList<Medicamento> alergias) {
        super(nombre, apellido, direccion, ciudadProcedencia, edad, dni, fechaNacimiento);
        this.numeroClinica = numeroClinica;
        this.sexo = sexo;
        this.grupoSanguinio = grupoSanguinio;
        this.alergias = alergias;
    }

    public Paciente() {
        super();
        this.numeroClinica = 0;
        this.sexo = Sexo.HOMBRE;
        this.grupoSanguinio = 'B';
        this.alergias = new ArrayList<>();
    }

    public Integer getNumeroClinica() {
        return numeroClinica;
    }

    @Override
    public void registrar() {
        super.registrar();
        System.out.println(
            "| Numero clinica: "  + this.numeroClinica  +
            "| Sexo: "            + this.sexo           +
            "| Grupo sanguineo: " + this.grupoSanguinio +
            "| Alergias: "        + this.alergias
        );
    }
}
