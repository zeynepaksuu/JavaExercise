package Week2.Exercises.Practices.OOP.Encapsulation;

public class HospitalTest {
    public static void main (String[] args) {
        Patient patient1 = new Patient("111111");
        patient1.setAge(22);
        patient1.setName("zeynep");
        patient1.setSurname("aksu");


        Patient patient2 = new Patient("222222");
        patient2.setName("recep");
        patient2.setSurname("arslan");

        Patient patient3 = new Patient("11111111111");
        patient3.setName("recep");
        patient3.setSurname("arslan");

    }
}
