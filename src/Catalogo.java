
import java.io.*;
import java.util.ArrayList;

public class Catalogo implements Serializable {

    private static final long serialVersionUID = 1L;

    private ArrayList<Cadastro> itens;

    public Catalogo() {
        itens = new ArrayList<>();
    }

    // Adiciona um item ao catálogo
    public void adicionarItem(Cadastro item) {
        itens.add(item);
    }

    // Lista todos os livros
    public void listarLivros() {
        System.out.println("\n===== LISTA DE LIVROS =====");

        for (Cadastro item : itens) {
            if (item instanceof Livros) {
                System.out.println(item);
                System.out.println();
            }
        }
    }

    // Lista todos os CDs
    public void listarCds() {
        System.out.println("\n===== LISTA DE CDS =====");

        for (Cadastro item : itens) {
            if (item instanceof Cds) {
                System.out.println(item);
                System.out.println();
            }
        }
    }

    // Lista todos os DVDs
    public void listarDvds() {
        System.out.println("\n===== LISTA DE DVDS =====");

        for (Cadastro item : itens) {
            if (item instanceof Dvd) {
                System.out.println(item);
                System.out.println();
            }
        }
    }

    // Lista todas as revistas
    public void listarRevistas() {
        System.out.println("\n===== LISTA DE REVISTAS =====");

        for (Cadastro item : itens) {
            if (item instanceof Revistas) {
                System.out.println(item);
                System.out.println();
            }
        }
    }

    // Pesquisa revista por assunto
    public void pesquisarRevistaPorAssunto(String assunto) {

        System.out.println("\n===== RESULTADO DA PESQUISA =====");

        for (Cadastro item : itens) {

            if (item instanceof Revistas) {

                Revistas revista = (Revistas) item;

                for (String assuntoRevista : revista.getAssuntos()) {

                    if (assuntoRevista.toLowerCase()
                            .contains(assunto.toLowerCase())) {

                        System.out.println(revista);
                        System.out.println();
                        break;
                    }
                }
            }
        }
    }

    // Pesquisa item pelo ID
    public Cadastro pesquisarPorID(int ID) {

        for (Cadastro item : itens) {

            if (item.getID() == ID) {
                return item;
            }
        }

        return null;
    }

    // Salva o catálogo no disco
    public void salvar(String arquivo) {

        try (ObjectOutputStream out
                = new ObjectOutputStream(new FileOutputStream(arquivo))) {

            out.writeObject(this);

            System.out.println("Catálogo salvo com sucesso!");

        } catch (IOException e) {

            System.out.println("Erro ao salvar o catálogo.");
            e.printStackTrace();
        }
    }

    // Recupera o catálogo do disco
    public static Catalogo carregar(String arquivo) {

        try (ObjectInputStream in
                = new ObjectInputStream(new FileInputStream(arquivo))) {

            Catalogo catalogo = (Catalogo) in.readObject();

            System.out.println("Catálogo carregado com sucesso!");

            return catalogo;

        } catch (IOException | ClassNotFoundException e) {

            System.out.println("Não foi possível carregar o catálogo.");

            return new Catalogo();
        }
    }
}
