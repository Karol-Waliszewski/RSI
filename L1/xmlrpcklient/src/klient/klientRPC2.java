package klient;

import org.apache.xmlrpc.XmlRpcClient;
import org.apache.xmlrpc.XmlRpcException;

import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class klientRPC2 {
    public static String getIP(){
        Scanner in = new Scanner(System.in);
        System.out.print("Wprowadz adres IP: ");
        return in.nextLine();
    }

    public static int getPort(){
        Scanner in = new Scanner(System.in);
        System.out.print("Wprowadz port: ");
        return in.nextInt();
    }

    public static Object callServer(XmlRpcClient client, String method, Vector<Object> params) throws IOException, XmlRpcException {
        return client.execute("MojSerwer2."+method, params);
    }

    public static void callServerAsync(XmlRpcClient client, String method, Vector<Object> params, AsyncClass callback) throws IOException, XmlRpcException {
        client.executeAsync("MojSerwer2."+method, params, callback);
    }

    public static void callShow(XmlRpcClient client) throws IOException, XmlRpcException {
        String result = (String) callServer(client, "show", new Vector<>());
        System.out.println(result);
    }

    public static void main(String[] args) {
        try{
            System.out.println("Startuje klienta XML-RPC...");

            String ip = getIP();
            int port = getPort();

            XmlRpcClient client = new XmlRpcClient("http://"+ip+":"+port);
            AsyncClass callback = new AsyncClass();

            callShow(client);

            Vector<Object> temperatureParams = new Vector<Object>();
            temperatureParams.addElement(0);
            temperatureParams.addElement(true);

            callServerAsync(client, "asyncFahrenheitToCelcius", temperatureParams, callback);

            Vector<Object> echoParams = new Vector<Object>();
            echoParams.addElement("Adam");
            echoParams.addElement(21);
            echoParams.addElement(181.5);

            System.out.println(callServer(client, "echoPerson", echoParams));

        }catch(Exception exception){
            System.err.println("Klient XML-RPC: " + exception);
        }
    }
}
