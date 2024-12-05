package entity;

// Representa o conceito de um cliente de biblioteca (Abstração)
public class Client {

        private String clientName;
        private String address;

    public Client(String clientName, String address) {
        this.clientName = clientName;
        this.address = address;
    }

    public String getClientName() {
        return clientName;
    }

    public String getAddress() {
        return address;
    }

}