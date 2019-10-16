package service;

import model.*;
import protocol.Response;

import java.util.List;

public class LarcService {

    public Response<List<User>> getUsers() {
        return new GetUsersRequest().getUsers();
    }

    public Response<List<Player>> getPlayers() {
        return new GetPlayersRequest().getPlayers();
    }

    public Response<Message> getMessage() {
        return new GetMessageRequest().getMessage();
    }

    public Response<Card> getCard() {
        return new GetCardRequest().getCard();
    }

    public void sendGame(GameCommand command) {
        new SendGameCommand().sendGame(command);
    }

    public void sendMessage(int target, String content) {
        new SendMessageCommand().sendMessage(target, content);
    }

}
