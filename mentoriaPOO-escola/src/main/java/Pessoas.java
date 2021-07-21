import java.util.UUID;

public abstract class Pessoas {

    private final UUID id;
    private final String nome;
    private final String email;
    private final String cpf;

    public Pessoas(UUID id, final String nome, final String email, final String cpf) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public abstract boolean ativo();

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }
}
