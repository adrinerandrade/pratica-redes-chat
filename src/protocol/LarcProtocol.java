package protocol;

import java.util.Arrays;
import java.util.List;

public class LarcProtocol {

    public Response<List<String>> get(String object, LarcProtocolParams params) {
        return new TCPRequest()
            .request(mountInput("get", object, params))
            .map(output -> Arrays.asList(output.split(":")));
    }

    public void send(String object, LarcProtocolParams params) {
        new UDPDatagram()
            .send(mountInput("send", object, params));
    }

    private String mountInput(String method, String object, LarcProtocolParams params) {
        return new StringBuilder()
            .append(method.toUpperCase())
            .append(" ")
            .append(object.toUpperCase())
            .append(" ")
            .append(params.format())
            .toString();
    }

}
