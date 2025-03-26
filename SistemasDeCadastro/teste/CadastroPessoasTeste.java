package SistemasDeCadastro.teste;
import SistemasDeCadastro.dominio.Cadastro;
import SistemasDeCadastro.dominio.Pessoas;

public class CadastroPessoasTeste{
    public static void main(String[] args) {
        Pessoas pessoa = new Pessoas("Alexandre", 17, "Xandisaque@gmail.com");
        Pessoas pessoa1 = new Pessoas("Miguel", 18, "blake98124@gmail.com");
        Cadastro cadastro = new Cadastro();

        cadastro.Adicionar(pessoa);
        cadastro.Adicionar(pessoa1);
    }
}
