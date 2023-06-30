public class Main {
    public static void main(String[] args) {
        int ticketPrice = 23_000;
        int bonusPrice = 20;
        int bonusMiles = ticketPrice / bonusPrice;
        System.out.println("Итоговый бонус: " + bonusMiles);
    }

}