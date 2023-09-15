import infra.factories.GameRoundControlerFactory;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        GameRoundControlerFactory.createInstance().Play(3);
    }
}
