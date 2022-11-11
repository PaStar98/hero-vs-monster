public class Attacks {

    public static int weakAttack() {
        int max = 10;
        int min = 2;
        int range = max - min + 1;
        return (int) (Math.random() * range) + min;
    }

    public static int strongAttack() {
        int max = 19;
        int min = 10;
        int range = max - min + 1;
        return (int) (Math.random() * range) + min;
    }

    public static boolean calculateHitChance() {
        int max = 99;
        int min = 0;
        int range = max - min + 1;
        int random = (int) (Math.random() * range) + min;

        return (random > 50); // is hit?
    }
}



