package M3_Ass7;

public class yahtzee {
    public static void main(String args[]) {
        System.out.println(dice_count());
    }

    public static int rollDice() {
        double number = Math.random();
        number *= 6;
        number += 1;
        return (int) number;
    }

    public static int dice_count() {
        int dice1 = rollDice(), dice2 = rollDice(), dice3 = rollDice(), dice4 = rollDice(), dice5 = rollDice(), count = 1;
        while (!(dice1 == dice2 && dice2 == dice3 && dice3 == dice4 && dice4 == dice5)) {
            dice1 = rollDice();
            dice2 = rollDice();
            dice3 = rollDice();
            dice4 = rollDice();
            dice5 = rollDice();
            count += 1;
        }
        return count;
    }
}

