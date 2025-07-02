
import enums.EspecialidadeBarbeiro;

import java.util.Queue;

public class Barbeiro extends Pessoa implements CortarDescolorirPintar {

    private EspecialidadeBarbeiro especialidade;
    private boolean disponibilidade;

    protected Barbeiro(String nome, String cpf, int telefone, EspecialidadeBarbeiro especialidade) {
        super(nome, cpf, telefone);
        this.especialidade = especialidade;
    }

    @Override
    public void cortarCabelo(Queue<Cliente> fila) {
        if (!fila.isEmpty()) {
            Cliente cliente = fila.poll();
            System.out.println("Cortando cabelo do cliente: " + cliente.getNome());
        } else {
            aguardar();
        }
    }

    @Override
    public void descolorir() {
        System.out.println("Descolorindo cabelo...");
    }

    @Override
    public void pintar() {
        System.out.println("Pintando cabelo...");
    }

    @Override
    public void aguardar() {
        System.out.println("Sem clientes na fila. Aguardando...");
    }

    public boolean isDisponivel() {
        return disponibilidade;
    }

    public EspecialidadeBarbeiro getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(EspecialidadeBarbeiro especialidade) {
        this.especialidade = especialidade;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
