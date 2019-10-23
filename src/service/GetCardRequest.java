package service;

import login.Login;
import model.Card;
import model.CardSuit;
import protocol.LarcProtocol;
import protocol.LarcProtocolParams;
import protocol.Response;

import java.util.Optional;

public class GetCardRequest {

    public Response<Optional<Card>> getCard() {
        LarcProtocol larcProtocol = new LarcProtocol();
        LarcProtocolParams params = new LarcProtocolParams();
        params.add(Login.getUserId());
        params.add(Login.getPassword());
        return larcProtocol.get("card", params)
            .map(out ->
                !out.isEmpty() ? Optional.of(new Card(out.get(0), CardSuit.valueOf(out.get(1)))) :
                Optional.empty()
            );
    }

}
