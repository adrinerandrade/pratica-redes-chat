package protocol;

import java.io.IOException;
import java.net.Socket;

public class TCPSocketProvider {

    private static Socket socket;

    public static Socket get() throws IOException {
        if (socket == null) {
            socket = new Socket(ServerInfo.HOST, ServerInfo.TCP_PORT);
            socket.setKeepAlive(true);
            return socket;
        }
        return socket;
    }

    public static void close() {
        if (socket != null) {
            try {
                socket.close();
                socket = null;
            } catch (IOException e) {
                System.err.println("Erro ao Fechar o Socket");
                e.printStackTrace();
            }
        }
    }

}
