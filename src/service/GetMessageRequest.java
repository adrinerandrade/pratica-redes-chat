package service;

import login.Login;
import model.Message;
import protocol.LarcProtocol;
import protocol.LarcProtocolParams;
import protocol.Response;

import static java.lang.Integer.valueOf;

public class GetMessageRequest {

    public Response<Message> getMessage() {
        LarcProtocol larcProtocol = new LarcProtocol();
        LarcProtocolParams params = new LarcProtocolParams();
        params.add(Login.getUserId());
        params.add(Login.getPassword());
        return larcProtocol.get("message", params)
            .map(out -> new Message(valueOf(out.get(0)), out.get(1)));
    }

}
