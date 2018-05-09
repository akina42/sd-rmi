import java.rmi.RemoteException;

public interface IKeyValueServer extends java.rmi.Remote{
    public String retornaDados(String login)
            throws java.rmi.RemoteException;
}
