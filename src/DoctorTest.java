import entity.Anaesthetist;
import entity.Doctor;
import entity.Obstetrician;
import entity.Paediatrician;

public class DoctorTest {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.performDelivery();

        Anaesthetist anaesthetist = new Anaesthetist();
        anaesthetist.performDelivery();

        Obstetrician obstetrician = new Obstetrician();
        obstetrician.performDelivery();

        Paediatrician paediatrician = new Paediatrician();
        paediatrician.performDelivery();
    }
}
