package Week2.Exercises.Practices.GameCharacter;

public class Character {
    protected String name;
    protected int health;
    protected int attackPower;

    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }




    public void attack() {
        System.out.println(name + "karakteri saldırıyor. " + attackPower + " hasar aldınız.");
  }

  public void showStats() {
      System.out.println("Adı: " +name);
      System.out.println("Sağlık: " +health);
      System.out.println("Saldırı gücü: " +attackPower);
  }
}
