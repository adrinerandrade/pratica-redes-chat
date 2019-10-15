package protocol;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPRequest {

    public Response<String> request(String input) {
        try {
            return new Response<>(doRequest(input));
        } catch (Exception ex) {
            System.err.println("Erro ao enviar requisição TCP");
            ex.printStackTrace();
            return new Response<>(ex);
        }
    }

    private String doRequest(String input) throws IOException {
        try (Socket socket = new Socket(ServerInfo.HOST, ServerInfo.TCP_PORT)) {
            DataOutputStream dataStream = new DataOutputStream(socket.getOutputStream());
            dataStream.writeBytes(input + '\n');
            InputStreamReader stream = new InputStreamReader(socket.getInputStream());
            BufferedReader rec = new BufferedReader(stream);
            return rec.readLine();
        }
    }

}
