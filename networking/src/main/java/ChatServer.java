import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

    public static void main(String[] args) {
        new ChatServer();
    }
    public ChatServer(){
        ServerSocket serv = null;
        Socket sock;
       try {
            serv = new ServerSocket(8100);
            System.out.println("Сервер запущен, ожидаем подключения...");
            sock = serv.accept();
            System.out.println("Клиент подключился");
            new Client(sock, "Сервер");
            while(true){
                if(sock.isClosed()){
                    break;
                }
            }
            serv.close();

       } catch (IOException e) {
            System.out.println("Ошибка инициализации сервера");
            } finally {
            try {
                serv.close();
                } catch (IOException e) {
                e.printStackTrace();
                }
            }

    }

}
