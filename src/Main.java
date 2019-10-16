import service.LarcService;

public class Main {

    public static void main(String[] args) {
        LarcService larcService = new LarcService();
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
