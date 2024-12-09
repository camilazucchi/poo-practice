package entity;

public class Paediatrician extends Doctor {

    @Override
    public void performDelivery() {
        System.out.println("Verificando a saúde do recém-nascido...");
        System.out.println("Realizando parto...");
    }
}
