
import java.util.ArrayList;

public class Dvd extends Cadastro {

    private static final long serialVersionUID = 1L;

    private String tipo;
    private String descricao;

    public Dvd() {
        super();
    }

    public Dvd(int ID, String nome, int dataAquisicao,
            ArrayList<String> autores,
            String tipo, String descricao) {

        super(ID, nome, dataAquisicao, autores);

        this.tipo = tipo;
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "===== DVD =====\n"
                + super.toString()
                + "\nTipo: " + tipo
                + "\nDescrição: " + descricao;
    }
}
