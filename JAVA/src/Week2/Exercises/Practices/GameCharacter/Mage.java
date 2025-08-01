package Week2.Exercises.Practices.GameCharacter;

public class Mage extends Character{

    public Mage(String name) {
        super(name, 900, 240);
    }


    @Override
    public void attack() {
        System.out.println(name + " büyü yapıyor." +attackPower+ " hasar aldınız");
    }

    public void fireBall() {
        System.out.println(name + " ateş topu büyüsü yapıyor ");
    }
}
