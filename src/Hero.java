abstract class Hero implements HavingSuperAbility {
    int health;
    int damage;
    String SuperAbility;

    public Hero(int health, int damage, String superAbility) {
        this.damage = damage;
        this.health = health;
        this.SuperAbility = superAbility;
    }
}
