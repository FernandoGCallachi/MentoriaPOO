import java.util.List;

public class Receitas {
    private final String prescricao;
    private final List<Medicamentos> medicamentos;
    private final Medicos medicos;
    private final Pacientes pacientes;

    public Receitas(final String prescricao, final List<Medicamentos> medicamentos, final Medicos medicos, final Pacientes pacientes) {
        this.prescricao = prescricao;
        this.medicamentos = medicamentos;
        this.medicos = medicos;
        this.pacientes = pacientes;
    }

    public String getprescricao() {
        return prescricao;
    }

    public List<Medicamentos> getCompontente() {
        return medicamentos;
    }

    public String getPrescricao() {
        return prescricao;
    }

    public Medicos getMedicos() {
        return medicos;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }
}
