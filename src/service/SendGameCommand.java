package service;

import login.Login;
import model.GameCommand;
import protocol.LarcProtocol;
import protocol.LarcProtocolParams;

public class SendGameCommand {

    public void sendGame(GameCommand command) {
        LarcProtocol larcProtocol = new LarcProtocol();
        LarcProtocolParams params = new LarcProtocolParams();
        params.add(Login.getUserId());
        params.add(Login.getPassword());
        params.add(command.name());
        larcProtocol.send("game", params);
    }

}
