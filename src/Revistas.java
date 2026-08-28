public class Revistas extends Cadastro {
    private int anoPublicacao;
    private int volume;
    private String editora;
    private String publicoAlvo;

    public void Revistas(){}
    public void Revistas(int anoPublicacao, int volume, String editora, String publicoAlvo){
        this.anoPublicacao = anoPublicacao;
        this.volume = volume;
        this.editora = editora;
        this.publicoAlvo = publicoAlvo;
    }

    
}
