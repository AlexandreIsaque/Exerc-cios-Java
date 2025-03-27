package ContaBancaria.dominio;

public class BancoCaixa extends Pessoa{
    private double dinheiro;

    public BancoCaixa(String nome, int idade, String cpf, double dinheiro){
        super(nome, idade, cpf);
        this.dinheiro = dinheiro;
    }

    public void sacar(double valor){
        if(valor <= 0 || valor == -valor){
            System.out.println("apenas valores positivos");
            return;
        }

        dinheiro -= valor;

        System.out.println("Saque: " + valor);
        System.out.println("Total na conta: " + dinheiro);
    }

    public void deposito(double valor){
        if(valor <= 0 || valor == -valor) {
            System.out.println("apenas valores positivos");
            return;
        }

        dinheiro += valor;

        System.out.println("Depositado: " + valor);
        System.out.println("Total na conta: " + dinheiro);
    }
}
