import java.time.LocalDateTime;

public class Consultas {
    private final LocalDateTime dataConsulta;
    private final String especialidade;
    private final Medicos medicos;
    private final Pacientes pacientes;

    public Consultas(final LocalDateTime dataConsulta, final String especialidade, final Medicos medicos, final Pacientes pacientes) {
        this.dataConsulta = dataConsulta;
        this.especialidade = especialidade;
        this.medicos = medicos;
        this.pacientes = pacientes;
    }

    public LocalDateTime getDataConsulta() {
        return dataConsulta;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public Medicos getMedicos() {
        return medicos;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }
}
