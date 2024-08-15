package gestor.cinema;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sessao {
  private Date dataSessao;
  private String horaSessao;
  private String estadoSessao;
  private int ingressosSessao;
  private int ingressosComprados;
  private List<Ingresso> ingressos;
  private Filme filme;
  private Sala sala;

  public Sessao(Date dataSessao, String horaSessao, Filme filme, Sala sala) {
    this.dataSessao = dataSessao;
    this.horaSessao = horaSessao;
    this.estadoSessao = "Aberta";
    this.ingressosSessao = sala.getCapacidade();
    this.ingressosComprados = 0;
    this.filme = filme;
    this.sala = sala;
    this.ingressos = new ArrayList<>();
  }

  public Date getDataSessao() {
    return dataSessao;
  }

  public void setDataSessao(Date dataSessao) {
    this.dataSessao = dataSessao;
  }

  public String getHoraSessao() {
    return horaSessao;
  }

  public void setHoraSessao(String horaSessao) {
    this.horaSessao = horaSessao;
  }

  public String getEstadoSessao() {
    return estadoSessao;
  }

  public void setEstadoSessao(String estadoSessao) {
    this.estadoSessao = estadoSessao;
  }

  public int getIngressosSessao() {
    return ingressosSessao;
  }

  public void setIngressosSessao(int ingressosSessao) {

    this.ingressosSessao = ingressosSessao;
  }

  public int getIngressosComprados() {
    return ingressosComprados;
  }

  public int getIngressosRestantes() {
    return ingressosSessao - ingressosComprados;
  }

  public void venderIngresso(Ingresso ingresso) {
    if (getIngressosRestantes() > 0) {
      ingressos.add(ingresso);
      ingressosComprados++;
      System.out.println("Ingresso vendido com sucesso!");
    } else {
      System.out.println("Não há mais ingressos disponíveis.");
    }
  }

  public void exibirSessao() {
    System.out.println("Sessão de Filme: " + filme.getTitulo());
    System.out.println("Sala: " + sala.getNomeSala() + " - Capacidade: " + sala.getCapacidade());
    System.out.println("Data: " + dataSessao);
    System.out.println("Hora: " + horaSessao);
    System.out.println("Ingressos Disponíveis: " + getIngressosRestantes());
    System.out.println("Estado da Sessão: " + estadoSessao);
  }
}
