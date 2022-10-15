import java.io.IOException;
import java.net.Socket;

public class ChatClient {

    private final String SERVER_ADDR = "localhost";
    private final int SERVER_PORT = 8100;

    public ChatClient() {
        try {
            Socket sock = new Socket(SERVER_ADDR, SERVER_PORT);
            new Client(sock, "Клиент");
            while(true){
                if(sock.isClosed()){
                    break;
                }
            }
            sock.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

    public static void main(String[] args) {
        new ChatClient();
    }
}