package entity;

public class Obstetrician extends Doctor {

    @Override
    public void performDelivery() {
        System.out.println("Preparando e retirando o bebê...");
        System.out.println("Realizando parto...");
    }

}
