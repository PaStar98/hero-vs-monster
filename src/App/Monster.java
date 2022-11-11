package App;

public class Monster {
    private static int hp = 100;

    public static int getHp() {
        return hp;
    }

    public static void setHp(int hp) {
        Monster.hp = hp;
    }

    public static int randomiseAttackType() {
        int max = 99;
        int min = 0;
        int range = max - min + 1;
        int randomNumber = (int) (Math.random() * range) + min;

        int attack;

        if (randomNumber > 50) {
            attack = Attacks.weakAttack("Monster");
        } else {
            attack = Attacks.strongAttack("Monster");
        }

        return attack;
    }
}


