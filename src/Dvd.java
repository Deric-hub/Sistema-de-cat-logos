public class Dvd extends Cadastro{
    private String tipo; //musical, filme ou dados
    private String descricao; //Recebe uma descrição geral do dvd escolhido

    public void Dvd(){}
    public void Dvd(String tipo, String descricao){
        this.tipo = tipo;
        this.descricao = descricao;
    }
    
}
