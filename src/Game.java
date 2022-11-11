import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Piper Perri's Adventure");
        System.out.println("Version: 0.1\n\n\n");

        System.out.println("Choose your attack");
        System.out.println("1 - Weak attack");
        System.out.println("2 - Strong attack");

        Scanner scanner = new Scanner(System.in);


        while (true) {
            int playerWeakAtk = Attacks.weakAttack();
            int playerStrongAtk = Attacks.strongAttack();

            int option = scanner.nextInt();
            if (option == 1) {
                Monster.setHp(Monster.getHp() - playerWeakAtk);
                System.out.println("You attacked by " + playerWeakAtk);
                System.out.println("Monster life " + Monster.getHp());
            } else if (option == 2) {
                Monster.setHp(Monster.getHp() - playerStrongAtk);
                System.out.println("You attacked by " + playerStrongAtk);
                System.out.println("Monster life " + Monster.getHp() + "\n");
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
