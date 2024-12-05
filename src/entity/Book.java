package entity;

// Representa o conceito de um livro (Abstração)
// Estende a classe Author, demonstrando o conceito de Herança
// Herança é um princípio que permite que uma classe herde os atributos e métodos de outra classe
public class Book extends Author {

    private String title;
    private int numOfPages;

    public Book(String name, String nationality, String title, int numOfPages) {
        // A palavra-chave 'super' é usada para chamar o construtor da classe pai
        super(name, nationality);
        this.title = title;
        this.numOfPages = numOfPages;
    }

    // Métodos getters (Encapsulamento)
    // Permitem ler o valor dos atributos privados
    public String getTitle() {
        return title;
    }

    public int getNumOfPages() {
        return numOfPages;
    }
}