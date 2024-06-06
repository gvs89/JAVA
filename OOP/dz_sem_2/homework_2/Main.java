public class Main {
    public static void main(String[] args) {

        Human hum = new Human();
        hum.name = "Vladimir";

        Market market = new Market();

        market.acceptToMarket(hum);
        market.takeInQueue(hum);
        market.giveOrder();
        market.takeOrder();
        market.releaseFromQueue();
        market.releaseFromMarket(hum);
        market.update();

    }
}
