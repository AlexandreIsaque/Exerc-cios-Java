package HabitTracker.src;
import java.util.ArrayList;
import java.util.Scanner;

public class HabitoManager{
    ArrayList<Habito> list = new ArrayList<>();

    // adiciona habitos
    public void adicionarHabito(Habito habito){
        list.add(habito);
    }

    // lista os habitos
    public void listarHabitos(){
        if (list.isEmpty()) {
            System.out.println("Nenhum hábito cadastrado.");
        } else {
            for (Habito h : list) {
                System.out.println("\nNome: " + h.getNome());
                System.out.println("Descrição: " + h.getDescricao());
                System.out.println("Data: " + h.getData().data());
            }

        }
    }

    // marca os habitos como concluido ou pendente
    public void marcarHabitosFeito(){
        if(list.isEmpty()){
            System.out.println("nenhum habito feito");
        }

        Scanner scanner = new Scanner(System.in);

        for(Habito h: list){
            System.out.println("\n nome: " + h.getNome());
        }

        System.out.println("== digite o nome do Habito ==");
        String nameHabito = scanner.next();

        System.out.println("== adicionar ==");
        System.out.println("\n 1.Concluido.");
        System.out.println("\n 2.Pendente.");

        byte opcao = scanner.nextByte();

        switch (opcao){
            case 1:


                break;
            default:
                System.out.println("nenhuma opcao valida!");
        }

    }
}
