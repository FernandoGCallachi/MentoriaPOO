import java.time.LocalDateTime;

public class Pacientes extends Pessoas {
    private final String sintomas;
    private final boolean convenio;
    private final Float altura;
    private final String pressao;

    public Pacientes(final String nome, final LocalDateTime dateNascimento, final String email, final String telefone, final String cpf, final String sintomas, final boolean convenio, final Float altura, final String pressao) {
        super(nome, dateNascimento, email, telefone, cpf);
        this.sintomas = sintomas;
        this.convenio = convenio;
        this.altura = altura;
        this.pressao = pressao;
    }

    public String getSintomas() {
        return sintomas;
    }

    public boolean getConvenio() {
        return convenio;
    }

    public Float getAltura() {
        return altura;
    }

    public String getPressao() {
        return pressao;
    }
}
