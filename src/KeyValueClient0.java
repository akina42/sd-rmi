import java.rmi.Naming;
import java.util.Scanner;

public class KeyValueClient0 {
    public static void main(String[] args) {
        try {
            IKeyValueClientServer clientServer = (IKeyValueClientServer) Naming.lookup( "//127.0.0.1:1099/KeyValueServiceClient");
            System.out.println("\nCLIENTE 0");
            System.out.println("\nDigite seu usuário: ");
            Scanner auxCpf = new Scanner(System.in);
            String cpf = auxCpf.next();
            System.out.println("\nDigite a senha: ");
            Scanner auxSenha = new Scanner(System.in);
            String senha = auxSenha.next();
            System.out.println("Dados: " + clientServer.converterMd5(cpf, senha));
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

}
