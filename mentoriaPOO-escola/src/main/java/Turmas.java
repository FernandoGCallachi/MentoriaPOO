import java.util.List;

public class Turmas {

    private final String turma;
    private final List<Alunos> alunos;

    public Turmas(final String turma, final List<Alunos> alunos) {
        this.turma = turma;
        this.alunos = alunos;
    }

    public String getTurma() {
        return turma;
    }

    public List<Alunos> getAlunos() {
        return alunos;
    }
}
