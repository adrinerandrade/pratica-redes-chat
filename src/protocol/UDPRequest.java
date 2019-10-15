package protocol;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPRequest {

    public void send(String input) {
        try {
            doSend(input);
        } catch (Exception ex) {
            System.err.println("Erro ao enviar requisição UDP");
            ex.printStackTrace();
        }
    }

    private void doSend(String input) throws IOException {
        byte[] content = input.getBytes();
        InetAddress ip = InetAddress.getByName(ServerInfo.HOST);
        DatagramPacket pack = new DatagramPacket(content, content.length, ip, ServerInfo.UDP_PORT);
        DatagramSocket socket = new DatagramSocket();
        socket.send(pack);
        socket.close();
    }

}
