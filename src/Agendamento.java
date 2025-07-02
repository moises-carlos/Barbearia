import enums.DiasSemana;

public class Agendamento {
  private final Cliente cliente;
  private final Barbeiro barbeiro;
  private final DiasSemana dia;

  public Agendamento(Cliente cliente, Barbeiro barbeiro, DiasSemana dia) {
      this.cliente = cliente;
      this.barbeiro = barbeiro;
      this.dia = dia;
  }

  public Cliente getCliente() {
      return cliente;
  }

  public DiasSemana getDia() {
      return dia;
  }
}
