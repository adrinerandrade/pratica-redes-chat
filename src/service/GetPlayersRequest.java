package service;

import login.Login;
import model.GameStatus;
import model.Player;
import protocol.LarcProtocol;
import protocol.LarcProtocolParams;
import protocol.Response;

import java.util.LinkedList;
import java.util.List;

import static java.lang.Integer.valueOf;

public class GetPlayersRequest {

    public Response<List<Player>> getPlayers() {
        LarcProtocol larcProtocol = new LarcProtocol();
        LarcProtocolParams params = new LarcProtocolParams();
        params.add(Login.getUserId());
        params.add(Login.getPassword());
        return larcProtocol.get("players", params)
            .map(out -> {
                List<Player> players = new LinkedList<>();
                for (int i = 0; i < out.size() / 2; i++) {
                    int index = i * 2;
                    players.add(new Player(valueOf(out.get(index)), GameStatus.valueOf(out.get(index + 1))));
                }
                return players;
            });
    }

}
