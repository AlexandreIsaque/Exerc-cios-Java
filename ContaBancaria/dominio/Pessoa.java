package ContaBancaria.dominio;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String cpf;

    public Pessoa(String nome, int idade, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        dados();
    }

    public void Imprimir(){
        System.out.println("\t --- pessoa ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Cpf: " + getCpf());
    }

    private void dados(){
        if(getNome() == null || getNome() == " "){
            System.out.println("Nome incorreto, adicione!");
        }
        else if(getIdade() <= 0){
            System.out.println("Idade incorreta, adicione!");
        }
        else if(getCpf() == null || getCpf() == " "){
            System.out.println("Cpf incorreto, adicione!");
        }
    }

    public String getNome(){ return this.nome; }
    public int getIdade(){ return this.idade; }
    public String getCpf(){ return this.cpf; }
}
