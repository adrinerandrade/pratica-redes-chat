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

        larcService.sendMessage(8648, "E aí zé");

        int count = 0;
        while (count++ < 10) {
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            larcService.getUsers()
                .ifSuccess(users -> users.forEach(System.out::println));
            larcService.getPlayers()
                .ifSuccess(players -> players.forEach(System.out::println));
            larcService.getMessage()
                .ifSuccess(System.out::println);
            larcService.getCard()
                .ifSuccess(System.out::println);
        }
    }

}
