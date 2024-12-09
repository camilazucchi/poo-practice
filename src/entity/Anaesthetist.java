package entity;

public class Anaesthetist extends Doctor {

    @Override
    public void performDelivery() {
        System.out.println("Aplicando injeção anestésica...");
        System.out.println("Relizando parto...");
    }

}
