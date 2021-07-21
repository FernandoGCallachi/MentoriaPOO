import java.time.LocalDateTime;
import java.util.List;

public class Medicos extends Pessoas {
    private final String formacao;
    private final String especializacao;
    private final String crm;
    private final int cargaHoraria;

    public Medicos(final String nome, final LocalDateTime dateNascimento, final String email, final String telefone, final String cpf, final String formacao, final String especializacao, final String crm, final int cargaHoraria) {
        super(nome, dateNascimento, email, telefone, cpf);
        this.formacao = formacao;
        this.especializacao = especializacao;
        this.crm = crm;
        this.cargaHoraria = cargaHoraria;
    }

    public Exames marcarExame(boolean presente, String especialidadeExame, boolean jejum, LocalDateTime haraExame, final Pacientes pacientes, final Medicos medicos) {
        return new Exames(presente, especialidadeExame, jejum, haraExame, medicos, pacientes);
    }

    public Consultas marcarconsulta(LocalDateTime data, String especialidade, final Pacientes pacientes, final Medicos medicos) {
        return new Consultas(data, especialidade, medicos, pacientes);
    }

    public Prontuarios fazerProntuario(String observacao, final Pacientes pacientes, final Medicos medicos) {
        return new Prontuarios(observacao, medicos, pacientes);
    }

    public Receitas receitarMedicamento(String prescricao, List<Medicamentos> medicamentos, final Pacientes pacientes, final Medicos medicos) {
        return new Receitas(prescricao, medicamentos, medicos, pacientes);
    }

    public String getFormacao() {
        return formacao;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public String getCrm() {
        return crm;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
}
