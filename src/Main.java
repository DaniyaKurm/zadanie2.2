// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int score = 700;
        int replenishment = 200;
        int balance = score + replenishment;

        int bonus;
        if (balance > 1000) {
            bonus = 100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}


