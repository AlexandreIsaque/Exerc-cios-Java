package SistemasDeCadastro.dominio;
import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    public void Adicionar(Pessoas pessoa){
        List<String> p = new ArrayList<>();
        p.add("Nome: " + pessoa.getNome() + " Idade: " + pessoa.getIdade() + " Gmail: " + pessoa.getGmail());

        for(String i: p){
            System.out.println(i.strip());
        }
    }
}
