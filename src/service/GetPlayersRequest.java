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
                    players.add(new Player(valueOf(out.get(i)), GameStatus.valueOf(out.get(i + 1))));
                }
                return players;
            });
    }

}
