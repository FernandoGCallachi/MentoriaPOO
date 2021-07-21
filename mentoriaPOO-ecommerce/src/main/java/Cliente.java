import java.util.List;
import java.util.UUID;

public class Cliente {
    private final UUID clienteId;
    private final String nome;
    private final String cpf;
    private final String email;
    private final String senha;
    private final List<Pedidos> pedidos;

    public Cliente(final UUID clienteId, final String nome, final String cpf, final String email, final String senha, final List<Pedidos> pedidos) {
        this.clienteId = clienteId;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.pedidos = pedidos;
    }

    public void addPedido(Pedidos pedidos){
        this.pedidos.add(pedidos);
    }

    public UUID getClienteId() {
        return clienteId;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public List<Pedidos> getPedidos() {
        return pedidos;
    }
}
