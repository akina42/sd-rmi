import java.rmi.Naming;
import java.util.Scanner;


public class KeyValueServer {
    public KeyValueServer() {
        try {
            IKeyValueServer server = new KeyValueServerImpl();
            Naming.rebind("//127.0.0.1:1099/KeyValueService", server);
            System.out.println("\nSERVIDOR");
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }
    public static void main(String args[]) {
        new KeyValueServer();
    }
}
