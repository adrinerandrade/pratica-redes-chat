package service;

import login.Login;
import model.Card;
import model.CardSuit;
import protocol.LarcProtocol;
import protocol.LarcProtocolParams;
import protocol.Response;

public class GetCardRequest {

    public Response<Card> getCard() {
        LarcProtocol larcProtocol = new LarcProtocol();
        LarcProtocolParams params = new LarcProtocolParams();
        params.add(Login.getUserId());
        params.add(Login.getPassword());
        return larcProtocol.get("message", params)
                .map(out -> new Card(out.get(0), CardSuit.valueOf(out.get(1))));
    }

}
