package Week2.Exercises.Practices.GameCharacter;

public class Warrior extends Character{

    public Warrior(String name) {
        super(name, 1500, 400);
    }


    @Override
    public void attack() {
        System.out.println(name+ " saldırıyor. " + attackPower+ " hasar aldınız.");
    }

    public void shieldBlock() {
        System.out.println(name+ " kalkanını kullanarak savunma yapıyor ");
    }
}
