package ContaBancaria.teste;

import ContaBancaria.dominio.BancoCaixa;

public class bancoTeste {
    public static void main(String[] args) {
        BancoCaixa caixa = new BancoCaixa("Alexandre", 17, "584.971.058-26", 1200);
        caixa.deposito(1200);
    }
}
