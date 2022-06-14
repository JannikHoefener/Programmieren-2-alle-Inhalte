import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        Socket socket = null;
        // Liest Daten von einer Quelle
        // Liest char von den Clients
        InputStreamReader inputStreamReader = null;
        // Messages die Clients senden char-based
        OutputStreamWriter outputStreamWriter=null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        //wartet auf anmeldung auf den Port
        ServerSocket serverSocket = null;
        serverSocket = new ServerSocket(1234);

        while(true){
            try {
                // erlauben, dass sich ein Client verbindet mit dem Server
                socket = serverSocket.accept();

                inputStreamReader = new InputStreamReader(socket.getInputStream());
                outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());

                bufferedReader = new BufferedReader(inputStreamReader);
                bufferedWriter = new BufferedWriter(outputStreamWriter);

                while (true) {
                    String msgFromClient = bufferedReader.readLine();
                    System.out.println("Client: " +msgFromClient);

                    bufferedWriter.write("MSG recieved: ");
                    bufferedWriter.newLine();
                    bufferedWriter.flush();

                    if (msgFromClient.equalsIgnoreCase("QUIT"))
                        break;

                }

                // alles Schließen um "Resourcen" wieder frei zugeben
                socket.close();
                inputStreamReader.close();
                outputStreamWriter.close();
                bufferedReader.close();
                bufferedWriter.close();


            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
