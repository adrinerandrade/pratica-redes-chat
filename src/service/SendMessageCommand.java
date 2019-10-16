package service;

import login.Login;
import protocol.LarcProtocol;
import protocol.LarcProtocolParams;

public class SendMessageCommand {

    public void sendMessage(int target, String content) {
        LarcProtocol larcProtocol = new LarcProtocol();
        LarcProtocolParams params = new LarcProtocolParams();
        params.add(Login.getUserId());
        params.add(Login.getPassword());
        params.add(String.valueOf(target));
        params.add(content);
        larcProtocol.send("message", params);
    }

}
