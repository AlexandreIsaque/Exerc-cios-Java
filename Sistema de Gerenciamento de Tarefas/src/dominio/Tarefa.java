package src.dominio;

public class Tarefa {
  protected String nome;
  protected String descricao;
  protected boolean status;

  public Tarefa(String nome, String descricao, boolean status) {
    this.nome = nome;
    this.descricao = descricao;
    this.status = status;
    status();
  }

  @Override
  public String toString() {
    return "Tarefa: "
        + "\n Nome: "
        + this.nome
        + "\n Descrição: "
        + this.descricao
        + "\n Status:"
        + status();
  }

  // Status
  public String status() {
    if (status) {
      return "Concluido";
    } else {
      return "Pendente!";
    }
  }
}
