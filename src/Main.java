// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int na_schetu = 700;
        int popolnenie = 200;
        int balans = na_schetu + popolnenie;

        int bonus;
        if (balans > 1000) {
            bonus = 100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}


