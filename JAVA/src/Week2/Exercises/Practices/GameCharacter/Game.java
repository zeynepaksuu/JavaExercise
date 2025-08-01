package Week2.Exercises.Practices.GameCharacter;

public class Game {
    public static void main ( String[] args){

        Warrior warrior = new Warrior("thor");
        Mage mage = new Mage("lux");
        Archer archer = new Archer("varus");

        warrior.showStats();
        mage.showStats();
        archer.showStats();

        System.out.println("karakterler saldırıyor.");
        warrior.attack();
        mage.attack();
        archer.attack();

        System.out.println("özel yetenekler");
        warrior.shieldBlock();
        mage.fireBall();
        archer.multiShot();

    }
}
