public class Prontuarios {
    private final String observacao;
    private final Medicos medicos;
    private final Pacientes pacientes;

    public Prontuarios(final String observacao, final Medicos medicos, final Pacientes pacientes) {
        this.observacao = observacao;
        this.medicos = medicos;
        this.pacientes = pacientes;
    }

    public String getObservacao() {
        return observacao;
    }

    public Medicos getMedicos() {
        return medicos;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }
}
