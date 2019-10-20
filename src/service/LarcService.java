package service;

import model.*;
import protocol.Response;
import protocol.TCPSocketProvider;

import java.io.Closeable;
import java.util.List;
import java.util.Optional;

public class LarcService implements Closeable {

    public LarcService() {
        try {
            TCPSocketProvider.get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Response<List<User>> getUsers() {
        return new GetUsersRequest().getUsers();
    }

    public Response<List<Player>> getPlayers() {
        return new GetPlayersRequest().getPlayers();
    }

    public Response<Optional<Message>> getMessage() {
        return new GetMessageRequest().getMessage();
    }

    public Response<Optional<Card>> getCard() {
        return new GetCardRequest().getCard();
    }

    public void sendGame(GameCommand command) {
        new SendGameCommand().sendGame(command);
    }

    public void sendMessage(int target, String content) {
        new SendMessageCommand().sendMessage(target, content);
    }

    @Override
    public void close() {
        TCPSocketProvider.close();
    }

}
