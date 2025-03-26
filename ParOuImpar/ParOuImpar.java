package ParOuImpar;

public class ParOuImpar {
    public static void main(String[] args) {
        numero(0);
    }

    public static void numero(int numero){
        if(numero % 2 == 0){
            System.out.println(numero + " é par");
        }
        else {
            System.out.println(numero + " é impar");
        }
    }
}
