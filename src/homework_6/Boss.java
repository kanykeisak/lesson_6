package homework_6;
//4.
public class Boss extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    //6.
    public void printInfo() {
        System.out.println("Boss Info:");
        System.out.println("Health: " + getHealth() +
                ", Damage: " + getDamage() +
                ", Weapon Type: " + weapon.getType() +
                ", Weapon Name: " + weapon.getName());
    }
}
