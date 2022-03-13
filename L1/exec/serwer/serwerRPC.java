package serwer;

import org.apache.xmlrpc.WebServer;

public class serwerRPC {
    public int echo(int x, int y) {
        return x + y;
    }
    public int echoAsync(int x) {
        System.out.println("Wywołanie asychroniczne - odliczam");
        try {
            Thread.sleep(x);
        }catch(InterruptedException exception){
            exception.printStackTrace();
            Thread.currentThread().interrupt();
        }
        System.out.println("Wywołanie asychroniczne - koniec odliczania");
        return x;
    }
    public static void main(String[] args) {
        try{
            System.out.println("Startuje serwer XML-RPC...");
            int port = 4040;
            WebServer server = new WebServer(port);
            server.addHandler("MojSerwer", new serwerRPC());
            server.start();
            System.out.println("Serwer wystartowal pomyslnie");
            System.out.println("Nasluchuje na porcie: " + port);
            System.out.println("Aby zatrzymać nacisnij ctrl+c");
        }catch(Exception exception){
            System.err.println("Serwer XML-RPC: " + exception);
        }
    }
}
