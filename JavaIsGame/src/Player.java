public class Player {
    private String name;
    private int damage;
    private int hp;
    private String weapon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public Player(String name) {
        this.name = name;
        this.damage = 10;
        this.hp = 200;
        this.weapon = "fist";
    }
}
