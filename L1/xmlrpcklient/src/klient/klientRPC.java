package klient;
import org.apache.xmlrpc.WebServer;
import org.apache.xmlrpc.XmlRpcClient;

import java.util.Scanner;
import java.util.Vector;

public class klientRPC {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System.in);
            System.out.print("Wprowadz adres IP: ");
            String ip = in.nextLine();
            System.out.println("Startuje klienta XML-RPC...");
            int port = 4040;
            AsyncClass callback = new AsyncClass();
            XmlRpcClient client = new XmlRpcClient("http://"+ip+":"+port);
            Vector<Integer> params = new Vector<Integer>();
            params.addElement(13);
            params.addElement(21);
            Vector<Integer> params2 = new Vector<Integer>();
            params2.addElement(3000);
            client.executeAsync("MojSerwer.echoAsync", params2, callback);
            System.out.println("Wywolano asynchronicznie");
            Object result = client.execute("MojSerwer.echo", params);
            System.out.println("Wynik operacji sychronicznej: " + ((Integer)result).intValue());

        }catch(Exception exception){
            System.err.println("Klient XML-RPC: " + exception);
        }
    }

}
