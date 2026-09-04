
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Catalogo catalogo = new Catalogo();

        // =========================
        // AUTORES DO LIVRO
        // =========================
        ArrayList<String> autoresLivro = new ArrayList<>();

        autoresLivro.add("Robert C. Martin");

        // =========================
        // CRIANDO LIVRO
        // =========================
        Livros livro = new Livros(
                1,
                "Código Limpo",
                2026,
                autoresLivro,
                "Alta Books",
                2009
        );

        catalogo.adicionarItem(livro);

        // =========================
        // AUTORES DO CD
        // =========================
        ArrayList<String> autoresCd = new ArrayList<>();

        autoresCd.add("Artista Exemplo");

        // =========================
        // MÚSICAS DO CD
        // =========================
        ArrayList<String> musicas = new ArrayList<>();

        musicas.add("Musica 1");
        musicas.add("Musica 2");
        musicas.add("Musica 3");

        // =========================
        // CRIANDO CD
        // =========================
        Cds cd = new Cds(
                2,
                "Meu CD",
                2026,
                autoresCd,
                "Rock",
                musicas
        );

        catalogo.adicionarItem(cd);

        // =========================
        // CRIANDO DVD
        // =========================
        ArrayList<String> autoresDvd = new ArrayList<>();

        autoresDvd.add("Diretor Exemplo");

        Dvd dvd = new Dvd(
                3,
                "Meu DVD",
                2026,
                autoresDvd,
                "filme",
                "Descrição do filme e seus extras."
        );

        catalogo.adicionarItem(dvd);

        // =========================
        // ASSUNTOS DA REVISTA
        // =========================
        ArrayList<String> assuntos = new ArrayList<>();

        assuntos.add("Java");
        assuntos.add("Programação Orientada a Objetos");
        assuntos.add("Estruturas de Dados");

        // =========================
        // AUTORES DA REVISTA
        // =========================
        ArrayList<String> autoresRevista = new ArrayList<>();

        autoresRevista.add("Autor da Revista");

        // =========================
        // CRIANDO REVISTA
        // =========================
        Revistas revista = new Revistas(
                4,
                "Revista de Tecnologia",
                2026,
                autoresRevista,
                2026,
                10,
                "Editora Tech",
                assuntos
        );

        catalogo.adicionarItem(revista);

        // =========================
        // LISTAGENS
        // =========================
        catalogo.listarLivros();

        catalogo.listarCds();

        catalogo.listarDvds();

        catalogo.listarRevistas();

        // =========================
        // PESQUISA POR ASSUNTO
        // =========================
        catalogo.pesquisarRevistaPorAssunto(
                "programação orientada a objetos"
        );

        // =========================
        // PESQUISA POR ID
        // =========================
        Cadastro encontrado = catalogo.pesquisarPorID(3);

        if (encontrado != null) {

            System.out.println("\n===== ITEM ENCONTRADO =====");
            System.out.println(encontrado);

        } else {

            System.out.println("Item não encontrado.");
        }

        // =========================
        // SALVANDO
        // =========================
        catalogo.salvar("catalogo.dat");

        // =========================
        // CARREGANDO
        // =========================
        Catalogo novoCatalogo = Catalogo.carregar("catalogo.dat");

        System.out.println("\n===== ITENS APÓS CARREGAMENTO =====");

        novoCatalogo.listarLivros();
        novoCatalogo.listarCds();
        novoCatalogo.listarDvds();
        novoCatalogo.listarRevistas();
    }
}
