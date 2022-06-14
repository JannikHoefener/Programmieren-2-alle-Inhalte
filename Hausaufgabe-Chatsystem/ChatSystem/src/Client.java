import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Socket socket = null;
        // Liest Daten von einer Quelle
        // Liest char vom Server
        InputStreamReader inputStreamReader = null;

        // Messages an Server senden char-based
        OutputStreamWriter outputStreamWriter=null;

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            socket = new Socket("localhost", 1234);

            inputStreamReader = new InputStreamReader(socket.getInputStream());
            outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());

            bufferedReader = new BufferedReader(inputStreamReader);
            bufferedWriter = new BufferedWriter(outputStreamWriter);

            //Input aus der Konsole / Keyboard einlesen
            Scanner scanner = new Scanner(System.in);

            while(true){
                String msgToSend = scanner.nextLine();
                bufferedWriter.write(msgToSend);
                bufferedWriter.newLine();
                bufferedWriter.flush(); //Stream

                System.out.println(bufferedReader.readLine());

                if (msgToSend.equalsIgnoreCase("QUIT"))
                    break;
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                // alles zur Sicherheit schließen
                if (socket != null)
                    socket.close();
                if (inputStreamReader != null)
                    inputStreamReader.close();
                if (outputStreamWriter != null)
                    outputStreamWriter.close();
                if (bufferedReader != null)
                    bufferedReader.close();
                if (bufferedWriter != null)
                    bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();

            }
        }


    }
}
