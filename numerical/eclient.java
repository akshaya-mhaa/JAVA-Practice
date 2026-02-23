import java.io.*;
import java.net.*;

public class eclient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8080);
             BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

            System.out.println("Connected to server. Type 'exit' to quit.");

            String msg;
            while (true) {
                System.out.print("You: ");
                msg = keyboard.readLine();
                out.println(msg);
                if (msg.equalsIgnoreCase("exit")) break;
                System.out.println("Server: " + in.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}