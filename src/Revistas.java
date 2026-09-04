
import java.util.ArrayList;

public class Revistas extends Cadastro {

    private static final long serialVersionUID = 1L;

    private int anoPublicacao;
    private int volume;
    private String editora;
    private ArrayList<String> assuntos;

    public Revistas() {
        super();
        this.assuntos = new ArrayList<>();
    }

    public Revistas(int ID, String nome, int dataAquisicao,
            ArrayList<String> autores,
            int anoPublicacao,
            int volume,
            String editora,
            ArrayList<String> assuntos) {

        super(ID, nome, dataAquisicao, autores);

        this.anoPublicacao = anoPublicacao;
        this.volume = volume;
        this.editora = editora;
        this.assuntos = assuntos;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public int getVolume() {
        return volume;
    }

    public String getEditora() {
        return editora;
    }

    public ArrayList<String> getAssuntos() {
        return assuntos;
    }

    @Override
    public String toString() {
        return "===== REVISTA =====\n"
                + super.toString()
                + "\nAno de publicação: " + anoPublicacao
                + "\nVolume: " + volume
                + "\nEditora: " + editora
                + "\nAssuntos: " + assuntos;
    }
}
