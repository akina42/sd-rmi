import java.rmi.Naming;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class KeyValueClientServerImpl extends java.rmi.server.UnicastRemoteObject implements IKeyValueClientServer{
    public KeyValueClientServerImpl()
            throws java.rmi.RemoteException {
        super();
    }

    public String converterMd5(String cpf, String senha)
            throws java.rmi.RemoteException {
        String name = null;
        try{
            String login = cpf + senha;
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(login.getBytes());
            byte[] hashMd5 = md.digest();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < hashMd5.length; i++) {
                sb.append(Integer.toString((hashMd5[i] & 0xff) + 0x100, 16).substring(1));
            }

            try{
                IKeyValueServer server = (IKeyValueServer) Naming.lookup("//127.0.0.1:1099/KeyValueService");
                name = server.retornaDados(sb.toString());
            }
            catch (Exception e){
                System.out.println("Erro: " + e);
            }

        }
        catch(NoSuchAlgorithmException e){
            return null;
        }
        return name;
    }

}
