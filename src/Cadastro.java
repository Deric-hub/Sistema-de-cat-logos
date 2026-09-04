
import java.io.Serializable;
import java.util.ArrayList;

public class Cadastro implements Serializable {

    private static final long serialVersionUID = 1L;

    private int ID;
    private String nome;
    private int dataAquisicao;
    private ArrayList<String> autores;

    public Cadastro() {
        this.autores = new ArrayList<>();
    }

    public Cadastro(int ID, String nome, int dataAquisicao, ArrayList<String> autores) {
        this.ID = ID;
        this.nome = nome;
        this.dataAquisicao = dataAquisicao;
        this.autores = autores;
    }

    public int getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public int getDataAquisicao() {
        return dataAquisicao;
    }

    public ArrayList<String> getAutores() {
        return autores;
    }

    @Override
    public String toString() {
        return "ID: " + ID
                + "\nNome: " + nome
                + "\nData de aquisição: " + dataAquisicao
                + "\nAutores: " + autores;
    }
}
