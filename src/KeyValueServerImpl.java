import java.security.MessageDigest;

public class KeyValueServerImpl extends java.rmi.server.UnicastRemoteObject implements IKeyValueServer {

    public KeyValueServerImpl()
            throws java.rmi.RemoteException {
        super();
    }

    public String retornaDados(String login){

        String name = null;

        switch (login){
            case "384bb81d2fab92dadbc7b250c5c3c571":
                name = "Carlos Felipe Pires";
                break;
            case "eaaf6487137b35e5ee2274e9be882a2b":
                name = "Carolina Helena Carvalho";
                break;
            case "18372c2bf187a11e63117d8118bcf8ab":
                name = "Malu Isadora Soares";
                break;
            default:
                name = "Usuário ou senha inválidos.";
                break;
        }

        return name;

    }


}
