package service;

import login.Login;
import model.Message;
import protocol.LarcProtocol;
import protocol.LarcProtocolParams;
import protocol.Response;

import java.util.Optional;

import static java.lang.Integer.valueOf;

public class GetMessageRequest {

    public Response<Optional<Message>> getMessage() {
        LarcProtocol larcProtocol = new LarcProtocol();
        LarcProtocolParams params = new LarcProtocolParams();
        params.add(Login.getUserId());
        params.add(Login.getPassword());
        return larcProtocol.get("message", params)
            .map(out -> !out.isEmpty() ?
                Optional.of(new Message(valueOf(out.get(0)), out.get(1))) :
                Optional.empty());
    }

}
