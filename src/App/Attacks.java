package App;

public class Attacks {
    public static int weakAttack(String name) {
        int damage = RandomRange.calculate(2, 10);

        return calculateChances(name, damage);
    }

    public static int strongAttack(String name) {
        int damage = RandomRange.calculate(10, 19);

        return calculateChances(name, damage);
    }

    private static boolean isNoHit() {
        int randomNumber = RandomRange.calculate(1, 100);

        return (randomNumber > 50); // 50% hit chance
    }

    private static boolean isCritical() {
        int randomNumber = RandomRange.calculate(1, 100);

        return (randomNumber < 20); // 20% critical damage chance
    }

    private static int calculateChances(String name, int damage) {
        if (isNoHit()) {
            System.out.println(name + " missed!");
            return 0;
        } else if (isCritical()) {
            System.out.println("Critical Hit!");
            damage *= 2;
        }

        System.out.println(name + " attacked by: " + damage);
        return damage; // Damage dealt -> normal: 10 - 19 | critical: 20 - 38
    }

}

// todo: think about another methods names <isNoHit, isCritical> first word should be VERB!

