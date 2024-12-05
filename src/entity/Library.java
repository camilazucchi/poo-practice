package entity;

// Representa o conceito de uma biblioteca (Abstração)
// A classe Library tem uma associação com as classes Livro e Cliente
// (Associação)
// Associação é um princípio que permite que uma classe tenha uma referência a outra classe
public class Library {

    private Book book;
    private Client client;

    public Library(Book book, Client client) {
        this.book = book;
        this.client = client;
    }

    public Book getBook() {
        return book;
    }

    public Client getClient() {
        return client;
    }

    public void printInfo() {
        System.out.println("Livro: " + getBook().getTitle());
        System.out.println("Autor: " + getBook().getAuthorName());
        System.out.println("Nacionalidade do Autor: " + getBook().getNationality());
        System.out.println("Número de páginas: " + getBook().getNumOfPages());
        System.out.println("Cliente: " + getClient().getClientName());
        System.out.println("Endereço do Cliente: " + getClient().getAddress());
    }

}