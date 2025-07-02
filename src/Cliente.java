import enums.Cortes;

import java.util.Queue;

public class Cliente extends Pessoa {

    private Cortes estiloCorte;
    
    public Cortes getEstiloCorte() {
        return estiloCorte;
    }

    public void setEstiloCorte(Cortes estiloCorte) {
        this.estiloCorte = estiloCorte;
    }

    public Cliente(String nome, String cpf, int telefone, Cortes estiloCorte) {
        super(nome, cpf, telefone);

        this.estiloCorte = estiloCorte;
    }


    public Queue<Cliente>  entrarNaFila(Queue<Cliente> fila) {
        fila.add(this);
        System.out.println( "Cliente: " + this.getNome() + " entrou na fila. Posição: " + fila.size());
        return fila;
    }

    @Override
    public void aguardar() {
        System.out.println( "Cliente: " + this.getNome() + " aguardando...");
    }

}
