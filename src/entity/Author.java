package entity;

// Representa o conceito de um autor de livro (Abstração)
public class Author {
    /* Encapsulamento é usado aqui para esconder os detalhes de implementação
    * dos atributos de um Autor */
    private String authorName;
    private String nationality;

    // Construtor da classe Author
    // Este é um método especial chamado quando um objeto é instanciado a partir desta classe
    public Author(String authorName, String nationality) {
        // A palavra-chave 'this' é usada para se referir à instância atual do objeto
        this.authorName = authorName;
        this.nationality = nationality;
    }

    // Métodos getters (Encapsulamento) para acessar os atributos privados da classe Author
    // Estes são métodos que permitem ler o valor dos atributos privados

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
