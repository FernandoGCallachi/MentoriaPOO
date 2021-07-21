import java.util.UUID;

public class Professores extends Pessoas {

    private final int registro;
    private final String formacao;
    private final boolean status;
    private final Disciplinas disciplinas;

    public Professores(final UUID id, final String nome, final String email, final String cpf, final int registro, final String formacao, final boolean status, final Disciplinas disciplinas) {
        super(id, nome, email, cpf);
        this.registro = registro;
        this.formacao = formacao;
        this.status = status;
        this.disciplinas = disciplinas;
    }

    @Override
    public boolean ativo() {
        return this.status;
    }

    public Avaliacoes aplicarProva(final String tipoAvaliacao, final Float nota, final Disciplinas disciplinas, final  Turmas turmas) {
        return new Avaliacoes(tipoAvaliacao, nota, disciplinas, turmas) {
            @Override
            public boolean aprovado(final Float nota) {
                return nota > 7;
            }
        };
    }

    public int getRegistro() {
        return registro;
    }

    public String getFormacao() {
        return formacao;
    }

    public Disciplinas getDisciplinas(){
        return disciplinas;
    }

    public boolean getStatus() {
        return status;
    }
}
