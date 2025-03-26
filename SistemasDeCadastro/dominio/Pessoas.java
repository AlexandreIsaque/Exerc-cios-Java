package SistemasDeCadastro.dominio;

public class Pessoas {
    private String nome;
    private int idade;
    private String gmail;

    public Pessoas(String nome, int idade, String gmail){
        this.nome = nome;
        this.idade = idade;
        this.gmail = gmail;
        dados();
    }

    private void dados(){
        if(nome == null || idade <= 0 || gmail == null){
            System.out.println("Dados incompletos!");
        }
    }

    public String getNome(){ return this.nome; }
    public String getGmail(){ return this.gmail; }
    public int getIdade(){ return this.idade; }
}
