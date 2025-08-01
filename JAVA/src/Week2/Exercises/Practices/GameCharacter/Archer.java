package Week2.Exercises.Practices.GameCharacter;

public class Archer extends Character{

    public Archer(String name) {
        super(name, 1000, 350);
    }

    @Override
    public void attack() {
        System.out.println(name+ " ok fırlatıyor." + attackPower + " hasar aldınız.");
    }

    public void multiShot() {
        System.out.println(name+ " 3 ok birden fırlattı");
    }
}
