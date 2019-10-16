package service;

import login.Login;
import model.User;
import protocol.LarcProtocol;
import protocol.LarcProtocolParams;
import protocol.Response;

import java.util.LinkedList;
import java.util.List;

import static java.lang.Integer.valueOf;

public class GetUsersRequest {

    public Response<List<User>> getUsers() {
        LarcProtocol larcProtocol = new LarcProtocol();
        LarcProtocolParams params = new LarcProtocolParams();
        params.add(Login.getUserId());
        params.add(Login.getPassword());
        return larcProtocol.get("users", params)
            .map(out -> {
                List<User> users = new LinkedList<>();
                for (int i = 0; i < out.size() / 3; i++) {
                    users.add(new User(valueOf(out.get(i)), out.get(i + 1), valueOf(out.get(i + 2))));
                }
                return users;
            });
    }

}
