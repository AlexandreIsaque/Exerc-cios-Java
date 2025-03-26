package Tabuada;

public class Tabuada {
    public static void main(String[] args) {
        tabuada(7);
    }
    public static void tabuada(int numero){
        for(int i = 0; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}
