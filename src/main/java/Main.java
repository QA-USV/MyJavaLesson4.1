public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();
        long amount = 5_000;
        long bonus = service.calculate(amount, true);
        System.out.println(bonus);
    }
}