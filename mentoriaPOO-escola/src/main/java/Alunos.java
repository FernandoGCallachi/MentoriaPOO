import java.util.UUID;

public class Alunos extends Pessoas {

    private final String curso;
    private final int RA;
    private final int periodo;
    private final boolean status;
    private final Turmas turmas;

    public Alunos(final String nome, final String email, final String cpf, final String curso, final int ra, final int periodo, final boolean status, final Turmas turmas) {
        super(UUID.randomUUID(), nome, email, cpf);
        this.curso = curso;
        RA = ra;
        this.periodo = periodo;
        this.status = status;
        this.turmas = turmas;
    }

    public Avaliacoes fazerProva(final String tipoProva, final Float nota, final Disciplinas disciplinas, final Alunos alunos){
        return new Avaliacoes(tipoProva,nota, disciplinas, alunos) {
            @Override
            public boolean aprovado(Float nota) {
                return nota>= 7;
            }
        };
    }

    @Override
    public boolean ativo() {return this.status;}

    public String getCurso() {
        return curso;
    }

    public int getRA() {
        return RA;
    }

    public int getPeriodo() {
        return periodo;
    }

    public Turmas getTurmas() {
        return turmas;
    }

    public boolean getStatus() {
        return status;
    }
}
