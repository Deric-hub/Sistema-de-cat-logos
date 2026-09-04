
import java.util.ArrayList;

public class Livros extends Cadastro {

    private static final long serialVersionUID = 1L;

    private String nomeEditora;
    private int anoPublicacao;

    public Livros() {
        super();
    }

    public Livros(int ID, String nome, int dataAquisicao,
            ArrayList<String> autores,
            String nomeEditora, int anoPublicacao) {

        super(ID, nome, dataAquisicao, autores);

        this.nomeEditora = nomeEditora;
        this.anoPublicacao = anoPublicacao;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "===== LIVRO =====\n"
                + super.toString()
                + "\nEditora: " + nomeEditora
                + "\nAno de publicação: " + anoPublicacao;
    }
}
