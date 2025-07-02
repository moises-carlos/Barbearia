import enums.Cortes;
import enums.EspecialidadeBarbeiro;
import java.util.*;
import enums.DiasSemana;


public class Main {
    public static void main(String[] args) {

        Queue<Cliente> fila = new LinkedList<>();

        Barbeiro barbeiro = new Barbeiro("João", "123.456.789-00", 999990000, EspecialidadeBarbeiro.TESOURA);
        Barbeiro barbeiro2 = new Barbeiro("Moisés", "222.222.222-12", 999998980, EspecialidadeBarbeiro.MAQUINA);

        Cliente cliente1 = new Cliente("Carlos", "111.222.333-44", 988881111, Cortes.CORTE_E_PINTURA);
        Cliente cliente2 = new Cliente("Lucas", "555.666.777-88", 977772222, Cortes.CORTE);
        List<Agendamento> agendamentos = new ArrayList<>();
        // Agendamento
        Agendamento agendamentoCarlos = new Agendamento(cliente1, barbeiro2, DiasSemana.QUINTA);
        agendamentos.add(agendamentoCarlos);

        // Priorizar clientes agendados na fila
        DiasSemana diaAtual = DiasSemana.QUINTA;
        List<Agendamento> agendadosHoje = new ArrayList<>();
        for (Agendamento a : agendamentos) {
            if (a.getDia() == diaAtual) {
                agendadosHoje.add(a);
            }
        }
        Collections.reverse(agendadosHoje);
        for (Agendamento a : agendadosHoje) {
            ((LinkedList<Cliente>) fila).addFirst(a.getCliente());
            System.out.println("Cliente " + a.getCliente().getNome() + " com agendamento teve prioridade na fila.");
        }


        cliente1.entrarNaFila(fila);
        cliente2.entrarNaFila(fila);
        cliente2.aguardar();
        barbeiro.cortarCabelo(fila);
        barbeiro.cortarCabelo(fila);
        barbeiro.cortarCabelo(fila);

        Cliente cliente3 = new Cliente("Maria", "999.888.777-66", 966663333, Cortes.PINTURA);
        cliente3.entrarNaFila(fila);
        barbeiro.cortarCabelo(fila);
        barbeiro.descolorir();
        barbeiro.cortarCabelo(fila);
    }
}