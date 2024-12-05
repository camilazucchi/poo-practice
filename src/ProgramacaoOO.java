import entity.Author;
import entity.Book;
import entity.Client;
import entity.Library;

// As entidades passaram por conceitos como Abstração, Encapsulamento e Associação
public class ProgramacaoOO {
    public static void main(String[] args) {
        System.out.println("- Classe principal para teste de Library -");
        Author author = new Author("George Orwell", "Britânico");
        // Nome do livro, nome do autor, nacionalidade do autor e número de páginas do livro
        Book book = new Book("1984", author.getAuthorName(), author.getNationality(), 328);
        Client client = new Client("Camila", "Rua Amarelinha, 123");
        Library library = new Library(book, client);

        // Chama o método para exibir as informações
        library.printInfo();
    }
}
