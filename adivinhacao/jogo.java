package adivinhacao;
import java.util.Random;
import java.util.Scanner;

public class jogo {
    public static void main(String[] args) {
        Random random = new Random();
        boolean isTrueGame = false;

        // numero aleatorio
        int n = random.nextInt(1, 5);

        System.out.println("\t -- Adivinhe o numero de 1 a 5 --");

        while(isTrueGame == false){
            Scanner scanner = new Scanner(System.in);
            // numero usuario
            System.out.println("Numero: ");
            int usuario = scanner.nextInt();

            if(usuario != n){
                System.out.println("Errou");
                continue;
            }
            else{
                System.out.println("Parabens, voce acertou o numero");
                isTrueGame = true;
                break;
            }
        }
    }
}
