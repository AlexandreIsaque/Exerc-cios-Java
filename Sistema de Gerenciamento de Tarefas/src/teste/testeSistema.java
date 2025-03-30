package src.teste;
import src.dominio.GerenciadorDeTarefas;
import src.dominio.Tarefa;

public class testeSistema {
  public static void main(String[] args) {
    Tarefa tarefa = new Tarefa("Xadrez", "estudar finais", true);
    GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();

    gerenciador.adicionar(tarefa);
    gerenciador.listaDeTarefas();

    gerenciador.remover(0);

    gerenciador.listaDeTarefas();
  }

}
