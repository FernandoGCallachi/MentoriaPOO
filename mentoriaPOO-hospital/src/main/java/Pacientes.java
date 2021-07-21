import java.time.LocalDateTime;

public class Pacientes extends Pessoas {
    private final String simtomas;
    private final boolean convenio;
    private final Float altura;
    private final String pressao;

    public Pacientes(final String nome, final LocalDateTime dateNascimento, final String email, final String telefone, final String cpf, final String simtomas, final boolean convenio, final Float altura, final String pressao) {
        super(nome, dateNascimento, email, telefone, cpf);
        this.simtomas = simtomas;
        this.convenio = convenio;
        this.altura = altura;
        this.pressao = pressao;
    }

    public String getSimtomas() {
        return simtomas;
    }

    public boolean isConvenio() {
        return convenio;
    }

    public Float getAltura() {
        return altura;
    }

    public String getPressao() {
        return pressao;
    }
}
