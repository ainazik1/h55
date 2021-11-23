public class Hero {
private int heals;
private int damage;
private int superpower;

  public Hero (int heals,int damage,int superpower) {
      this.heals = heals;
      this.damage = damage;
        this.superpower = superpower;
    }


    public int getHeals() {
        return heals;
    }

    public int getDamage() {
        return damage;
    }

    public int getSuperpower() {
        return superpower;
    }

    public Hero(int heals, int damage) {
        this.heals = heals;
        this.damage = damage;


    }
}
