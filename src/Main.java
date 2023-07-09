public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int bonusForTheTicket = service.calculate(100);
        System.out.println("Низкий:Бонус милей " + bonusForTheTicket);

        int bonusForTheTicket2 = service.calculate(500);
        System.out.println("Средний:Бонус милей " + bonusForTheTicket2);

        int bonusForTheTicket3 = service.calculate(1_000);
        System.out.println("Высокий:Бонус милей " + bonusForTheTicket3);
    }
}