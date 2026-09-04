
import java.util.ArrayList;

public class Cds extends Cadastro {

    private static final long serialVersionUID = 1L;

    private String generoMusical;
    private ArrayList<String> nomeMusica;

    public Cds() {
        super();
        this.nomeMusica = new ArrayList<>();
    }

    public Cds(int ID, String nome, int dataAquisicao,
            ArrayList<String> autores,
            String generoMusical,
            ArrayList<String> nomeMusica) {

        super(ID, nome, dataAquisicao, autores);

        this.generoMusical = generoMusical;
        this.nomeMusica = nomeMusica;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public ArrayList<String> getNomeMusica() {
        return nomeMusica;
    }

    @Override
    public String toString() {
        return "===== CD =====\n"
                + super.toString()
                + "\nGênero musical: " + generoMusical
                + "\nFaixas: " + nomeMusica;
    }
}
