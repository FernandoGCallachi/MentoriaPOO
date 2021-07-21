public class Disciplinas {

    private final String nomeDisciplina;
    private final int cargaHoraria;

    public Disciplinas(final int cargaHoraria, final String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
}
