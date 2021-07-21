import java.time.LocalDateTime;

public class Exames {
    private final boolean presente;
    private final String especialidadeExame;
    private final boolean jejum;
    private final LocalDateTime horaExame;
    private final Medicos medicos;
    private final Pacientes pacientes;

    public Exames(final boolean presente, final String especialidadeExame, final boolean jejum, final LocalDateTime horaExame, final Medicos medicos, final Pacientes pacientes) {
        this.presente = presente;
        this.especialidadeExame = especialidadeExame;
        this.jejum = jejum;
        this.horaExame = horaExame;
        this.medicos = medicos;
        this.pacientes = pacientes;
    }


    public boolean isPresente() {
        return presente;
    }

    public String getEspecialidadeExame() {
        return especialidadeExame;
    }

    public boolean isJejum() {
        return jejum;
    }

    public LocalDateTime getHoraExame() {
        return horaExame;
    }

    public Medicos getMedicos() {
        return medicos;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }
}
