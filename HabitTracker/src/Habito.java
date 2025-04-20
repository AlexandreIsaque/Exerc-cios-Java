package HabitTracker.src;

public class Habito {
    private String nome;
    private String descricao;
    private DateManeger data;

    public Habito(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
        this.data = new DateManeger();
    }

    public DateManeger getData(){ return this.data; }
    public String getNome(){ return this.nome; }
    public String getDescricao() { return this.descricao; }
}
