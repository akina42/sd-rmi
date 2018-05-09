import java.rmi.Naming;

public class KeyValueClientServer {
    public KeyValueClientServer() {
        try {
            IKeyValueClientServer clientServer = new KeyValueClientServerImpl();
            Naming.rebind("//127.0.0.1:1099/KeyValueServiceClient", clientServer);
            System.out.println("\nCLIENTE / SERVIDOR");
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }
    public static void main(String args[]) {
        new KeyValueClientServer();
    }
}
