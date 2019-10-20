import model.GameCommand;
import service.LarcService;

public class Main {

    public static void main(String[] args) {
        try (LarcService larcService = new LarcService()) {
            execute(larcService);
        }
    }

    private static void execute(LarcService larcService) {
        larcService.sendGame(GameCommand.ENTER);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        larcService.getUsers()
            .ifSuccess(users -> users.forEach(System.out::println));
        larcService.getPlayers()
            .ifSuccess(users -> users.forEach(System.out::println));
        larcService.getMessage()
            .ifSuccess(System.out::println);
        larcService.getCard()
            .ifSuccess(System.out::println);
    }

}
