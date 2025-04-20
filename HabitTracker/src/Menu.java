package HabitTracker.src;
import java.util.Scanner;

public class Menu {
    protected byte opcao;

    public void menu(){
        Scanner scanner = new Scanner(System.in);
        HabitoManager habitoManager = new HabitoManager();

        while(opcao != 5) {
            System.out.println("\t === Gerenciador de Habitos ===");
            System.out.println("1. Adicionar Habito");
            System.out.println("2. Marcar Habito como feito hoje");
            System.out.println("3. Ver Habitos");
            System.out.println("4. Ver Estatisticas");
            System.out.println("5. Sair e Salvar");

            opcao = scanner.nextByte();

            if(opcao != scanner.nextByte()) {
                System.out.println("apenas numeros!");
                return;
            }

            switch (opcao) {
                case 1:
                    // nome do habito
                    System.out.println("\n nome: ");
                    String nome = scanner.next();
                    // descricao do habito
                    System.out.println("\n descricao: ");
                    String descricao = scanner.next();

                    Habito habito = new Habito(nome, descricao);
                    habitoManager.adicionarHabito(habito);

                    System.out.println("\n== Habito criado com sucesso ==");
                    break;

                case 2:
                    System.out.println("== lista de Habitos ==");
                    habitoManager.marcarHabitosFeito();
                    break;

                case 3:
                    habitoManager.listarHabitos();
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Saindo....");
                    break;

                default:
                    System.out.println("Opção invalida, tente novamente!");
                    break;
            }
        }
    }
}
