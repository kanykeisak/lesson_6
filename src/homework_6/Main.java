package homework_6;

public class Main {
    public static void main(String[] args) {
        //5.
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(150);
        Weapon bossWeapon = new Weapon();
        bossWeapon.setType(WeaponType.MAGIC);
        bossWeapon.setName("Fire Staff");
        boss.setWeapon(bossWeapon);

        boss.printInfo();
        System.out.println();


        //10.
        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(500);
        skeleton1.setDamage(50);
        skeleton1.setArrowsCount(20);
        Weapon skeletonWeapon1 = new Weapon();
        skeletonWeapon1.setType(WeaponType.RANGED);
        skeletonWeapon1.setName("Bow");
        skeleton1.setWeapon(skeletonWeapon1);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(450);
        skeleton2.setDamage(45);
        skeleton2.setArrowsCount(15);
        Weapon skeletonWeapon2 = new Weapon();
        skeletonWeapon2.setType(WeaponType.MELEE);
        skeletonWeapon2.setName("Crossbow");
        skeleton2.setWeapon(skeletonWeapon2);

        System.out.println("Skeleton 1 Info:");
        skeleton1.printInfo();
        System.out.println();
        System.out.println("Skeleton 2 Info:");
        skeleton2.printInfo();
    }
}
