package App;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Piper Perri's Adventure");
        System.out.println("Version: 0.1\n\n\n");

        System.out.println("Choose your attack");
        System.out.println("1 - Weak attack");
        System.out.println("2 - Strong attack");
        System.out.println("3 - Use potion +40 HP");

        Scanner scanner = new Scanner(System.in);
        Potions healthPotion = new Potions();
        int potionAmount = 1;

        while (true) {
            int userChoose = scanner.nextInt();

            if (userChoose == 1) {
                Monster.setHp(Monster.getHp() - Attacks.weakAttack("Piper Perri"));
                System.out.println("Monster life " + Monster.getHp() + "\n");
            } else if (userChoose == 2) {
                Monster.setHp(Monster.getHp() - Attacks.strongAttack("Piper Perri"));
                System.out.println("Monster life " + Monster.getHp() + "\n");
            } else if (userChoose == 3) { // Added health potion mechanism - Potions class
                healthPotion.healthAdd(); // Added health potion mechanism - Potions class
            } else {
                System.out.println("You chose wrong option bloody bastard ;)");
                break;
            }

            if (Monster.getHp() > 0) {
                Hero.setHp(Hero.getHp() - Monster.randomiseAttackType());
                System.out.println("Your hp " + Hero.getHp());
            }

            if ((Monster.getHp()) <= 0) {
                System.out.println("You won! ");
                break;
            }

            if ((Hero.getHp()) <= 0) {
                System.out.println("You lose :/");
                break;
            }
        }
    }
}
