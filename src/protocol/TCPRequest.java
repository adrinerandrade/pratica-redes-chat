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

    private String doRequest(String input) throws IOException, InvalidLarcMessageException {
        try (Socket socket = new Socket(ServerInfo.HOST, ServerInfo.TCP_PORT)) {
            DataOutputStream dataStream = new DataOutputStream(socket.getOutputStream());
            dataStream.write((input + '\n').getBytes());

            InputStreamReader stream = new InputStreamReader(socket.getInputStream());
            BufferedReader rec = new BufferedReader(stream);
            String output = rec.readLine();
            validateOutput(output);
            return output;
        }
    }

    private void validateOutput(String output) throws InvalidLarcMessageException {
        if ("Mensagem inválida!".equals(output))
            throw new InvalidLarcMessageException();
    }

}
