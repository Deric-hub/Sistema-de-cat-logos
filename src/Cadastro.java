public class Cadastro {
    private int ID;
    private String nome;
    private int dataAquisicao;
    private String autores;


    public void Cadastro() {}

    public void Cadastro(int ID, String nome, int dataAquisicao, String autores) {
        this.ID = ID;
        this.nome = nome;
        this.dataAquisicao = dataAquisicao;
        this.autores = autores;
    }

    
}
