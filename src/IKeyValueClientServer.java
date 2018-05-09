import java.rmi.RemoteException;

public interface IKeyValueClientServer extends java.rmi.Remote{

    public String converterMd5(String cpf, String senha)
        throws java.rmi.RemoteException;
}
