import java.time.LocalDateTime;

public class Pessoas {
    private final String nome;
    private final LocalDateTime dateNascimento;
    private final String email;
    private final String telefone;
    private final String cpf;

    public Pessoas(final String nome, final LocalDateTime dateNascimento, final String email, final String telefone, final String cpf) {
        this.nome = nome;
        this.dateNascimento = dateNascimento;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public LocalDateTime getDateNascimento() {
        return dateNascimento;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }
}
