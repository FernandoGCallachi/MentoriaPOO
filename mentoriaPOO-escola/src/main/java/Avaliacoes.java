public abstract class Avaliacoes {

    private final String tipoProva;
    private final Float nota;
    private final Disciplinas disciplinas;
    private Turmas turmas;
    private Alunos alunos;

    public Avaliacoes(final String tipoProva, final Float nota, final Disciplinas disciplinas, final Turmas turmas) {
        this.tipoProva = tipoProva;
        this.nota = nota;
        this.disciplinas = disciplinas;
        this.turmas = turmas;
    }

    public Avaliacoes(final String tipoProva, final Float nota, final Disciplinas disciplinas, final Alunos alunos) {
        this.tipoProva = tipoProva;
        this.nota = nota;
        this.disciplinas = disciplinas;
        this.alunos = alunos;
    }

    public abstract boolean aprovado(Float nota);

    public String getTipoProva() {
        return tipoProva;
    }

    public Float getNota() {
        return nota;
    }

    public Disciplinas getDisciplinas() {
        return disciplinas;
    }

    public Turmas getTurmas() {
        return turmas;
    }

    public Alunos getAlunos() {
        return alunos;
    }
}
