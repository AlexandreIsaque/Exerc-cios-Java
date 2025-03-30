package src.dominio;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeTarefas {
    List<String> lista = new ArrayList<>();

    public void adicionar(Tarefa tarefa){
      lista.add(tarefa.nome + " | " + tarefa.status());
        System.out.println("Tarefa adicionada!");
    }

    public void remover(int Id){
      System.out.println("tarefa removida");
      lista.remove(Id);
    }

    public void listaDeTarefas(){
      System.out.println("\t Tarefa ");

      for(String i: lista){
        System.out.println(i);
      }
    }

}
