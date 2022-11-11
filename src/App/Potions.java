package App;

public class Potions {
    int amountOfPotions = 1;

    void healthAdd() {
        if (amountOfPotions == 1) {
            Hero.setHp(Hero.getHp() + 40);
            System.out.println("You used health potion + 40 hp" + "\nYour hp: " + Hero.getHp() + "\n");
            amountOfPotions++;
        } else {
            System.out.println("You don't have health potion\n");
        }
    }
}






